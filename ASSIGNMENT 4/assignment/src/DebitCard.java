// DebitCard.java
public class DebitCard extends Card {
    public DebitCard(String n, String a, double m) {
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

    public void deposit(double amt) {
        if (amt > 0) {
            moneyy += amt;
            System.out.println("Deposited: " + amt);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    public void showType() {
        System.out.print("(DebitCard)");
    }
}
