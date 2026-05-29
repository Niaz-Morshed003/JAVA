


import java.util.Scanner;

public class secondclass {
    public static void main(String[] args) {
        System.out.println("taking name");
        Scanner sc = new Scanner(System.in);
        String nam;
        nam = sc.nextLine();
        System.out.println("taking id");
        int i = sc.nextInt();
        System.out.println("taking cgpa");
        float cg = sc.nextFloat();
        System.out.println("taking array marks");
        int[] mak = new int[3];
        for (int in = 0; in <3; in++) {

            mak[in] = sc.nextInt();


        }
        firstclass f2 = new firstclass(nam, i, cg,mak);
        System.out.println(f2.toString());
    }
}

/*
so object er bhitor just array er nam dilei hoy,like mak,no symbol or nothing
 */