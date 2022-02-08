package katas;

import org.junit.jupiter.api.Test;
import structures.LinkedListNode;

public class Kata23Test {

  @Test
  void test() {
    LinkedListNode<Integer> list = new LinkedListNode<>(1);
    list.append(2);
    list.append(3);
    list.append(4);
    list.append(5);
    list.append(6);
    Kata23.main(list);
    list.printValues();
  }
}
