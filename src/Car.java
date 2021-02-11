
public class Car extends Toy {

    private String type;

    public Car(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }
    public void display() {
        super.display(); //to mi wywołuje metodę display z Toys.java, super. omija przysłonięcie
        System.out.println("Type: "+type);
    }
}
