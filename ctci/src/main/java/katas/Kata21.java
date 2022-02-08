package katas;

import structures.LinkedListNode;

import java.util.HashSet;
import java.util.Set;

public class Kata21 {

  public static <T> void deleteDups(LinkedListNode<T> node) {
    Set<T> duplicates = new HashSet();
    LinkedListNode<T> previousNode = null;
    while (node != null) {
      if (!duplicates.add(node.data)) {
        previousNode.next = node.next;
      } else {
        duplicates.add(node.data);
        previousNode = node;
      }
      node = node.next;
    }
  }
}
