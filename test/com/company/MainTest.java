package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void getCalculation(){
        String str = Main.getCalculation(1361, 11135);
        assertFalse(str.isEmpty());
    }

    @Test
    void line(){
        String str = Main.line(123);
        int number = 123;
        char line = '_';
        StringBuilder longLine = new StringBuilder();
        for (int i = 0; i < String.valueOf(number).length(); i++){
            longLine.append(line);
        }
        assertEquals(longLine.toString(), str);
    }

    @Test
    void indent(){
        String str = Main.indent(1234567890, "");
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            string.append(" ");
        }
        assertEquals(string.toString(), str);
    }

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