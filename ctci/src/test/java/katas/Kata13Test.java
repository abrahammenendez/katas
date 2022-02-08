package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Kata13Test {

  @Test
  void test() {
    assertEquals("Mr%20John%20Smith", Kata13.main("Mr John Smith    ", 13));
  }
}
