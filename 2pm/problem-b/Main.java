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
        
        Circle circle = new Circle(5.5, "red", false); 
        System.out.println(circle); 
        System.out.println(circle.getArea()); 
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getColor()); 
        System.out.println(circle.isFilled()); 
        System.out.println(circle.getRadius()); 
 
        Rectangle rectangle = new Rectangle(3.8, 2.5, "green", false); 
        System.out.println(rectangle); 
        System.out.println(rectangle.getArea()); 
        System.out.println(rectangle.getPerimeter()); 
        System.out.println(rectangle.getColor()); 
        System.out.println(rectangle.getLength()); 
 
 
        Square square = new Square(6.6); 
        System.out.println(square); 
        System.out.println(square.getArea()); 
        System.out.println(square.getColor()); 
        System.out.println(square.getSide());
    }
}