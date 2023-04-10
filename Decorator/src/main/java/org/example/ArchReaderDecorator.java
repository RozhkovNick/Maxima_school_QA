package org.example;

import java.io.ByteArrayOutputStream;

public abstract class ArchReaderDecorator extends ReaderDecorator {
    protected abstract ByteArrayOutputStream unArch(ByteArrayOutputStream stream);

    protected abstract boolean isValidFileType();

    protected abstract boolean isPasswordNecessary();

    protected boolean preProcess(String filename) {
        boolean result = true;
        System.out.println("ArchReaderDecorator::open / preProcess::Just trying to open zip file: " + filename);
        result = isValidFileType() && !isPasswordNecessary();
        return result;
    }

    protected ByteArrayOutputStream process(ByteArrayOutputStream readerStream) {
        System.out.println("+ArchReaderDecorator read / process without parameters");
        System.out.println("ArchReaderDecorator::read::Just trying to read zip file");
        return unArch(readerStream);
    }
}
