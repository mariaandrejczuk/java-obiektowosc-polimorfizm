import java.util.Scanner;

public class BeverageFactoryApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "UTF-8");
        int option;
        String typeOfBeverage;
        int volume;
        String ingredients;
        double alcoholContent;
        String waterType;
        BeverageFactory beverageFactory = new BeverageFactory();

        do {
            System.out.println("------------ Beverage Factory ------------");
            System.out.println("1 - add beer");
            System.out.println("2 - add water");
            System.out.println("3 - display all");
            System.out.println("0 - stop");

            option = scanner.nextInt();
            scanner.nextLine(); // \n

            switch (option) {
                case 1:
                    System.out.println("Type of beverage: ");
                    typeOfBeverage = scanner.nextLine();

                    System.out.println("Volume: ");
                    volume = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingredients: ");
                    ingredients = scanner.nextLine();
                    scanner.nextLine();

                    System.out.println("Alcohol content in %: ");
                    alcoholContent = scanner.nextDouble();
                    scanner.nextLine();

                    Beer beer = new Beer(typeOfBeverage, volume, ingredients, alcoholContent);

                    beverageFactory.addBeverage(beer);  //dodaję piwo do napojów ogółem, do obiektu fabryka napojów

                    break;
                case 2:
                    System.out.println("Type of beverage: ");
                    typeOfBeverage = scanner.nextLine();

                    System.out.println("Volume: ");
                    volume = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingredients: ");
                    ingredients = scanner.nextLine();
                    scanner.nextLine();

                    System.out.println("Type of water: ");
                    waterType = scanner.nextLine();

                    Water water = new Water(typeOfBeverage, volume, ingredients, waterType);

                    beverageFactory.addBeverage(water);  //dodaję wodę do napojów ogółem, do obiektu fabryka napojów

                    break;

                case 3:
                    beverageFactory.displayAll();
                    break;
            }
        } while (option != 0);

        scanner.close();
    }
}
