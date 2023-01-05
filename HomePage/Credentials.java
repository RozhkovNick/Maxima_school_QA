public class Credentials {
    private String login;
    private String password;
    private String phone;
    private String code;

    public Credentials(String login, String password) {
        System.out.println("Credentials constructor call with parameters: " + login + ", " + password);
        this.login = login;
        this.password = password;
    }

    public Credentials(String login, String password, String phone, String code) {
        System.out.println("Credentials constructor call with parameters: " +
                login + ", " + password + ", " + phone + ", " + code);

        this.login = login;
        this.password = password;
        this.phone = phone;
        this.code = code;
    }

    public String getLogin() {
        System.out.println("Credentials getLogin call: " + login);
        return login;
    }

    public String getPassword() {
        System.out.println("Credentials getPassword call: " + password);
        return password;
    }

    public String getPhone() {
        System.out.println("Credentials getPhone call: " + phone);
        return phone;
    }

    public String getCode() {
        System.out.println("Credentials getCode call: " + code);
        return code;
    }
}

