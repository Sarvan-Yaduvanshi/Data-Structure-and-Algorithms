package Object_Oriented_Programming;
public class GettersAndSetters {
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
class Pen1 {
    private String color;

    String getColor() {
        return this.color;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int tip) {
    }

}
