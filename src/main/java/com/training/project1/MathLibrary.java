package com.training.project1;

public class MathLibrary{
    
    public static void main(String[] args) {
        
        int number1= 5;
        int number2 =10;
        
        int result = sum(number1,number2);
        System.out.println(result);
    }
    
    public static int sum (int number1, int number2) {
        
        return number1 + number2;
        
    }
}