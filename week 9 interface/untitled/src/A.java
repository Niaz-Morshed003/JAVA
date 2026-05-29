public interface A {
    int x = 10; //bydefault static final
    void start ();
    void incs (int nspeed);
    void decs(int nspeed);
    void push();
    //egula bydefault abstract karon interface e nothing non abs
    public static void hudai ()
    {
        System.out.println("eta inherit kora jabee na static tai");
    }
     default void hudai2 ()
     {
         System.out.println("default dekhe eta inherit kora jabe");
     }


}
