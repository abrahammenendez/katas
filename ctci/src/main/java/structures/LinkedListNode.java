package structures;

public class LinkedListNode<T> {

  public LinkedListNode<T> next = null;
  public T data;

  public LinkedListNode() {}

  public LinkedListNode(T data) {
    this.data = data;
  }

  public void append(T data) {
    LinkedListNode newLast = new LinkedListNode(data);
    LinkedListNode actualLast = this;
    while (actualLast.next != null) {
      actualLast = actualLast.next;
    }
    actualLast.next = newLast;
  }

  public void printValues() {
    LinkedListNode actual = this;
    while (actual != null) {
      System.out.println(actual.data);
      actual = actual.next;
    }
  }

  public static LinkedListNode<Integer> populate() {
    LinkedListNode<Integer> list1 = new LinkedListNode<>(1);
    list1.append(2);
    list1.append(3);
    list1.append(4);
    list1.append(5);
    list1.append(6);
    return list1;
  }

  @Override
  public String toString() {
    return "LinkedListNode{" + "next=" + next + ", data=" + data + '}';
  }
}
