import java.util.InputMismatchException;
import java.util.Scanner;

public class multiex {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        try
        {
            System.out.println("a= ");
            int a= sc.nextInt();
            System.out.println("b= ");
            int b= sc.nextInt();
            int div = a/b;
            System.out.println("kire?");
                                        //try e kono bhul na thakle eta print hobe.


        } catch (ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("cant be 0");
        } catch (InputMismatchException a)
        {
            System.out.println(a);
            System.out.println("put appropiate input");
    }
        finally {
            System.out.println("no matter what,eta print hobei");
        }
        }
}
