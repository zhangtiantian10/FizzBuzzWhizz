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
}
