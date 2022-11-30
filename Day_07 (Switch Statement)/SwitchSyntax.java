
public class SwitchSyntax {
  public static void main(String[] args) {
    byte num = 10; // Declaring a variable for switch expression
    switch (num) { // Switch expression
      case 1: // Case statements
        System.out.println("1");
        break;
      case 2:
        System.out.println("0");
      default: // Default case statement
        System.out.println("0 or 1");
    }
  }
}
