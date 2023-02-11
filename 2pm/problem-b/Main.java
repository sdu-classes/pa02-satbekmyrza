public class Main {
    public static void main(String[] args) {
        Shape sh1 = new Shape();
        Shape sh2 = new Shape("black", false);

        System.out.println(sh1);
        System.out.println(sh2);
        
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.12567);

        System.out.println(c1);
        System.out.println(c2);

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3.0, 4.0);
        
        System.out.println(r1);
        System.out.println(r2);
        
    }
}