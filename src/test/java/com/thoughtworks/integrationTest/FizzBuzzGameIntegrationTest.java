package com.thoughtworks.integrationTest;
/*
Don't change this file
*/

import com.thoughtworks.FizzBuzzGame;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.IsEqual.equalTo;
public class FizzBuzzGameIntegrationTest {
    @Test
    public void testFizzBuzzGameResults() {
        List<String> expectedResults = Arrays.asList(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "Whizz", "8", "Fizz", "Buzz",
                "11", "Fizz", "Fizz", "Whizz", "FizzBuzz", "16", "Whizz", "Fizz", "19", "Buzz",
                "FizzWhizz", "22", "Fizz", "Fizz", "Buzz", "26", "Fizz", "Whizz", "29", "FizzBuzz",
                "Fizz", "Fizz", "Fizz", "Fizz", "BuzzWhizz", "Fizz", "Fizz", "Fizz", "Fizz", "Buzz",
                "41", "FizzWhizz", "Fizz", "44", "FizzBuzz", "46", "Whizz", "Fizz", "Whizz", "Buzz",
                "Fizz", "Buzz", "Fizz", "Fizz", "Buzz", "Whizz", "Fizz", "Buzz", "Buzz", "FizzBuzz",
                "61", "62", "FizzWhizz", "64", "Buzz", "Fizz", "Whizz", "68", "Fizz", "BuzzWhizz",
                "Whizz", "Fizz", "Fizz", "Whizz", "FizzBuzz", "Whizz", "Whizz", "Fizz", "Whizz", "Buzz",
                "Fizz", "82", "Fizz", "FizzWhizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz",
                "Whizz", "92", "Fizz", "94", "Buzz", "Fizz", "Whizz", "Whizz", "Fizz", "Buzz"
        );


        FizzBuzzGame game = new FizzBuzzGame();
        game.start(100);
        List<String> results = game.getResults();
        assertThat(results, equalTo(expectedResults));
    }
}