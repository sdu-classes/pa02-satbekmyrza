public class Animal {
    private String name;

    public Animal(String n) {
        this.name = n;
    }
    
    public String toString() {
        // return "Animal[name=\"" + name + "\"]";
        return String.format("Animal[name=\"%s\"]", this.name);
    }
}