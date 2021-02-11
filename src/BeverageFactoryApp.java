import java.util.Scanner;

public class BeverageFactoryApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "UTF-8");
        int option;
        String name;
        int volume;
        String ingredients;

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
                    System.out.println("Name: ");
                    name = scanner.nextLine();

                    System.out.println("Volume: ");
                    volume = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingredients: ");
                    ingredients = scanner.nextLine();
                    scanner.nextLine();

                    System.out.println("Alcohol content in %: ");
                    alcoholContent = scanner.nextDouble();

                    Beer beer = new Beer(name, volume, ingredients, alcoholContent);

                    beverageFactory.addBeverage(beer);  //dodaję piwo do napojów ogółem, do obiektu fabryka napojów

                    break;
                case 2:
                    break;
                case 3:
                    break;

            }


        } while (option != 0);
        scanner.close();
    }
}
