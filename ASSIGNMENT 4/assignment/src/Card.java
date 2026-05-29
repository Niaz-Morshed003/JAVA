// Card.java
// abstract base class - silly names but works
abstract public class Card {
    String namey;
    String accnum;
    double moneyy;
    static int totalAcc = 0;

    public Card(String n, String a, double m) {
        namey = n;
        accnum = a;
        moneyy = m;
        totalAcc++;
    }

    // withdraw must be implemented by subclasses
    abstract public void withdraw(double howMuch);

    // check balance common to all
    public void check_balance() {
        System.out.println("Current Balance: " + moneyy);
    }

    // default: deposit not available (SalaryCard will use this)
    public void deposit(double amt) {
        System.out.println("Deposit not available for this card!");
    }

    // show the type in a childish way
    abstract public void showType();
}
