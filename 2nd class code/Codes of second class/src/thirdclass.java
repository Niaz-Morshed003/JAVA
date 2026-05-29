import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class thirdclass {
    public static void main(String[] args) {
        System.out.println("taking n");
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        sc.nextLine();
        String[] s = new String[n];
        System.out.println("gonna take the strings now!");
        for(int x=0;x<s.length;x++)
        { s[x] = sc.nextLine();

    }  System.out.print(Arrays.toString(s));


}}
