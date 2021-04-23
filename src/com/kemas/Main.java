package com.kemas;
import org.junit.Test;

import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        welcomePlayer();
    }

    public static void welcomePlayer(){
        System.out.println("Welcome to Hangman!");
        System.out.println("Press 'Enter' to play.");
        input.nextLine();                               // Let player press 'Enter'
        playHangman();
    }

    public static void playHangman(){
        System.out.println("You are now playing Hangman...");

        String secretWord = "Hello there";

        char[] secretWordCharacterArray = convertStringIntoCharactersArray(secretWord);

        System.out.println("Guess a letter...");
        printHiddenCharacters(secretWordCharacterArray);

        letUserEnterLetter();

    }

    public static char[] convertStringIntoCharactersArray(String word){
        return word.toCharArray();
    }

    public static void printHiddenCharacters(char[] charArray){
        for(int i = 0; i < charArray.length; i++){
            if(charArray[i]==' ') System.out.print(" ");        // If character is a space then, there would be an empty character instead of a underline
            else System.out.print("_");                         // If character is not a space, then print an underline
        }
    }

    public static void letUserEnterLetter(){
        System.out.println("Enter your guess: ");
        char guessedLetter = input.nextLine().charAt(0);     // Let user enter a string then get the first character of the string
    }


}
