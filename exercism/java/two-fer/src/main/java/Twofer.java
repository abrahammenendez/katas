import java.util.Optional;

class Twofer {

  private static final String TEMPLATE = "One for %s, one for me.";

  String twofer(String name) {

    Optional<String> nullableName = Optional.ofNullable(name); // We need an Elvis operator!

    return String.format(TEMPLATE, nullableName.orElse("you"));
  }
}
