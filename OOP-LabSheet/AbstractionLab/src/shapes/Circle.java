package shapes;

public class Circle extends Shape {
        double radius =7.0;

        @Override
        public double calculateArea(){

            double area=Math.PI*(radius*radius);
            return area;
        }
        @Override
        public double calculatePerimeter(){
            double perimeter=2*Math.PI*(radius*radius);
            return perimeter;
        }




}
