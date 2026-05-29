public class one {


    public static void main(String[] args) {
        try {
            int a,b;
            a=6;b=0;
            int divi = a/b;
            System.out.println("res="+" "+divi);
        }
        catch (ArithmeticException a)
        {

            System.out.println(a);
            System.out.println("cant be divided by zero");
        }
    }
}
