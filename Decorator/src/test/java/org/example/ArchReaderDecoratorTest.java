package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class ArchReaderDecoratorTest {
    ByteArrayOutputStream stream = new ByteArrayOutputStream();
    ArchReaderDecorator decorator = new ArchReaderDecorator() {
        @Override
        protected ByteArrayOutputStream unArch(ByteArrayOutputStream stream) {
            return null;
        }

        @Override
        protected boolean isValidFileType() {
            return false;
        }

        @Override
        protected boolean isPasswordNecessary() {
            return false;
        }
    };

    @Test
    void preProcess() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Assertions.assertEquals(false, getPreProcess().invoke(decorator, "ToRead.txt"));

    }

    private Method getPreProcess() throws NoSuchMethodException {
        Method method = ArchReaderDecorator.class.getDeclaredMethod("preProcess", String.class);
        method.setAccessible(true);
        return method;
    }

    @Test
    void process() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Assertions.assertNull(getProcess().invoke(decorator, stream));

    }

    private Method getProcess() throws NoSuchMethodException {
        Method method = ArchReaderDecorator.class.getDeclaredMethod("process", ByteArrayOutputStream.class);
        method.setAccessible(true);
        return method;
    }
}