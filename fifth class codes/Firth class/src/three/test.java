package three;
import one.A;
import two.B;


public class test {
    public static void main(String[] args) {
    A a = new A ("niaz","uiu");
    a.d1();
    a.di1();
    a = new B ("niaz","uiu","x","y");
    a.d1();
    a.di1();
    B b = new B ("niaz","uiu","x","y");
    b.d1();
    b.d2();
    b.di1();
    b = new C ("niaz","uiu","x","y",2,3);
    b.d1();
    b.d2();
    b.di1();
    C c = new C ("niaz","uiu","x","y",2,3);
   c.d1();
   c.d2();
   c.d3();
   c.di1();
    }
}
//eshob public provate niye khelte gele method er agee shobshomoy method er agee public diba