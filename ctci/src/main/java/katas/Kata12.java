package katas;

public class Kata12 {

  public static boolean main(String s1, String s2) {

    if (s1.length() != s2.length()) {
      return false;
    }

    return sort(s1).equals(sort(s2));
  }

  private static String sort(String s) {
    char[] content = s.toCharArray();
    java.util.Arrays.sort(content);
    return new String(content);
  }
}
