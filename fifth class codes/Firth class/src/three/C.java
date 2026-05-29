package three;
import two.B;

public class C extends B {

    private int id;
    protected int cgpa;

    public C(String name, String uni, String fn, String mn, int id, int cgpa) {
        super(name, uni, fn, mn);
        this.id = id;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCgpa() {
        return cgpa;
    }

    public void setCgpa(int cgpa) {
        this.cgpa = cgpa;
    }

   public void d3()
    {
        System.out.println("3");
    }

    @Override
    public void di1() {
        super.di1();
        System.out.println(this.id);
        System.out.println(this.cgpa);
    }
}
