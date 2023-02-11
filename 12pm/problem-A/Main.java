public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("Barsik");
        Mammal m = new Mammal("Dolphin");
        Cat c = new Cat("Cat");
        Dog d = new Dog("Aqtos");
        System.out.println(a);
        System.out.println(m);
        System.out.println(c);
        c.greets();
        System.out.println(d);
        d.greets();
        d.greets(d);
    }
}
