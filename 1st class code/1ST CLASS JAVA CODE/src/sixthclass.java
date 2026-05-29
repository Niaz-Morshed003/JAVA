 import java.util.Scanner;

public class sixthclass {
    void add ()
    {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("x=");
        x = sc.nextInt();
        System.out.println("y=");
        y = sc.nextInt();
        System.out.println(" The sum of x and y is ="+(x+y));
    }
}
class test{
    public static void main(String[] args) {
        sixthclass six = new sixthclass();
        six.add();
    }
}
