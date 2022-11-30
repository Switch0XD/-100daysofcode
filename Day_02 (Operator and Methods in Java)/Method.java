package CodeWithMosh;

public class Method {
  public static void main(String[] args) {
    int result = Math.round(1);
    int result1 = (int) Math.ceil(2.1F);// implicit casting
    int result2 = (int) Math.floorDiv(1, 2);// implicit casting
    int result3 = Math.max(1, 3);
    int result4 = (int) Math.round(Math.random() * 100); // explicit casting
    System.out.println(result + " = Math.round ");
    System.out.println(result1 + " = Math.cei ");
    System.out.println(result2 + " = Math.floordiv");
    System.out.println(result3 + " = Math.max");
    System.out.println(result4 + " = Math.random ");

  }
}
