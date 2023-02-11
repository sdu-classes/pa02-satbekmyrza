public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
        
    }

    public Circle(double r) {
        this.radius = r;
    }
    
    public Circle(double r, String color, boolean filled) {
        // first way
        // super(color, filled);
        // this.radius = r;

        // second way
        this.setColor(color);
        this.setFilled(filled);
        this.radius = r;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        // first way
        // return String.format(
        //     "A Circle with radius=%.3f, which is a subclass of %s", 
        //     this.radius,
        //     super.toString()
        // );

        // second way (radius)
        return String.format(
            "A Circle with radius=%s, which is a subclass of %s", 
            Double.toString(this.radius),
            super.toString()
        );
    }
}