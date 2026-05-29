public class first {
    int x = 5;
    first(int x)
    {
        System.out.println(x);
        this.x=x;
    }
    public String toString()
    {

        return "the value of x is "+x+".";
    }

}

class test{
    public static void main(String[] args) {


        first f = new first(6);
        System.out.println(f.x);
        first f2=new first(7);
        System.out.println(f2.x);
        System.out.println(f.toString());
        System.out.println(f2.toString());
    }
}
