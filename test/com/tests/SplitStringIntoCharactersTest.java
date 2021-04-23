package com.tests;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

import com.tests.SplitStringIntoCharacters;

public class SplitStringIntoCharactersTest {

    //RED Step: initial fail test
    @Test
    public void failTest(){
        fail();
    }

    //GREEN Step: convert a single character string as a character data type
    @Test
    public void returnCharacterTest(){
        String word = "a";
        char[] expected = new char[]{'a'};
        char[] actual = SplitStringIntoCharacters.convertStringIntoCharactersArray(word);
        Assert.assertEquals(expected[0], actual[0]);
    }

    //REFACTOR Step: convert a string into a character array
    @Test
    public void convertStringToCharactersArrayTest(){
        String word = "Hello";
        char[] expected = new char[]{'H','e', 'l', 'l', 'o'};
        char[] actual = SplitStringIntoCharacters.convertStringIntoCharactersArray(word);
        Assert.assertEquals(expected[2], actual[2]);
    }




}
