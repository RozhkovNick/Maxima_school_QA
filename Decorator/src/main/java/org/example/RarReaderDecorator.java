package org.example;

import java.io.ByteArrayOutputStream;

public class RarReaderDecorator extends ArchReaderDecorator {
    public RarReaderDecorator(IFileReader reader) {
        logDependencyAdding(reader, "constructor");
        this.reader = reader;
    }

    protected ByteArrayOutputStream unArch(ByteArrayOutputStream stream) {
        System.out.println("-RarReaderDecorator unZip with parameter: " + stream.toString());
        return stream;
    }

    protected boolean isValidFileType() {
        // Note: Is this file type valid
        System.out.println("-RarReaderDecorator isValidFileType");
        return true;
    }

    protected boolean isPasswordNecessary() {
        // Note: Is this file need password
        System.out.println("-RarReaderDecorator isPasswordNecessary");
        return false;
    }
}

