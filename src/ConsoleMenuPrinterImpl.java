import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleMenuPrinterImpl implements ConsoleMenuPrinter {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void printGreetings(){
        //todo: make better greetings message
        System.out.println("zdr");
    }

    @Override
    public void printMainMenu() {
        System.out.println("1. Shop menu");
        System.out.println("2. Products menu");
        System.out.println("3. Exit");
    }

    @Override
    public void printShopMenu() {
        System.out.println("1. Add new shop");
        System.out.println("2. Update shop info");
        System.out.println("3. Delete shop info");
        System.out.println("4. Print shop info");
        System.out.println("5. Back");
    }

    @Override
    public List<String> printAddShop() {
        List<String> list = new ArrayList<>();
        System.out.print("Enter shop's name: ");
        list.add(scanner.nextLine());
        System.out.println();
        System.out.print("Enter owner's name: ");
        list.add(scanner.nextLine());
        return list;
    }

    @Override
    public void printProductMenu() {
        System.out.println("1. Add new product");
        System.out.println("2. Update product by name");
        System.out.println("3. Delete product by name");
        System.out.println("4. Show all products");
        System.out.println("5. Back");
    }

    @Override
    public List<String> printAddProduct() {
        List<String> list = new ArrayList<>();
        System.out.println("Price: ");
        list.add(scanner.nextLine());

        System.out.println("Name: ");
        list.add(scanner.nextLine());

        System.out.println("Company: ");
        list.add(scanner.nextLine());

        System.out.println("ExpireDate (yyyy-MM-dd): ");
        list.add(scanner.nextLine());
        System.out.println("Quantity: ");
        list.add(scanner.nextLine());
        return list;
    }

    @Override
    public List<String> printUpdateProduct() {
        List<String> list = new ArrayList<>();
        System.out.println("Name of the product you want to update: ");
        list.add(scanner.nextLine());
        System.out.println("Quantity: ");
        list.add(scanner.nextLine());
        return list;
    }

    @Override
    public String printDeleteProduct() {
        System.out.println("Name of the product you want to delete: ");
        return scanner.nextLine();
    }

    @Override
    public void printProducts(String products) {
        System.out.println(products);
    }

    @Override
    public void printShopData(Shop shop) {
        System.out.println(shop.getDetails());
    }

    @Override
    public void printGoodbyeMessage() {
        System.out.println("chal");
    }

    @Override
    public void printGuidance() {
        System.out.println("Enter your choice: ");
    }

    @Override
    public String getUserInput(){
        return scanner.nextLine();
    }
}
