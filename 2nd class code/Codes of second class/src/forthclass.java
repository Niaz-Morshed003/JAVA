public class forthclass {
    float msrks,cgpa;
    String name;
    forthclass(float msrks,float cgpa,String name)
    {
        this.msrks=msrks;
        this.cgpa=cgpa;
        this.name=name;

    }

    void dis1(float a)
    {
        System.out.println("Printing details");
        System.out.println(msrks+" "+cgpa+" "+name);
    }
    void extr(float y)
    {
        msrks=msrks+y;
        System.out.println("updated marks="+msrks);
    }
}
class test {
    public static void main(String[] args) {
        forthclass fr = new forthclass(90.3f,3.45f,"niaz");
        fr.dis1(0.0f);
        fr.extr(9.9f);
    }
}