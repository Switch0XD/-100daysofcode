public class Room {
  float length;
  float breath;

  Room(Float x, Float y) {
    length = x;
    breath = y;
  }

  Room(float x) {
    length = breath = x;
  }

  float Area() {
    return (length * breath);
  }

  public static void main(String[] args) {
    Room obj1 = new Room(45.5f, 65.6f);
    System.out.println("Constructor One = " + obj1.Area());
    Room obj2 = new Room(5);
    System.out.print("Constructor Two = " + obj2.Area());
  }
}
