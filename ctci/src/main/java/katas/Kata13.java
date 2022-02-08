package katas;

public class Kata13 {

  public static String main(String s1, int i1) {
    char[] s1Array = s1.toCharArray();
    int numLetters = 0;
    for (char c : s1Array) {
      if (numLetters == i1) {
        break;
      } else if (c != ' ') {
        // replacedString.append(c);
      } else {
        // replacedString.append("%20");
      }
      numLetters++;
    }
    return s1;
  }

  /*  public static String foo(String s1, int i1) {
    char[] s1Array = s1.toCharArray();
    for (char c : s1Array) {
      if (numOfLetters == i1) {
        break;
      } else if (c != ' ') {
        replacedString.append(c);
      } else {
        replacedString.append("%20");
      }
      numOfLetters++;
    }
    return replacedString.toString();
  }*/
}
