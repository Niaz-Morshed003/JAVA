package two;
import one.A;

public class B extends A{

    private String fn;
    protected String mn;



    public String getFn() {
        return fn;
    }

    public B(String name, String uni, String fn, String mn) {
        super(name, uni);
        this.fn = fn;
        this.mn = mn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getMn() {
        return mn;
    }

    public void setMn(String mn) {
        this.mn = mn;
    }
   public void d2()
    {
        System.out.println("2");
    }

    public void di1()
    { super.di1();
        System.out.println(this.fn);
        System.out.println(this.mn);


    }
}
