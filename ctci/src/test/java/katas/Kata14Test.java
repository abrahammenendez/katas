package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Kata14Test {

  @Test
  void test() {
    assertEquals(true, Kata14.main3("Tact Coa"));
    assertEquals(true, Kata14.main2("Tact Coa"));
    assertEquals(true, Kata14.main("Tact Coa"));
  }
}
