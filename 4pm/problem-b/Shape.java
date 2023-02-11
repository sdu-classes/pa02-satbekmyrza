public class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        // first way
        // String fld = "filled";
        // if (!this.filled) {
        //     fld = "not filled";
        // }
        // return String.format("A shape with color of %s and %s", this.color, fld);

        // second way
        return String.format("A shape with color of %s and %s", this.color, this.filled ? "filled" : "not filled");
    }
}