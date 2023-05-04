package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


class RarReaderDecoratorTest {
    IFileReader reader = new IFileReader() {
        @Override
        public ByteArrayOutputStream read() {
            return null;
        }

        @Override
        public boolean open(String filename) {
            return false;
        }
    };
    ByteArrayOutputStream stream = new ByteArrayOutputStream();
    RarReaderDecorator decorator = new RarReaderDecorator(reader);

    @Test
    void unArch() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Assertions.assertNotNull(getUnArch().invoke(decorator, stream));

    }

    private Method getUnArch() throws NoSuchMethodException {
        Method method = RarReaderDecorator.class.getDeclaredMethod("unArch", ByteArrayOutputStream.class);
        method.setAccessible(true);
        return method;
    }

    @Test
    void isValidFileType() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Assertions.assertEquals(true, getIsValidFileType().invoke(decorator));
    }

    private Method getIsValidFileType() throws NoSuchMethodException {
        Method method = RarReaderDecorator.class.getDeclaredMethod("isValidFileType");
        method.setAccessible(true);
        return method;
    }

    @Test
    void isPasswordNecessary() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Assertions.assertEquals(false, getIsPasswordNecessary().invoke(decorator));
    }

    private Method getIsPasswordNecessary() throws NoSuchMethodException {
        Method method = RarReaderDecorator.class.getDeclaredMethod("isPasswordNecessary");
        method.setAccessible(true);
        return method;
    }
}