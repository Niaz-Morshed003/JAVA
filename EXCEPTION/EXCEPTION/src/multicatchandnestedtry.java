import java.util.InputMismatchException;
import java.util.Scanner;

public class multicatchandnestedtry {

    public static void main(String[] args) {
        try{

            try{ int[] a = new int[2];
                a[3]=5/0;
        } catch (ArithmeticException e)
            {
                System.out.println("cant be zero");
    } catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("array outta bound");

} catch (Exception e) {
                throw new RuntimeException(e);
            }
            try{

      int c= 5/0;    }catch (ArithmeticException e)
            {
                System.out.println("cant be zero");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try{ int[] a = new int[2];
                a[3]=5;}
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("array outta bound");
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }try {
                Scanner sc = new Scanner(System.in);
                System.out.println("a=");
                int a = sc.nextInt();
            } catch (InputMismatchException e)
            {
                System.out.println("put the proper one");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

}}