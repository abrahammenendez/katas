package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Kata18Test {

  @Test
  void test() {
    int[][] actual = {
      {0, 2, 3, 4, 5, 6},
      {7, 8, 9, 10, 11, 12},
      {13, 14, 15, 0, 17, 18},
      {19, 20, 21, 22, 23, 0}
    };
    int[][] expected = {
      {0, 0, 0, 0, 0, 0},
      {0, 8, 9, 0, 11, 0},
      {0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0}
    };
    assertEquals(expected, Kata18.main(actual));
  }
}
