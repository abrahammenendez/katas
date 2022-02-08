package katas;

public class Kata16 {

  public static String main(String s) {
    StringBuilder compressed = new StringBuilder();
    int countConsecutive = 0;
    for (int i = 0; i < s.length(); i++) {
      countConsecutive++;
      char c = s.charAt(i);
      if (i + 1 >= s.length() || c != s.charAt(i + 1)) {
        compressed.append(c);
        compressed.append(countConsecutive);
        countConsecutive = 0;
      }
    }
    return compressed.length() >= s.length() ? s : compressed.toString();
  }

  public static String main2(String s) {
    StringBuilder compressed = new StringBuilder(s.charAt(0));
    int numOfOcurrs = 1;
    for (int i = 1; i < s.length(); i++) {
      char c = s.charAt(i);
      char previousC = s.charAt(i - 1);
      if (c == previousC) {
        numOfOcurrs++;
        if (i == s.length() - 1) {
          compressed.append(previousC);
          compressed.append(numOfOcurrs);
        }
      } else {
        compressed.append(previousC);
        compressed.append(numOfOcurrs);
        numOfOcurrs = 1;
      }
    }
    return compressed.length() >= s.length() ? s : compressed.toString();
  }
}
