package store;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Product> p = new ArrayList<>();

        while (true) {
            System.out.println("====== Online Shopping Store ======");
            System.out.println("1. Add Product");
            System.out.println("2. Display All Products");
            System.out.println("3. Search Product by Name");
            System.out.println("4. Calculate Total Price");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Product Type (1. Electronics, 2. Clothing, 3. Book): ");
                int choice1 = sc.nextInt();
                sc.nextLine();

                if (choice1 == 1) {
                    System.out.print("Enter Product ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Product Price: ");
                    int price = sc.nextInt();
                    System.out.print("Enter Warranty Period (in years): ");
                    int warranty = sc.nextInt();
                    p.add(new Electronics(id, name, price, warranty));
                    System.out.println("Product added successfully!");
                }
                else if (choice1 == 2) {
                    System.out.print("Enter Product ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Product Price: ");
                    int price = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Size: ");
                    String size = sc.nextLine();
                    p.add(new Clothing(id, name, price, size));
                    System.out.println("Product added successfully!");
                }
                else if (choice1 == 3) {
                    System.out.print("Enter Product ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Product Price: ");
                    int price = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    p.add(new Book(id, name, price, author));
                    System.out.println("Product added successfully!");
                    p.remove(1);
                }

            }
            else if (choice == 2) {
                System.out.println("--- All Products in Store ---");
                for (int i = 0; i < p.size(); i++) {
                    p.get(i).displayDetails();
                }
            }
            else if (choice == 3) {
                System.out.print("Enter product name to search: ");
                String input = sc.nextLine();
                for (int i = 0; i < p.size(); i++) {
                    if (input.equalsIgnoreCase(p.get(i).name)) {
                        p.get(i).displayDetails();
                    }
                }
            }
            else if (choice == 4) {
                int sum = 0;
                for (int i = 0; i < p.size(); i++) {
                    sum = sum + p.get(i).price;
                }
                System.out.println("Total Price of All Products = " + sum);
            }
            else if (choice == 5) {
                System.out.println("Exiting... Thank you for using Online Shopping Store!");
                break;
            }
            else {
                System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
