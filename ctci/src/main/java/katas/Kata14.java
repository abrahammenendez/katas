package katas;

import java.util.HashSet;
import java.util.Set;

public class Kata14 {

  public static Boolean main(String s1) {
    String sorted = sort(s1);
    boolean even = s1.length() % 2 != 0;
    for (int i = 1; i < sorted.length(); i = i + 2) {
      if (sorted.charAt(i - 1) != sorted.charAt(i) && even) {
        return false;
      }
    }
    return true;
  }

  public static Boolean main2(String s) {
    Set<Character> set = new HashSet<>();
    for (char c : s.toCharArray()) {
      if (!set.add(c)) {
        set.remove(c);
      }
    }
    return set.isEmpty() || s.length() % 2 == 0;
  }

  public static Boolean main3(String s) {
    int[] map = new int[128];
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      map[s.charAt(i)]++;
      if (map[s.charAt(i)] % 2 == 0) {
        count--;
      } else {
        count++;
      }
    }

    return count > 0 || s.length() % 2 == 0;
  }

  private static String sort(String s) {
    char[] content = s.toCharArray();
    java.util.Arrays.sort(content);
    return new String(content);
  }
}
