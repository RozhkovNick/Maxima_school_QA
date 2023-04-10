package org.example;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public abstract class ReaderDecorator implements IFileReader {
    protected abstract ByteArrayOutputStream process(ByteArrayOutputStream readerStream) throws IOException;

    protected abstract boolean preProcess(String filename);

    protected IFileReader reader;


    public boolean open(String filename) throws IOException {
        boolean isOk = true;
        if (reader != null) {
            isOk = reader.open(filename);
        }
        System.out.println("+ReaderDecorator open with parameter: " + filename);
        return isOk && preProcess(filename);
    }

    public ByteArrayOutputStream read() throws IOException {
        ByteArrayOutputStream readerStream = null;
        if (reader != null) {
            readerStream = reader.read();
        } else {
            readerStream = new ByteArrayOutputStream();
        }
        System.out.println("+ReaderDecorator read without parameters");
        return process(readerStream);
    }

    protected void logDependencyAdding(IFileReader reader, String methodToLog) {
        String classToLog = this.getClass().getSimpleName();
        String msg = "+" + classToLog + " " + methodToLog + " with parameter IFileReader: ";
        if (reader != null) {
            msg += reader.toString();
        } else {
            msg += "null";
        }
        System.out.println(msg);
    }
}
