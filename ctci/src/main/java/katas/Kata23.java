package katas;

import structures.LinkedListNode;

public class Kata23 {

  public static <T> void main(LinkedListNode<T> nodeToDelete) {
    LinkedListNode<T> next = nodeToDelete.next;
    nodeToDelete.data = next.data;
    nodeToDelete.next = next.next;
  }
}
