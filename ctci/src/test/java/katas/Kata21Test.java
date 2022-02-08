package katas;

import org.junit.jupiter.api.Test;
import structures.LinkedListNode;

public class Kata21Test {

  @Test
  void test() {
    LinkedListNode<Integer> list = new LinkedListNode<>(1);
    list.append(2);
    list.append(2);
    list.append(4);
    list.printValues();
    Kata21.deleteDups(list);
    list.printValues();
  }
}
