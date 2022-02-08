package katas;

import org.junit.jupiter.api.Test;
import structures.LinkedListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Kata26Test {

  @Test
  void test() {
    LinkedListNode<Integer> list1 = LinkedListNode.populate();
    LinkedListNode<Integer> list2 = LinkedListNode.populate();
    assertEquals(true, Kata26.main(list1));
  }
}
