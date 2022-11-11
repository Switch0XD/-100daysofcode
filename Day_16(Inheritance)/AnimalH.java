// Hierarchical Inheritance Example
class AnimalH {
  void eat() {
    System.out.println("eating...");
  }
}

class Dog extends AnimalH {
  void bark() {
    System.out.println("barking...");
  }
}

class Cat extends AnimalH {
  void meow() {
    System.out.println("meowing...");
  }
}

class TestInheritance3 {
  public static void main(String args[]) {
    Cat c = new Cat();
    c.meow();
    c.eat();
    // c.bark();//C.T.Error
  }
}