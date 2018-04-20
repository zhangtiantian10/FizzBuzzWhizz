package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
  private List<String> results = new ArrayList<>();

  public void start(int count) {
    for (int i = 1; i <= count; i++) {
      String text = String.format("%d", i);
      if (text.contains("3")) {
        results.add("Fizz");
        continue;
      }

      results.add(text);
    }
  }

  public List<String> getResults() {
    return results;
  }
}


