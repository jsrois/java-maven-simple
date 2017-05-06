package example;

public class One {
  String message = "foo";

  public String foo() {
    return message;
  }

  //WOW THIS IS A COMMENT
  private void uncoveredMethod() {
    System.out.println(foo());
  }


  private void AnotherUncoveredMethod() {
    System.out.println(foo());
  }

}
