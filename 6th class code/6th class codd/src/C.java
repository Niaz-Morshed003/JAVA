import java.util.ArrayList;
import java.util.Scanner;

public class C {

    public static void main(String[] args) {
        ArrayList <A> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        int n = sc.nextInt();
        for(int i =0;i<n;i++)
        {
            System.out.println("gonna print for"+(i+1));
            sc.nextLine();//string input neyar agee shobshomoy ekta new line
            System.out.println("name=");
            String name = sc.nextLine();

            System.out.println("age=");
            int age = sc.nextInt();
            System.out.println("bodycount=");
            int bc = sc.nextInt();
          a.add(new A(name,age,bc));
          a.get(i).dis(); //get just arraylist e kaj e lage
    }
        System.out.println("serach=");
        int search = sc.nextInt();

        for(int i=0;i<n;i++)//dot length arraylist e kam kore na
        { int m = 0; int c;
            if (search==a.get(i).bodycount)
        {
            System.out.println("you got it");
        m=1;}

            if (m==0)
            {
                System.out.println("You have not got it"); System.out.println("going for another time if it allows");

} if (i==n-1)
        {
            System.out.println("tomar time shesh tomar ar chodan lagbo na.");
        } }
    a.set(1,new A("xy",69,22));
    for(int i =0;i<n;i++)
    {

    a.get(i).dis();
    }}}

//either set dite hobe or remove dite hobe dhoro tumi 0 index remove dila tokhon 1 index 0 hobe so
//1 index set korle error ashbe karon tokhon kono 1 index exist kore na
//jei index remove korba sheta set deyar kichu nai
