import java.util.InputMismatchException;
import java.util.Scanner;

public class problemone {
    int a,b;

    public problemone(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void addsub (int a, int b) throws Exception
    {
        if(a<0||b<0)
        {
            throw new ArithmeticException("cant be negative");
        }
        else
        {
            System.out.println("add="+(a+b));
            System.out.println("sub ="+(a-b));

    }
}public  void divm (int a,int b) throws Exception
    {
        if(a==0||b==0)
        {
            throw new ArithmeticException("cant be 0");
        }
        else
        {
            System.out.println("mul="+(a*b));
            System.out.println("div="+(a/b));

        }
    }}

class test {

    public static void main(String[] args) {


        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("a= ");
            int a = sc.nextInt();
            System.out.println("b= ");
            int b = sc.nextInt();
            problemone prob1 = new problemone(a, b);
            prob1.addsub(a, b);


        } catch (ArithmeticException e) {
            System.out.println("cant be negative");

        } catch (InputMismatchException e) {
            System.out.println("put proper valur");
        }
        catch(Exception e)
        {
            System.out.println("e");}



    try {
        Scanner sc = new Scanner(System.in);
        System.out.println("a= ");
        int a = sc.nextInt();
        System.out.println("b= ");
        int b = sc.nextInt();
        problemone prob2 = new problemone(a, b);
        prob2.divm(a, b);


    } catch (ArithmeticException e) {
        System.out.println("cant be 0");

    } catch (InputMismatchException e) {
        System.out.println("put proper valur");
    } catch (Exception e) {
        System.out.println(e);
    }

    } }