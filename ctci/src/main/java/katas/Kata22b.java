package katas;

import structures.LinkedListNode;

public class Kata22b {

  public static <T> LinkedListNode<T> printKthToLast(LinkedListNode<T> head, int k) {
    LinkedListNode<T> p1 = head;
    LinkedListNode<T> p2 = head;

    for (int i = 0; i < k; i++) {
      if (p2 != null) {
        p2 = p2.next;
      } else {
        return null;
      }
    }

    while (p2 != null) {
      p1 = p1.next;
      p2 = p2.next;
    }

    return p1;
  }
}
