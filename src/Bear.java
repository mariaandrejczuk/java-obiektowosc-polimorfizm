
public class Bear extends Toy {

    private String material;

    public Bear(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }


    public void display() {
        super.display(); //to mi wywołuje metodę display z Toys.java, super. omija przysłonięcie
        System.out.println("Material: "+material);
    }
}
