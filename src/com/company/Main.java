package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Hi who  are you?");
        String n = input.nextLine();
        System.out.println("Hello, " + n + ", nice to meet you!");
        System.out.println("How long have you attended Howard?");
        int y = input.nextInt();
        System.out.println("Ok, you've been at Howard for " + y + " years.");
        System.out.println("What's your gpa?");
        float g = input.nextFloat();
        if(g > 3) {
            System.out.println("Good! Your GPA is " + g);
        } else
            System.out.println("Your gpa, "+ g + ", needs some work :/");
    }
}
