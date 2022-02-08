package katas;

import java.util.Arrays;

public class Kata19 {

  public static boolean main(String s1, String s2) {

    return isSubstring(sortString(s1), sortString(s2));
  }

  public static boolean main2(String s1, String s2) {
    int len = s1.length();
    if (len == s2.length() && len > 0) {
      String s1s1 = s1 + s1;
      return isSubstring(s1s1, s2);
    }
    return false;
  }

  public static boolean isSubstring(String s1, String s2) {
    return s1.contains(s2);
  }

  public static String sortString(String inputString) {
    char tempArray[] = inputString.toCharArray();
    Arrays.sort(tempArray);
    return new String(tempArray);
  }
}
