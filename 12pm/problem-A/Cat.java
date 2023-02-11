public class Cat extends Mammal {
    public Cat(String n) {
        super(n);
    }

    public void greets() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return String.format("Cat[%s]", super.toString());
    }
}