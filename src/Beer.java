
public class Beer extends Beverage {
    private double alcoholContent;

    public Beer(String typeOfBeverage, int volume, String ingredients, double alcoholContent) {
        super(typeOfBeverage, volume, ingredients);
        this.alcoholContent = alcoholContent;
    }

    public void display() {
        super.display();
        System.out.println("Alcohol content: "+alcoholContent);
    }
}
