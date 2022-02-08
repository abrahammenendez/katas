package katas;

import structures.LinkedListNode;

public class Kata22a {

  public static <T> T printKthToLast(LinkedListNode<T> head, int k) {
    int counter = 0;
    while (head != null) {
      if (k == counter) {
        return head.data;
      }
      head = head.next;
      counter++;
    }
    return null;
  }
}
