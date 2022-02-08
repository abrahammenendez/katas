package katas;

import structures.LinkedListNode;

public class Kata26 {

  public static <T> boolean main(LinkedListNode<T> node) {
    LinkedListNode<T> reversed = reverse(node);
    while (reversed != null && node != null) {
      if (reversed.data != node.data) {
        return false;
      }
      reversed = reversed.next;
      node = node.next;
    }
    return reversed != null && node != null;
  }

  public static <T> LinkedListNode<T> reverse(LinkedListNode<T> head) {
    LinkedListNode<T> prev = null;
    LinkedListNode<T> curr = head;
    LinkedListNode<T> next = null;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    return prev;
  }
}
