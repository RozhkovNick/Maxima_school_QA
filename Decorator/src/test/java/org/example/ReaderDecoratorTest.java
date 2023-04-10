package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

class ReaderDecoratorTest {
    ReaderDecorator readerDecorator = new ReaderDecorator() {
        @Override
        protected ByteArrayOutputStream process(ByteArrayOutputStream readerStream) throws IOException {
            return null;
        }
        @Override
        protected boolean preProcess(String filename) {
            return false;
        }
    };

    @Test
    void open() throws IOException {
        boolean actual = readerDecorator.open("ToRead.txt");
        Assertions.assertEquals(false, actual);
    }

    @Test
    void read() throws IOException {
        ByteArrayOutputStream actual = readerDecorator.read();
        Assertions.assertEquals(null, actual);
    }
}