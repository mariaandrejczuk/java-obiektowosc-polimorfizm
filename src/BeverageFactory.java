
public class BeverageFactory {
    private Beverage[] beverages = new Beverage[20]; 
    private int indexBeverage = 0;

    public void addBeverage(Beverage beverage) {
        if (indexBeverage < beverages.length) {
            beverages[indexBeverage++] = beverage;
        }
    }

    public void displayAll() {
        for (int i = 0; i < indexBeverage; i++) {   //polimorfizm z wykorzystaniem dziedziczenia i przesłanianie -->polimorfizm dynamiczny)
            beverages[i].display();  //
            System.out.println();
        }
    }
}
