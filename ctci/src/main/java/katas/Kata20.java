package katas;

import java.util.Arrays;

public class Kata20 {

  public static boolean main(String s1, String s2) {

    return isSubstring(sortString(s1), sortString(s2));
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
