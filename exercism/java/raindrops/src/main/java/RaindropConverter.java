import java.util.Optional;

class RaindropConverter {

  String convert(int number) {
    String message = "";
    if (isFactorOf(number, 3)) message += "Pling";
    if (isFactorOf(number, 5)) message += "Plang";
    if (isFactorOf(number, 7)) message += "Plong";
    return message.isEmpty() ? Integer.toString(number) : message;
  }

  private boolean isFactorOf(int number, int factor) {
    return number % factor == 0;
  }
}
