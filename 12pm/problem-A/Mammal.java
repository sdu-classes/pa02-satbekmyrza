public class Mammal extends Animal {
    public Mammal(String n) {
        super(n);
    }

    public String toString() {
        // return "Animal[name=\"" + name + "\"]";
        return String.format("Mammal[%s]", super.toString());
    }
}