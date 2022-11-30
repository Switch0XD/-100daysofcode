package CodeWithMosh;

import java.util.Scanner;

public class ReadingInputs {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Age: ");
    byte age = scanner.nextByte();
    System.out.println("You are " + age);
    // Reading of String
    Scanner str = new Scanner(System.in);
    System.out.print("Enter Name: ");
    String name = str.next();
    System.out.println("Your name is: " + name);

  }
}
