package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
  private List<String> results = new ArrayList<>();

  public void start(int count) {
    for (int i = 1; i <= count; i++) {
      String text = String.format("%d", i);

      if (i % 3 == 0) {
        results.add("Fizz");
        continue;
      }

      if (i % 5 == 0) {
        results.add("Buzz");
        continue;
      }

      if (text.contains("3")) {
        results.add("Fizz");
        continue;
      }

      if (text.contains("5")) {
        results.add("Buzz");
        continue;
      }

      if (text.contains("7")) {
        results.add("Whizz");
        continue;
      }

      results.add(text);
    }
  }

  public List<String> getResults() {
    return results;
  }
}


