import java.util.Scanner;

public class secprob extends Exception {
    public secprob(String message) {
        super(message);
    }
}

class product
{
   private int p;

    public product(int p) {
        this.p = p;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public void checkp(int p) throws secprob
    {
        if(p<100) throw new secprob("cant be less than 100");
        else System.out.println("p="+p);
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        product pro = new product(a);
        try{ pro.checkp(a);
            System.out.println("all good");

        } catch (secprob e)
        {
            System.out.println("cant be less than zero");
    } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }}

