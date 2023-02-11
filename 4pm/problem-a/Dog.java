public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    // overloaded method
    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        return String.format("Dog[%s]", super.toString());
    }
}