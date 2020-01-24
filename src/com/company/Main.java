package com.company;


public class Main {
    private static int shiftNumber = 20;

    public static void main(String[] args) {
        int a = 1361;
        int b = 1234;
        getCalculation(a,b);

    }


    public static void getCalculation(int numberOne, int numberTwo){
        int result = multiplicationResult(numberOne, numberTwo);
        int max = Math.max(numberOne, numberTwo);
        int min = Math.min(numberOne, numberTwo);
        String count = "";

        indent(max,count);
        System.out.println(max);
        indent(max,count + " ");
        System.out.println('*');
        indent(min,count);
        System.out.println(min);
        indent(max,count);
        line(max);
        System.out.println();
        int[] arr = getMultiplication(max,min);
       for (int i = 0; i < arr.length; i++){
           if (arr.length == 1){
               count = "";
               indent(result, count);
               System.out.println(result);
               return;
           }else {
               indent(arr[i], count);
               System.out.println(arr[i]);
               count += " ";
           }
       }
       count = "";
       indent(result, count);
       line(result);
        System.out.println();
        indent(result, count);
        System.out.println(result);
    }

    public static int multiplicationResult(int one, int two){
        return one * two;
    }


    public static void indent(int number, String str){
        int count = Integer.parseInt(String.valueOf(str.length()));
       int ident = shiftNumber - String.valueOf(number).length() - count;
       String string = "";
       for (int i = 0; i <= ident; i++){
           string += " ";

       }
        System.out.print(string);
    }

    public static void line(int number){
        char line = '_';
        String longLine = "";
        for (int i = 0; i < String.valueOf(number).length(); i++){
            longLine += line;
        }
        System.out.print(longLine);
    }

    public static int[] getMultiplication(int numberOne, int numberTwo){
       int max = Math.max(numberOne, numberTwo);
       int min = Math.min(numberOne, numberTwo);
        int balance = 10;
        int division = 1;
        int balanceMin = 10;
        int divisionMin = 1;
        int result = 0;
        String number = "";
        int  smallInt;
        int bigInt = 0;
        int[] arr = new int[String.valueOf(min).length()];
        for (int i = 0; i < String.valueOf(min).length(); i++){
            for (int x = 0; x < String.valueOf(max).length(); x++){
                result = (max % balance / division) * (min % balanceMin / divisionMin) + bigInt;
                smallInt = result % 10;
                bigInt = result / 10;
                balance *= 10;
                division *= 10;
                if (x == String.valueOf(max).length() -1){
                    number += result;
                    arr[i] = Integer.parseInt(new StringBuilder(number).reverse().toString());
                }else {
                    number += smallInt;
                }
            }
            balanceMin *= 10;
            divisionMin *= 10;
            balance = 10;
            division = 1;
            number ="";
            bigInt = 0;
        }
        return arr;
    }
}