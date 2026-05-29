// CreditCard.java
public class CreditCard extends Card {
    public CreditCard(String n, String a, double m) {
        super(n, a, m);
    }

    public void withdraw(double howMuch) {
        if (howMuch > 0) {
            // credit can go negative here (credit used)
            moneyy -= howMuch;
            System.out.println("Withdrawn (Credit Used): " + howMuch);
        } else {
            System.out.println("Invalid Withdraw Amount!");
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
        System.out.print("(CreditCard)");
    }
}
