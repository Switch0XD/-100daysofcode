package CodeWithMosh;

public class Casting {
  public static void main(String[] args) {
    // Implicit casting
    // byte > short > int > long >float > double
    double x = 1.1;
    int y = (int) x + 2;
    String a = "1.1";
    Float.parseFloat(a); // wrapper class

    System.out.println(a);
    System.out.println(y);
  }
}
