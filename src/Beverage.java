public class Beverage {
    private String typeOfBeverage;
    private int volume;
    private String ingredients;

    public Beverage(String typeOfBeverage, int volume, String ingredients) {
        this.typeOfBeverage = typeOfBeverage;
        this.volume = volume;
        this.ingredients = ingredients;
    }

    public void display(){
        System.out.println("Type of beverage: "+typeOfBeverage);
        System.out.println("Volume: "+volume);
        System.out.println("Ingredients: "+ingredients);
    }
}
