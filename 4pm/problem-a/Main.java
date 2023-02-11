public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("Rabbit");
        System.out.println(a);

        Mammal m = new Mammal("Monkey");
        System.out.println(m);
        
        Cat c = new Cat("Felix");
        System.out.println(c);

        Dog d = new Dog("Java");
        System.out.println(d);
    }
}