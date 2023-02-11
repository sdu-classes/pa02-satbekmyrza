public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {

    }

    public Rectangle(double wid, double len) {
        this.width = wid;
        this.length = len;
    }
    
    public Rectangle(double wid, double len, String c, boolean f) {
        super(c, f);
        this.width = wid;
        this.length = len;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double r) {
        this.width = r;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double r) {
        this.length = r;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    
    @Override
    public String toString() {
        return String.format(
            "A Rectangle with width=%.2f and length=%.2f, which is a subclass of %s",
            this.width,
            this.length,
            super.toString()    
        );
    }
}