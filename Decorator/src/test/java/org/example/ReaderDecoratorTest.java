package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ReaderDecoratorTest {
    IFileReader reader = new IFileReader() {
        @Override
        public ByteArrayOutputStream read() throws IOException {
            return null;
        }

        @Override
        public boolean open(String filename) throws IOException {
            return false;
        }
    };
    ReaderDecorator readerDecorator = new ReaderDecorator() {
        @Override
        protected ByteArrayOutputStream process(ByteArrayOutputStream readerStream) {
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

    @Test
    void logDependencyAdding() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Assertions.assertEquals(null, getLogDependencyAdding().invoke(readerDecorator, reader, "constructor"));
    }

    private Method getLogDependencyAdding() throws NoSuchMethodException {
        Method method = ReaderDecorator.class.getDeclaredMethod("logDependencyAdding", IFileReader.class, String.class);
        method.setAccessible(true);
        return method;
    }
}