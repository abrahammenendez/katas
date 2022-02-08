package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Kata19Test {

  @Test
  void test() {
    assertEquals(false, Kata19.main("waterbottle", "erbotetlewat"));
    assertEquals(true, Kata19.main("waterbottle", "erbottlewat"));
  }

  @Test
  void test2() {
    assertEquals(false, Kata19.main2("waterbottle", "erbotetlewat"));
    assertEquals(true, Kata19.main2("waterbottle", "erbottlewat"));
  }
}
