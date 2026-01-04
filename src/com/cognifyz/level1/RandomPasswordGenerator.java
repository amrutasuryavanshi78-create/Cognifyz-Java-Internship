package com.cognifyz.level1;

import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {

	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        String lower = "abcdefghijklmnopqrstuvwxyz";
	        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        String numbers = "0123456789";
	        String special = "!@#$%^&*()-_=+[]{};:,.<>?";
	        
	        System.out.print("Enter desired password length: ");
	        int length = scanner.nextInt();
	        scanner.nextLine();
	        
	        System.out.print("Include lowercase letters? (yes/no): ");
	        boolean useLower = scanner.nextLine().equalsIgnoreCase("yes");
	        
	        System.out.print("Include uppercase letters? (yes/no): ");
	        boolean useUpper = scanner.nextLine().equalsIgnoreCase("yes");
	        
	        System.out.print("Include numbers? (yes/no): ");
	        boolean useNumbers = scanner.nextLine().equalsIgnoreCase("yes");

	        
	        System.out.print("Include special characters? (yes/no): ");
	        boolean useSpecial = scanner.nextLine().equalsIgnoreCase("yes");
	        
	        String charPool = "";
	        if (useLower) charPool += lower;
	        if (useUpper) charPool += upper;
	        if (useNumbers) charPool += numbers;
	        if (useSpecial) charPool += special;
	        if (charPool.isEmpty()) {
	            System.out.println("Error: No character types selected!");
	            return;
	        }
	        StringBuilder password = new StringBuilder();
	        for (int i = 0; i < length; i++) {
	            int index = random.nextInt(charPool.length());
	            password.append(charPool.charAt(index));
	        }
	        
	        System.out.println("Generated password: " + password);

	        scanner.close();
	    
	 }
	 
}
