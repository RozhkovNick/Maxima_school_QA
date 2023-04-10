package org.example;

import java.io.ByteArrayOutputStream;

public class Main {
    public static void main(String[] args) {

        try {
            IFileReader rsaEncryptSupport = FileProcessingEngineBuilder.buildRSAEncryptSupport();
            rsaEncryptSupport.open("ToRead.txt");
            ByteArrayOutputStream readerStream = rsaEncryptSupport.read();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        System.out.println();

        try {
            IFileReader rarArchSupport = FileProcessingEngineBuilder.buildRarArchSupport();
            rarArchSupport.open("ToRead.txt");
            ByteArrayOutputStream readerStream = rarArchSupport.read();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        System.out.println();

        try {
            IFileReader simpleTXTReader = FileProcessingEngineBuilder.buildSimpleTxtReader();
            simpleTXTReader.open("ToRead.txt");
            ByteArrayOutputStream readerStream = simpleTXTReader.read();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        System.out.println();

        try {
            IFileReader unZipTxtReader = FileProcessingEngineBuilder.buildZipTxtReader();
            unZipTxtReader.open("ZipToRead.txt");
            ByteArrayOutputStream readerStream = unZipTxtReader.read();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        System.out.println();

        try {
            IFileReader md5CryptoTxtReader = FileProcessingEngineBuilder.buildMD5TxtReader();
            md5CryptoTxtReader.open("MD5ECryptToRead.txt");
            ByteArrayOutputStream readerStream = md5CryptoTxtReader.read();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        System.out.println();

        //  MD5 Crypt Zip Arch Txt read
        try {
            IFileReader additionalReaderFeature = new ZipReaderDecorator(new MD5EncryptReaderDecorator(null));
            IFileReader md5CryptoZipTxtReader = new FileReaderDecorator(additionalReaderFeature);
            md5CryptoZipTxtReader.open("MD5ECryptZipToRead.txt");
            ByteArrayOutputStream readerStream = md5CryptoZipTxtReader.read();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        System.out.println();

        //  MD5 Crypt Zip MD5 Crypt Arch Txt read
        try {
            IFileReader additionalReaderFeature = new MD5EncryptReaderDecorator(new ZipReaderDecorator(new MD5EncryptReaderDecorator(null)));
            IFileReader md5CryptoZipMD5TxtReader = new FileReaderDecorator(additionalReaderFeature);
            md5CryptoZipMD5TxtReader.open("MD5ECryptZipMD5ECryptToRead.txt");
            ByteArrayOutputStream readerStream = md5CryptoZipMD5TxtReader.read();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        System.out.println();

        //  Zip-Zip-Zip-Zip-Zip Arch Txt read
        try {
            IFileReader additionalReaderFeature = new ZipReaderDecorator(new ZipReaderDecorator(new ZipReaderDecorator(new ZipReaderDecorator(new ZipReaderDecorator(null)))));
            IFileReader unZip5TimesTxtReader = new FileReaderDecorator(additionalReaderFeature);
            unZip5TimesTxtReader.open("ZipZipZipZipZipToRead.txt");
            ByteArrayOutputStream readerStream = unZip5TimesTxtReader.read();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        System.out.println();

        //  Zip-Rar-Zip Arch Txt read
        try {
            IFileReader additionalReaderFeature = new ZipReaderDecorator(new RarReaderDecorator(new ZipReaderDecorator(null)));
            IFileReader unZipRarZipTimesTxtReader = new FileReaderDecorator(additionalReaderFeature);
            unZipRarZipTimesTxtReader.open("ZipRarZipToRead.txt");
            ByteArrayOutputStream readerStream = unZipRarZipTimesTxtReader.read();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        System.out.println();
    }
}

