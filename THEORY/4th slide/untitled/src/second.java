public class second {
    void ok()
    {
        System.out.println("ok");
    }
}
class third extends second
{
    void notokay()
    {
        System.out.println("notokay");
    }
}
class testt
{
    public static void main(String[] args) {
        second s = new third();
        third t = (third)s;
        t.notokay();
    }
}