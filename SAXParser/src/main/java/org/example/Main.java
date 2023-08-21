package org.example;

public class Main {
    public static void main(String[] args) {
        SaxMyParser saxParser = new SaxMyParser();
        Root root = saxParser.parse();
        System.out.println("Root " + root.toString());
    }
}