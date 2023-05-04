package org.example;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
        Assertions.assertTrue((Boolean) getPreProcess().invoke("qwerty"));
    }

    private Method getPreProcess() throws NoSuchMethodException {
        Method method = MD5EncryptReaderDecorator.class.getDeclaredMethod("preProcess");
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
}