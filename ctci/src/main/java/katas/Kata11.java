package katas;

public class Kata11 {

  public static Boolean main(String word) {
    StringBuilder wordSoFar = new StringBuilder();
    for (int i = 0; i < word.length(); i++) {
      char letter = word.charAt(i);
      if (wordSoFar.indexOf(String.valueOf(letter)) != -1) {
        return false;
      }
      wordSoFar.append(letter);
    }
    return true;
  }

  public static Boolean main2(String str) {

    if (str.length() > 128) return false;

    boolean[] char_set = new boolean[128];
    for (int i = 0; i < str.length(); i++) {
      int val = str.charAt(i);
      if (char_set[val]) { // Already found this char in string
        return false;
      }
      char_set[val] = true;
    }

    return true;
  }
}
