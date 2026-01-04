package com.cognifyz.level1;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();

        
             String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

           boolean isPalindrome = true;
              int len = cleaned.length();
            for (int i = 0; i < len / 2; i++) {
            if (cleaned.charAt(i) != cleaned.charAt(len - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

       
            if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome!");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        sc.close();
    }
}
