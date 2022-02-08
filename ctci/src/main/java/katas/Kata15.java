package katas;

public class Kata15 {

  public static Boolean main(String s1, String s2) {
    int lengthDiff = Math.abs(s1.length() - s2.length());
    if (lengthDiff == 0) {
      int numOfDiffs = 0;
      for (int i = 0; i < s1.length(); i++) {
        if (s1.charAt(i) != s2.charAt(i)) {
          numOfDiffs++;
        }
        if (numOfDiffs > 1) {
          return false;
        }
      }
      return true;
    }
    return lengthDiff == 1;
  }
}
