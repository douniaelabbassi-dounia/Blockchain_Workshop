package com.blockchaine.workshop.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlockTest {
    Block block;
    @BeforeEach
    void beforeEach(){
        block = new Block(0,null,"First Block");
    }

    @Test
    void validateBlock() {
        assertTrue(block.validateBlock());
    }
    @Test
    void validateCalculatedHash(){
        assertNotNull(block.calculateHash());
    }
}