package shapes;

public class Rectangle extends Shape {

    double length=4.0;
    double width=3.0;
    @Override
    public double calculateArea() {
        double area=length*width;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter=(length*2)+(width*2);
        return perimeter;
    }


}
