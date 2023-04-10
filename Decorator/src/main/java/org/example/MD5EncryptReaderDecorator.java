package org.example;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class MD5EncryptReaderDecorator extends ReaderDecorator {
    public MD5EncryptReaderDecorator(IFileReader reader) {
        logDependencyAdding(reader, "constructor");
        this.reader = reader;
    }

    protected boolean preProcess(String fileName) {
        boolean result = true;
        System.out.println("MD5EncryptReaderDecorator::open / preProcess::Just trying to open md5 file: " + fileName);
        result = isValidFileType() && !isPasswordNecessary();
        return result;
    }

    protected ByteArrayOutputStream process(ByteArrayOutputStream readerStream) throws IOException {
        System.out.println("+MD5EncryptReaderDecorator read / process without parameters");
        System.out.println("MD5EncryptReaderDecorator::read::Just trying to read md5 file");
        return encrypt(readerStream);
    }

    private ByteArrayOutputStream encrypt(ByteArrayOutputStream stream) {
        System.out.println("-MD5EncryptReaderDecorator encrypt with parameter: " + stream.toString());
        return stream;
    }

    private boolean isValidFileType() {
        // Note: Is this file type valid
        System.out.println("-MD5EncryptReaderDecorator isValidFileType");
        return true;
    }

    private boolean isPasswordNecessary() {
        // Note: Is this file need password
        System.out.println("-MD5EncryptReaderDecorator isPasswordNecessary");
        return false;
    }
}

