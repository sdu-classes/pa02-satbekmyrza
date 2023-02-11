public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("Fish");
        System.out.println(a);
        
        Mammal m = new Mammal("Whale");
        System.out.println(m);

        Cat c = new Cat("Felix");
        c.greets();
        System.out.println(c);
        
        Dog d = new Dog("K9");
        Dog d2 = new Dog("Aqtos");
        d.greets();
        d.greets(d2);
        System.out.println(d);
    }
}