public class A {

    String name;
    int age;
    int bodycount;

    public A(String name, int age, int bodycount) {
        this.name = name;
        this.age = age;
        this.bodycount = bodycount;
    }

    void dis()
    {
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.bodycount);
    }
}
