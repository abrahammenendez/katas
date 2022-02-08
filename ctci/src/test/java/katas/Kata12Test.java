package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Kata12Test {

  @Test
  void test() {

    assertEquals(true, Kata12.main("apple", "papel"));
    assertEquals(true, Kata12.main("carrot", "tarroc"));
    assertEquals(false, Kata12.main("hello", "llloh"));
  }
}
