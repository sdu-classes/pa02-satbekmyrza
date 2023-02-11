public class Main {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.setColor("green");
        s1.setFilled(false);

        Shape s2 = new Shape("green", false);
        
        
        System.out.println(s1);
        System.out.println(s2);

        Circle c1 = new Circle();
        System.out.println(c1);
        
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3.0, 4.0, "yellow", false);

        System.out.println(r1);
        System.out.println(r2);
        
        Square sq1 = new Square();
        System.out.println(sq1.getWidth());
        System.out.println(sq1.getLength());
        sq1.setSide(10);
        System.out.println(sq1.getWidth());
        System.out.println(sq1.getLength());
        sq1.setWidth(3);
        System.out.println(sq1.getWidth());
        System.out.println(sq1.getLength());
    }
}
