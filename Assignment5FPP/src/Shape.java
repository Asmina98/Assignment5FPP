

//Shape class ( Parent class )
public class Shape {

    //Instance fields
    protected String color;

    //Constructors
    public Shape (String color) {
        this.color = color;
    }

    //Instance methods
    public double calculateArea () {
        return 0.0;
    }
    public double calculatePerimeter () {
        return 0.0;
    }

    //Shape.Rectangle class
    public static class Rectangle extends Shape {

        //Instance fields
        protected double width;
        protected double height;

        //Constructor
        public Rectangle(String color, double width, double height) {
            super(color);
            this.width = width;
            this.height = height;
        }

        //Instance methods
        @Override
        public double calculateArea() {
            return (width * height);
        }

        @Override
        public double calculatePerimeter() {
            return ((2 * width) + (2 * height));
        }
    }
}
