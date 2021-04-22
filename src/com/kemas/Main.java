package com.kemas;
import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        welcomePlayer();
    }

    public static void welcomePlayer(){
        System.out.println("Welcome to Hangman!");
        System.out.println("Press 'Enter' to play.");
        input.nextLine();
    }

}
