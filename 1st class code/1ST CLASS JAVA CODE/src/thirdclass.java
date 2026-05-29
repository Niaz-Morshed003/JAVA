import java.util.Scanner;

public class thirdclass {
    public static void main(String[] args) {
        int x,y;
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("x= ");

        x = sc.nextInt();
        System.out.print("y= ");

        y = sc.nextInt();
        sc.nextLine(); //int theke string e shift korbo tai newline dilam.
        System.out.print("s=");
        s = sc.nextLine();
        char d = s.charAt(0);
        char e = s.charAt(38);
        System.out.println("x,y,s,d,and e = "+x+"   "+y+"    "+s+"  "+d+"   "+e);

    }
}
