public class Square extends Rectangle {
    public Square() {

    }

    public Square(double side) {
        // this.setLength(side);
        // this.setWidth(side);
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        // this.setColor(color);
        // this.setFilled(filled);
        // this.setLength(side);
        // this.setWidth(side);
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.getWidth();  // NOTE can return this.length as well
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double len) {
        // super.setWidth(len);
        // super.setLength(len);
        this.setSide(len);
    }

    @Override
    public void setWidth(double wid) {
        // super.setWidth(wid);
        // super.setLength(wid);
        this.setSide(wid);
    }

    @Override
    public String toString() {
        return String.format("Square[%s]", super.toString());
    }
}