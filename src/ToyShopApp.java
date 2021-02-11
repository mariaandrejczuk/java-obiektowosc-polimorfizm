import java.util.Scanner;

public class ToyShopApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "UTF-8");
        int option;
        String name;
        double price;
        ToyShop toyShop = new ToyShop();

        do {
            System.out.println("-------------Toy Shop-----------");
            System.out.println("1 - add bear");
            System.out.println("2 - add car");
            System.out.println("3 - display all");
            System.out.println("0 - stop");

            option = scanner.nextInt();
            scanner.nextLine(); // \n


            switch (option) {
                case 1:
                    System.out.println("Name: ");
                    name = scanner.nextLine();

                    System.out.println("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine(); // przechwyca znak nowej linii \n

                    System.out.println("Material: ");
                    String material = scanner.nextLine();

                    Bear bear = new Bear(name, price, material);  //tworzę obiekt Miś
                    toyShop.addToy(bear);  //tu działa polimorfizm

                    break;

                case 2:
                    System.out.println("Name: ");
                    name = scanner.nextLine();

                    System.out.println("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine(); // przechwyca znak nowej linii \n

                    System.out.println("Type: ");
                    String type = scanner.nextLine();

                    Car car = new Car(name, price, type);  //tworzę obiekt Car
                    toyShop.addToy(car); //polimorfizm

                    break;
                case 3:
                    toyShop.displayAll();
                    break;
            }
        } while (option != 0);

        scanner.close();
    }
}
