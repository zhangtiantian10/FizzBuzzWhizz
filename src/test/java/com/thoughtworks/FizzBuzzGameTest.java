package com.thoughtworks;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class FizzBuzzGameTest {
  @Test
  public void should_return_Fizz_when_have_3() {
    FizzBuzzGame game = new FizzBuzzGame();
    game.start(3);
    List<String> results = game.getResults();
    assertThat(results.get(2), equalTo("Fizz"));
  }

  @Test
  public void should_return_Fizz_when_number_is_n_times_as_3() {
    FizzBuzzGame game = new FizzBuzzGame();
    game.start(6);
    List<String> results = game.getResults();
    assertThat(results.get(2), equalTo("Fizz"));
    assertThat(results.get(5), equalTo("Fizz"));
  }

  @Test
  public void should_return_Fizz_when_have_5() {
    FizzBuzzGame game = new FizzBuzzGame();
    game.start(5);
    List<String> results = game.getResults();
    assertThat(results.get(4), equalTo("Buzz"));
  }

  @Test
  public void should_return_Fizz_when_number_is_n_times_as_5() {
    FizzBuzzGame game = new FizzBuzzGame();
    game.start(10);
    List<String> results = game.getResults();
    assertThat(results.get(4), equalTo("Buzz"));
    assertThat(results.get(9), equalTo("Buzz"));
  }

  @Test
  public void should_return_Fizz_when_have_7() {
    FizzBuzzGame game = new FizzBuzzGame();
    game.start(7);
    List<String> results = game.getResults();
    assertThat(results.get(6), equalTo("Whizz"));
  }
}
