import java.util.Scanner;

public class Pet {
  String Cat;
  String Dog;

  public static void main(String[] args) {
    Pet Animal = new Pet();
    System.out.println("Enter the number 1 for Cat and 0 for Dog");
    try (Scanner sc = new Scanner(System.in)) {
      Byte Num = sc.nextByte();
      if (Num == 1) {
        System.out.println(Animal.Cat);
      } else if (Num == 0) {
        System.out.println(Animal.Dog);

      } else {
        System.out.println("Pet is not in list");
      }
    }
  }

}
