// SalaryCard.java
public class SalaryCard extends Card {
    public SalaryCard(String n, String a, double m) {
        super(n, a, m);
    }

    public void withdraw(double howMuch) {
        if (howMuch > 0 && howMuch <= moneyy) {
            moneyy -= howMuch;
            System.out.println("Withdrawn: " + howMuch);
        } else {
            System.out.println("Invalid or Insufficient Balance!");
        }
    }

    // deposit() not overridden -> uses Card.deposit() which says "not available"
    public void showType() {
        System.out.print("(SalaryCard)");
    }
}
