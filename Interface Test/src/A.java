public interface A {
    static int a =5;
    void b ();

}

 interface B extends A {
    void c ();//void b already chole ashche

 }

   class C implements A, B {
    public void b ()
    {
        System.out.println("a");
    }
    public void c ( ) {
        System.out.println("b");}
        void d () {
            System.out.println("c");}
    }
    class test {
        public static void main(String[] args) {
            B b;
            b = new C ();
            b.b();
            b.c();
            C c = new C();
            c.d();
            c.b();
            c.c();
            c.d();

        }

 }
 /*b reference just use hoy interfece B te thaka method a and b er jonno karon b
 create hoyeche B theke.class C jehetu abstract na tai er object create kore d method access korlam.
 amar logic onujayi C te b,c,d shob thaka uchit so C er reference variable diye try kore dekhi.
  Hae, kaj hoy. One more important thing, interfece er moddhe thaka abstract method gula class er bhitor use
  korar time e public use korte hobe.*/