package CodeWithMosh;

import java.util.*;

public class SimpleIntCalc {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Months: ");
    byte month = scanner.nextByte();
    System.out.print("Enter Amount: ");
    Long amt = scanner.nextLong();
    System.out.print("Rate of Interest: ");
    float Interest = scanner.nextFloat();

    /**
     * System.out.print(amt);
     * System.out.print(month);
     * System.out.print(Interest);
     **/
    System.out.print("Intrest: " + (double) (amt * month * Interest) / 100);
  }
}
