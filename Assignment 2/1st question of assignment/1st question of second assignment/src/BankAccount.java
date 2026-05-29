import java.util.Scanner;

public class BankAccount {
    int accountnumber;
    String holdernmae;
    int balance;
    Scanner sc = new Scanner(System.in);
    BankAccount(int accountnumber,
    String holdernmae,
    int balance)
    {
        this.accountnumber= accountnumber;
        this.holdernmae= holdernmae;
        this.balance=balance;
    }
    void deposit(double amount)
    {
        System.out.println("depo for bankclass:");
        System.out.println("amount=");
        amount = sc.nextDouble();
        double newb = (balance+amount);
        System.out.println("new balance= "+newb);


    }
    void withdraw(double amount)
    {
        System.out.println("withdraw for bankclass"); System.out.println("amount="); amount = sc.nextDouble();
        double newb = balance-amount;
        System.out.println("new balance: " + newb);
    }
    void withdraw(double amount,double fees)
    {
        System.out.println("second withdraw for bankclass");System.out.println("amount=");amount = sc.nextDouble();
        System.out.println("fees="); fees = sc.nextDouble();
        double newb = balance-(amount+fees);
        System.out.println("new balance: " + newb);
    }

}
class SavingsAccount extends BankAccount {
    SavingsAccount(int accountnumber,
                   String holdernmae,
                   int balance)
    {
        super(accountnumber,holdernmae,balance);
    }
    void withdraw(double amount)
    {
        System.out.println("withdraw for savings");System.out.println("amount=");amount = sc.nextDouble();
        double newb = balance-amount;
        if (balance<amount) System.out.println("You can't withdraw.focus more on savings.");
        else System.out.println("You can withdraw");
    }

}

class  CheckingAccount extends BankAccount{
    CheckingAccount (int accountnumber,
    String holdernmae,
    int balance)
    {
        super(accountnumber,holdernmae,balance);
    }
    void withdraw(double amount)
    {
        System.out.println("withdraw for checkings"); System.out.println("amount=");amount = sc.nextDouble();
        double newb = balance-amount;
        System.out.println("taking limit");
        double limit = sc.nextDouble();
        if (balance<amount) System.out.println("You can withdraw this amount of money-"+limit);
        else if (balance>amount) System.out.println("you acn withdraw without any hassle");
        else System.out.println("You can not withdraw");
    }
}
class test {
    public static void main(String[] args) {
        System.out.println("checking for Bankacc");int an;
        String hn;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Taking an=");
        an=sc.nextInt();
        sc.nextLine();
        System.out.println("Taking hn=");
        hn = sc.nextLine();
        sc.nextLine();
        System.out.println("Taking b=");
        b=sc.nextInt();
        BankAccount ba = new BankAccount(an,hn,b);
        ba.deposit(0.0);
        ba.withdraw(0.0);
        ba.withdraw(0.0,0.0);
        System.out.println("checking for savings");int sn;
        String snn;
        int snnn;

        System.out.println("Taking sn=");
        sn=sc.nextInt();
        sc.nextLine();
        System.out.println("Taking snn=");
        snn = sc.nextLine();
        sc.nextLine();
        System.out.println("Taking snnn=");
        snnn=sc.nextInt();
        ba = new SavingsAccount(sn,snn,snnn); //ekhane ar input output nicchi na.
        ba.withdraw(0.0);
        System.out.println("checking for checking");int cn;
        String cnn;
        int cnnn;

        System.out.println("Taking cn=");
        cn=sc.nextInt();
        sc.nextLine();
        System.out.println("Taking cnn=");
        cnn= sc.nextLine();
        sc.nextLine();
        System.out.println("Taking cnnn=");
        cnnn=sc.nextInt();
        ba = new CheckingAccount(cn,cnn,cnnn);
        ba.withdraw(0.0);
    }
}

/*
ami shob output method er bhitor niyechi rai method calling er time e dummy
value call korechi. and methodgulor moddhe jodi same variable use
kori then pera nai karon local variable er importance beshi.

 */