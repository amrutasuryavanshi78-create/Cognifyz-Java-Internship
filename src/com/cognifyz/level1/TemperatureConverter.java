package com.cognifyz.level1;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter temperature value: ");
        double temp = sc.nextDouble();
        
        System.out.println("Enter unit (C for Celsius, F for Fahrenheit): ");
        char unit = sc.next().toUpperCase().charAt(0);
        
        if(unit == 'C') {
            double fahrenheit = (temp * 9/5) + 32;
            System.out.println(temp + "°C = " + fahrenheit + "°F");
        } else if(unit == 'F') {
            double celsius = (temp - 32) * 5/9;
            System.out.println(temp + "°F = " + celsius + "°C");
        } else {
            System.out.println("Invalid unit entered. Please use C or F.");
        }
        
        sc.close();
    }
}
