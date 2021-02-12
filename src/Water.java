
public class Water extends Beverage {
    private String waterType;

    public Water(String typeOfBeverage, int volume, String ingredients, String waterType) {
        super(typeOfBeverage, volume, ingredients);
        this.waterType = waterType;
    }

    public void display() {
        super.display();
        System.out.println("Water type: "+waterType);
    }
}
