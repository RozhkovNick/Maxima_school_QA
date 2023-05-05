package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessingEngineBuilderTest {
    FileProcessingEngineBuilder builder = new FileProcessingEngineBuilder();

    @Test
    void buildSimpleTxtReader() {
        Assertions.assertNotNull(builder.buildSimpleTxtReader());
    }

    @Test
    void buildZipTxtReader() {
        Assertions.assertNotNull(builder.buildZipTxtReader());
    }

    @Test
    void buildMD5TxtReader() {
        Assertions.assertNotNull(builder.buildMD5TxtReader());
    }

    @Test
    void buildRarArchSupport() {
        Assertions.assertNotNull(builder.buildRarArchSupport());
    }

    @Test
    void buildRSAEncryptSupport() {
        Assertions.assertNotNull(builder.buildRSAEncryptSupport());
    }
}