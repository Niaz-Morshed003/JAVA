package one;

public class A {

    private String name;
    protected String uni;

    public A(String name, String uni) {
        this.name = name;
        this.uni = uni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }

   public void d1()
    {
        System.out.println("1");

    }
   public void di1()
    {
        System.out.println(this.name);
        System.out.println(this.uni);
    }
}
