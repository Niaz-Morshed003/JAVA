import java.util.Scanner;

public class Throw {

    public static void div (int a,int b) throws ArithmeticException
    {

        if(b==0)
            throw new ArithmeticException("cant be 0");
        else System.out.println("result="+a/b);
    } //main er upor thakbe always

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); try{
            System.out.println("a=");
            int a= sc.nextInt();
            System.out.println("b=");
            int b= sc.nextInt();

            div(a,b);
            System.out.println("kire");


        } catch (ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("cant 0");
    } catch(Exception e)
        {}
}}
