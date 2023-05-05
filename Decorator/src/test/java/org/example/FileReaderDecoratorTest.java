package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderDecoratorTest {

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
    FileReaderDecorator decorator = new FileReaderDecorator(reader);
    ByteArrayOutputStream stream = new ByteArrayOutputStream();

    @Test
    void preProcess() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Assertions.assertEquals(true, getPreProcess().invoke(decorator, "ToRead.txt"));
    }

    private Method getPreProcess() throws NoSuchMethodException {
        Method method = FileReaderDecorator.class.getDeclaredMethod("preProcess", String.class);
        method.setAccessible(true);
        return method;
    }

    @Test
    void process() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Assertions.assertNotNull(getProcess().invoke(decorator, stream));

    }

    private Method getProcess() throws NoSuchMethodException {
        Method method = FileReaderDecorator.class.getDeclaredMethod("process", ByteArrayOutputStream.class);
        method.setAccessible(true);
        return method;
    }
}