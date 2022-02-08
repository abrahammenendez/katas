package katas;

import org.junit.jupiter.api.Test;
import structures.LinkedListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Kata22bTest {

  @Test
  void test() {
    LinkedListNode<Integer> list = new LinkedListNode<>(1);
    list.append(2);
    list.append(3);
    list.append(4);
    list.append(5);
    list.append(6);
    assertEquals(3, Kata22b.printKthToLast(list, 4).data);
  }
}
