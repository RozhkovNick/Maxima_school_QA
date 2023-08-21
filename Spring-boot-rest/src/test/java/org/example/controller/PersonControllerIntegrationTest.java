package org.example.controller;

import org.example.dao.PersonRepository;
import org.example.model.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)

public class PersonControllerIntegrationTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private PersonRepository repository;

    @AfterEach
    public void resetDb() {
        repository.deleteAll();
    }

    @Test
    public void whenCreatePerson_thenStatus201() {

        Person person = new Person("Michail");
        ResponseEntity<Person> response = restTemplate.postForEntity("/persons", person, Person.class);

        assertThat(response.getStatusCode(), is(HttpStatus.CREATED));
        assertThat(response.getBody().getId(), notNullValue());
        assertThat(response.getBody().getName(), is("Michail"));
    }

    @Test
    public void givenPerson_whenGetPerson_thenStatus200() {

        long id = createTestPerson("Joe").getId();
        Person person = restTemplate.getForObject("/persons/{id}", Person.class, id);
        assertThat(person.getName(), is("Joe"));
    }

    @Test
    public void whenUpdatePerson_thenStatus200() {

        long id = createTestPerson("Nick").getId();
        Person person = new Person("Michail");
        HttpEntity<Person> entity = new HttpEntity<Person>(person);

        ResponseEntity<Person> response = restTemplate.exchange("/persons/{id}", HttpMethod.PUT, entity, Person.class,
                id);
        assertThat(response.getStatusCode(), is(HttpStatus.OK));
        assertThat(response.getBody().getId(), notNullValue());
        assertThat(response.getBody().getName(), is("Michail"));
    }

    @Test
    public void givenPerson_whenDeletePerson_thenStatus200() {

        long id = createTestPerson("Nick").getId();
        ResponseEntity<Person> response = restTemplate.exchange("/persons/{id}", HttpMethod.DELETE, null, Person.class,
                id);
        assertThat(response.getStatusCode(), is(HttpStatus.OK));
        assertThat(response.getBody().getId(), is(id));
        assertThat(response.getBody().getName(), is("Nick"));
    }

    @Test
    public void givenPersons_whenGetPersons_thenStatus200() {
        createTestPerson("Joe");
        createTestPerson("Jane");
        ResponseEntity<List<Person>> response = restTemplate.exchange("/persons", HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Person>>() {
                });
        List<Person> persons = response.getBody();
        assertThat(persons, hasSize(2));
        assertThat(persons.get(1).getName(), is("Jane"));
    }

    private Person createTestPerson(String name) {
        Person emp = new Person(name);
        return repository.save(emp);
    }
}
