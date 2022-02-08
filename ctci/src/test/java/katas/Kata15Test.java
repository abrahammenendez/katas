package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Kata15Test {

  @Test
  void test() {
    assertEquals(true, Kata15.main("pale", "ple"));
    assertEquals(true, Kata15.main("pales", "pale"));
    assertEquals(true, Kata15.main("pale", "bale"));
    assertEquals(false, Kata15.main("pale", "bake"));
  }
}
