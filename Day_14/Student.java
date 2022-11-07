package Day_14;

public class Student {
  int RollNo;
  String Name;
  static String University = "VIT"; // static keyword

  Student(int i, String n) { // Constructor

    RollNo = i;
    Name = n;
  }

  void display() {
    System.out.println(RollNo + " " + Name + " " + University);
  }

  public class TestStaticVariable1 {
 public static void main(String args[]){  
 Student s1 = new Student(111,"Karan");  
 Student s2 = new Student(222,"Aryan");  
  s1.display();  
 s2.display();  
 }  
}
