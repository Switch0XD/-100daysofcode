class Student {
  int RollNo;
  String name;
  float fee;

  Student(int RollNo, String name, float fee) {
    this.RollNo = RollNo;
    this.name = name;
    this.fee = fee;
  }

  void display() {
    System.out.println(RollNo + " " + name + " " + fee);
  }
}

class TestThis2 {
  public static void main(String args[]) {
    Student s1 = new Student(111, "Aman", 5000f);
    Student s2 = new Student(112, "Ajay", 6000f);
    s1.display();
    s2.display();
  }
}