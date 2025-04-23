package Object_Oriented_Programming;
public class OOPS {
   public static void main(String[] args) {
       Pen p1 = new Pen();
       p1.setColor();
       System.out.println("Your color is : " + p1.color);
       p1.setTip();
       System.out.println("Your Tip is : " + p1.tip);
//       p1.setColor();
       p1.color = "Yellow";
       System.out.println("Your latest color is : " + p1.color);
   }
}
class Pen {
    String color;
    int tip;

    void setColor() {
        color  = "Blue";
    }
    void setTip() {
        tip = 5;
    }
}
class Student {
    String name;
    int age;
    float percentage; // CGPA

    void calculatePercentage(int phy, int chem, int math) {
        percentage = (float) (phy + chem + math) / 3;
    }
}
