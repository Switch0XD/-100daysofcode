public class Student {
  String RollNo;
  String Name;
}

/**
 * Defining main outside the Student class
 * 
 */
class Test {
  public static void main(String[] args) {
    Student Std1 = new Student();
    System.out.println(Std1.RollNo);
    System.out.println(Std1.Name);
  }
}