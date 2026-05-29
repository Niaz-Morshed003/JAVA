import java.util.Scanner;

public class secondclass {
    public static void main(String[] args) {
        char c;String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("taking s=");
        s = sc.nextLine();
        System.out.println("taking c=");
        c = sc.next().charAt(0);
        System.out.println("s and c respectively are: "+s+" "+c);
        System.out.println(s.length());
        for(int i =0;i<s.length();i++)
        { if (s.charAt(i)==' ') System.out.println("Hi");
else System.out.println("let it go");}
 String a = s.toUpperCase();
        String b = s.toLowerCase();
        System.out.println("printing updated versions of s :"+" "+a+" "+b);

    }
}
