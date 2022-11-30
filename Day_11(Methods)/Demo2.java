import java.util.Scanner;

import org.xml.sax.InputSource;

// Odd Even program

public class Demo2 {
  public static void main(String[] args) {
    try (Scanner inputScanner = new Scanner(System.in)) {
      System.out.print("Enter Number = ");
      int num = inputScanner.nextInt();

      if (num % 2 == 0) {
        System.out.println("Its Even");
      } else {
        System.out.println("Its Odd");

      }
    }

  }
}
