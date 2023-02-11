public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {

    }

    public Rectangle(double wid, double len) {
        this.width = wid;
        this.length = len;
    }

    public Rectangle(double wid, double len, String color, boolean filled) {
        super(color, filled);
        this.width = wid;
        this.length = len;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double wid) {
        this.width = wid;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double len) {
        this.length = len;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public String toString() {
        return String.format("Rectangle[%s],width=%f,length=%f", 
        super.toString(), this.width, this.length);
    }
}