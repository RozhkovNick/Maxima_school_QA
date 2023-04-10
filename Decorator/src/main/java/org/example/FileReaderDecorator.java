package org.example;

import java.io.ByteArrayOutputStream;

public class FileReaderDecorator extends ReaderDecorator {
    public FileReaderDecorator(IFileReader reader) {
        logDependencyAdding(reader, "constructor");
        this.reader = reader;
    }

    protected boolean preProcess(String filename) {
        boolean result = true;
        System.out.println("FileReaderDecorator::open / preProcess::Just trying to open txt file: " + filename);
        return result;
    }

    protected ByteArrayOutputStream process(ByteArrayOutputStream readerStream) {
        System.out.println("+FileReaderDecorator read / process without parameters");
        System.out.println("FileReaderDecorator::read::Just trying to read txt file");
        return readerStream;
    }
}
