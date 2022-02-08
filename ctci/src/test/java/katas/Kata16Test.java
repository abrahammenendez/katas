package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Kata16Test {

  @Test
  void test() {
    assertEquals("a2b1c5a3", Kata16.main("aabcccccaaa"));
    assertEquals("abcdd", Kata16.main("abcdd"));
  }
}
