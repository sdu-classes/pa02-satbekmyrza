public class Main {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.setColor("green");
        s1.setFilled(false);

        Shape s2 = new Shape("green", false);
        
        
        System.out.println(s1);
        System.out.println(s2);
        
    }
}
