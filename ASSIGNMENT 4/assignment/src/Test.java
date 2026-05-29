// Test.java
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Card> mycards = new ArrayList<>();
        int op = 0;

        System.out.println("=== BANK CARD MANAGEMENT SYSTEM ===");

        while (true) {
            System.out.println("1. Create Debit Card");
            System.out.println("2. Create Credit Card");
            System.out.println("3. Create Salary Card");
            System.out.println("4. Perform Transaction");
            System.out.println("5. Show Total Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            op = sc.nextInt();

            if (op == 1) {
                System.out.print("Enter Name: ");
                String n = sc.next();
                System.out.print("Enter Account Number: ");
                String a = sc.next();
                System.out.print("Enter Initial Balance: ");
                double b = sc.nextDouble();
                mycards.add(new DebitCard(n, a, b));
                System.out.println("Account Created Successfully!");
            } else if (op == 2) {
                System.out.print("Enter Name: ");
                String n = sc.next();
                System.out.print("Enter Account Number: ");
                String a = sc.next();
                System.out.print("Enter Initial Balance: ");
                double b = sc.nextDouble();
                mycards.add(new CreditCard(n, a, b));
                System.out.println("Account Created Successfully!");
            } else if (op == 3) {
                System.out.print("Enter Name: ");
                String n = sc.next();
                System.out.print("Enter Account Number: ");
                String a = sc.next();
                System.out.print("Enter Initial Balance: ");
                double b = sc.nextDouble();
                mycards.add(new SalaryCard(n, a, b));
                System.out.println("Account Created Successfully!");
            } else if (op == 4) {
                if (mycards.isEmpty()) {
                    System.out.println("No accounts yet! Make one first bro!");
                    continue;
                }

                System.out.println("Select Account by Index:");
                for (int i = 0; i < mycards.size(); i++) {
                    System.out.print(i + " -> " + mycards.get(i).namey + " ");
                    mycards.get(i).showType();
                    System.out.println();
                }

                System.out.print("Enter index: ");
                int idx = sc.nextInt();
                if (idx < 0 || idx >= mycards.size()) {
                    System.out.println("Invalid index silly!");
                    continue;
                }

                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.print("Enter choice: ");
                int c2 = sc.nextInt();

                if (c2 == 1) {
                    System.out.print("Enter Deposit Amount: ");
                    double amt = sc.nextDouble();
                    mycards.get(idx).deposit(amt);
                } else if (c2 == 2) {
                    System.out.print("Enter Withdraw Amount: ");
                    double amt = sc.nextDouble();
                    mycards.get(idx).withdraw(amt);
                } else if (c2 == 3) {
                    mycards.get(idx).check_balance();
                } else {
                    System.out.println("Wrong choice bro!");
                }
            } else if (op == 5) {
                System.out.println("Total Accounts Created: " + Card.totalAcc);
            } else if (op == 6) {
                System.out.println("Exiting... Thank youuu :D");
                break;
            } else {
                System.out.println("Invalid choice! Try again kiddo!");
            }
            System.out.println();
        }


    }
}
