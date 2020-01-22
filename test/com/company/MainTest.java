package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void multiplicationResult() {
        int result = Main.multiplicationResult(11135,1361);
        assertEquals(15154735, result);
    }
    @Test
    void getMultiplication() {
        int[] arr = Main.getMultiplication(11135,1361);
        int[] array = {11135,66810,33405,11135};
        assertArrayEquals(array,arr);
    }
}