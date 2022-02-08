package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Kata11Test {

  @Test
  void test() {
    assertEquals(true, new KataTest<>().measure(() -> Kata11.main("tesr")));
  }
}
