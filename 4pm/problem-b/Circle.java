public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double r) {
        this.radius = r;
    }
    
    public Circle(double r, String c, boolean f) {
        super(c, f);
        this.radius = r;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    
    @Override
    public String toString() {
        return String.format(
            "A Circle with radius=%.2f, which is a subclass of %s",
            this.radius,
            super.toString()    
        );
    }
}