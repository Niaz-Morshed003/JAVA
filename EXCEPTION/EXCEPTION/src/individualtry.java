import java.util.InputMismatchException;
import java.util.Scanner;

public class individualtry {


    public  static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        try
        {
            System.out.println("a= ");
            int a= sc.nextInt();
            System.out.println("b= ");
            int b= sc.nextInt();
            int div = a/b;
            System.out.println("kire");}
        catch (ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("cant be 0");
        try
        {
            System.out.println("a= ");
            int a= sc.nextInt();
            System.out.println("b= ");
            int b= sc.nextInt();

            System.out.println("kire");}
        catch (InputMismatchException a)
        {
            System.out.println(a);
            System.out.println("put appropiate input");
        }
        try{
            int n = sc.nextInt();
            int[] y = new int [8];
            y[9]=0;
            System.out.println("kire?");}
            //try e kono bhul na thakle eta print hobe.

        catch(Exception b)
        {

            System.out.println("unknown");

        }
        finally {
            System.out.println("no matter what,eta print hobei");
        }
    }
}}

//prottek try er por ekta kore catch thakte hobe

