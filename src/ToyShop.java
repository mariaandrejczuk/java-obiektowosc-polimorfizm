
public class ToyShop {  //miejsce do przechowywania wszystkich zabawek

    //private Bear[] bears = new Bear[10];
    //private int indexBear = 0;

    //private Car[] cars = new Car[10];
    //private int indexCar = 0;

    private Toy[] toys = new Toy[20];  //ta tablica zastąpi dwie powyżze cars i bears
    private int indexToy = 0;


    //public void addBear(Bear bear) {
    //    if (indexToy < toys.length) {    //mogę zastąpić misia toysem, czyli przypiac misia do zabawek, bo miś jest klasą pochodnę do klasy toys
    //        toys[indexToy++] = bear;
    //    }
    //}

    //public void addCar(Car car) {
    //    if (indexToy < toys.length) {
    //        toys[indexToy++] = car;
    //    }
    //}

    public void addToy(Toy toy) {  //zmienna klasy bazowej może przechowywać referencje do obiektu klasy pochodnej
        if (indexToy < toys.length) {
            toys[indexToy++] = toy;
        }
    }

    public void displayAll() {   //typowy polimorfizm dynamiczny zaczyna się w momencie wyświetlania - wyświetlam toy ale tak naprawdę są to misie i samochody, przy wprowadzeiu okazuje się, jaki obiekt mamy i jaki będzie wyswietlony - czy car, czy bear
        for (int i = 0; i < indexToy; i++) {   //polimorfizm z wykorzystaniem dziedziczenia i przesłanianie -->polimorfizm dynamiczny)
            toys[i].display();  //
            System.out.println();
        }
        //for (int i = 0; i < indexBear; i++) {
        //   bears[i].display();
        //    System.out.println();
        //}
        //for (int i = 0; i < indexCar; i++) {
        //    cars[i].display();
        //    System.out.println();
        //}
    }
}
