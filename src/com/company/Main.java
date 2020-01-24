package com.company;


public class Main {
    final static int SHIFT_Number = 20;

    public static void main(String[] args) {
        int a = 1361;
        int b = 11135;
        System.out.println(getCalculation(a,b));
    }


    public static String getCalculation(int numberOne, int numberTwo){
        int result = multiplicationResult(numberOne, numberTwo);
        int max = Math.max(numberOne, numberTwo);
        int min = Math.min(numberOne, numberTwo);
        String count = "";
        StringBuilder show;
        String n = "\n";
        show = new StringBuilder((indent(max, count) + (max + n) + (indent(max, count + " ")) + ('*' + n)
                + (indent(min, count)) + (min + n) + indent(max, count) + (line(max) + n)));

        int[] arr = getMultiplication(max,min);
       for (int i = 0; i < arr.length; i++){
           if (arr.length == 1){
               count = "";
               show.append(indent(result, count));
               show.append(result);
               return show.toString();
           }else {
               show.append(indent(arr[i], count));
               show.append(arr[i]).append(n);
               count += " ";
           }
       }
       count = "";
        show.append(indent(result, count)).append(line(result)).append(n).append(indent(result, count)).append(result).append(n);
        return show.toString();
    }

    public static int multiplicationResult(int one, int two){
        return one * two;
    }


    public static String indent(int number, String str){
        int count = Integer.parseInt(String.valueOf(str.length()));
       int ident = SHIFT_Number - String.valueOf(number).length() - count;
       StringBuilder string = new StringBuilder();
       for (int i = 0; i <= ident; i++){
           string.append(" ");

       }
        return string.toString();
    }

    public static String line(int number){
        char line = '_';
        StringBuilder longLine = new StringBuilder();
        for (int i = 0; i < String.valueOf(number).length(); i++){
            longLine.append(line);
        }
        return longLine.toString();
    }

    public static int[] getMultiplication(int numberOne, int numberTwo){
       int max = Math.max(numberOne, numberTwo);
       int min = Math.min(numberOne, numberTwo);
        int balance = 10;
        int division = 1;
        int balanceMin = 10;
        int divisionMin = 1;
        int result;
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