class Rectangle {

  int length, width;

  void getData(int x, int y) {
    length = x;
    width = y;
  }

  void rectarea() {
    int area = length * width;
    System.out.print("Area is =" + area);
  }
}

class RectArea {

  public static void main(String[] args) {
    int area1;
    Rectangle rect1 = new Rectangle();
    rect1.length = 15;
    rect1.width = 10;
    area1 = rect1.length * rect1.width;
    System.out.println("Area1= " + area1);
  }

}

