import shapes.Circle;
import shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle obj1=new Circle();
        System.out.println("Area of the Circle : "+obj1.calculateArea());
        System.out.println("Perimeter of the Circle : "+obj1.calculatePerimeter());

        Rectangle obj2= new Rectangle();
        System.out.println("Area of the Rectangle : "+obj2.calculateArea());
        System.out.println("Perimeter of the Rectangle : "+obj2.calculatePerimeter());

    }
}
