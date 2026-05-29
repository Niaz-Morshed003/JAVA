import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        int n = sc.nextInt();
        A[] a = new A[n];
        for(int i =0;i<a.length;i++)
        {
            System.out.println("gonna print for"+(i+1));
            sc.nextLine();//string input neyar agee shobshomoy ekta new line
            System.out.println("name=");
            String name = sc.nextLine();

            System.out.println("age=");
            int age = sc.nextInt();
            System.out.println("bodycount=");
            int bc = sc.nextInt();
            a[i] = new A(name,age,bc);
            a[i].dis();




    }
}}
