
public class ToyShop {  //miejsce do przechowywania wszystkich zabawek

    private Bear[] bears = new Bear[10];
    private int indexBear = 0;

    private Car[] cars = new Car[10];
    private int indexCar = 0;

    public void addBear(Bear bear) {
        if (indexBear < bears.length) {
            bears[indexBear++] = bear;
        }
    }

    public void addCar(Car car) {
        if (indexCar < cars.length) {
            cars[indexCar++] = car;
        }
    }

    public void displayAll() {
        for (int i = 0; i < indexBear; i++) {
            bears[i].display();
            System.out.println();
        }
        for (int i = 0; i < indexCar; i++) {
            cars[i].display();
            System.out.println();
        }
    }
}
