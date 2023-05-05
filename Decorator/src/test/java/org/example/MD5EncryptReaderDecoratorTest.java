package org.example;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class MD5EncryptReaderDecoratorTest {
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
    MD5EncryptReaderDecorator decorator = new MD5EncryptReaderDecorator(reader);

    @Test
    void preProcess() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Assertions.assertEquals(true, getPreProcess().invoke(decorator, "ToRead.txt"));
    }

    private Method getPreProcess() throws NoSuchMethodException {
        Method method = MD5EncryptReaderDecorator.class.getDeclaredMethod("preProcess", String.class);
        method.setAccessible(true);
        return method;
    }

    @Test
    void process() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Assertions.assertNotNull(getProcess().invoke(decorator, stream));
    }

    private Method getProcess() throws NoSuchMethodException {
        Method method = MD5EncryptReaderDecorator.class.getDeclaredMethod("process", ByteArrayOutputStream.class);
        method.setAccessible(true);
        return method;
    }

    @Test
    void encrypt() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Assertions.assertNotNull(getEncrypt().invoke(decorator, stream));
    }

    private Method getEncrypt() throws NoSuchMethodException {
        Method method = MD5EncryptReaderDecorator.class.getDeclaredMethod("encrypt", ByteArrayOutputStream.class);
        method.setAccessible(true);
        return method;
    }

    @Test
    void isValidFileType() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Assertions.assertEquals(true, getIsValidFileType().invoke(decorator));
    }

    private Method getIsValidFileType() throws NoSuchMethodException {
        Method method = MD5EncryptReaderDecorator.class.getDeclaredMethod("isValidFileType");
        method.setAccessible(true);
        return method;
    }

    @Test
    void isPasswordNecessary() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Assertions.assertEquals(false, getIsPasswordNecessary().invoke(decorator));

    }

    private Method getIsPasswordNecessary() throws NoSuchMethodException {
        Method method = MD5EncryptReaderDecorator.class.getDeclaredMethod("isPasswordNecessary");
        method.setAccessible(true);
        return method;
    }
}