import javax.lang.model.element.Name;
import java.util.Scanner;

public class Student {
    int rollnumber;
    String name,department;
    Scanner sc = new Scanner(System.in);

    public Student(int rollnumber, String name, String department) {
        this.rollnumber = rollnumber;
        this.name = name;
        this.department = department;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    private int s;

    String calculateGrade(int a)
{

    if (a>=90) {
        System.out.println("You suck!"); return "A";}
    if (a>=85) {
        System.out.println("You less suck!"); return "A-";}
    if (a>=80) {
        System.out.println("You less lss suck!"); return "B+";}
    if (a>=75) {
        System.out.println("You so so!"); return "B";}
    if (a>=70) {
        System.out.println("You ok!"); return "B-";}
    else {
        System.out.println("You go,Champ.I am with you!");return "F";

}}
    //jei variable diye parameter name dilam sheta method er moddhe na use korai better
    String calculateGrade(int [] marks) {

        int n;int sum=0;
        System.out.println("n=");
        n = sc.nextInt();
        int[] m = new int[n];
        System.out.println("Taking n amount of array marks");
        for (int i =0;i<n;i++)
        {
            m[i]=sc.nextInt();
            sum=sum+m[i];}
            int average = sum/n;
        String q = calculateGrade(average);
        return q;



    }
    void participate()
    {
        System.out.println(name+"This student participates in generala activities");
    }
}

class UndergraduateStudent extends Student {
    UndergraduateStudent (int rollnumber,String name,String department)
    {
        super(rollnumber, name, department);


    }
    void participate()
    {
        System.out.println(name+" "+"This student participates in clubs");
    }


}

//ei subclass e just ekta method override korechi ar baki duita parent class theke auto ashche.

class GraduateStudent extends Student {
    GraduateStudent (int rollnumber,String name,String department)
    {
        super(rollnumber, name, department);


    }

    String calculateGrade(int a)
    {

        if (a>=95) {
            System.out.println("You suck!"); return "A";}
        if (a>=90) {
            System.out.println("You less suck!"); return "A-";}
        if (a>=85) {
            System.out.println("You less lss suck!"); return "B+";}
        if (a>=80) {
            System.out.println("You so so!"); return "B";}
        if (a>=75) {
            System.out.println("You ok!"); return "B-";}
        else {
            System.out.println("You go,Champ.I am with you!");return "F";

        }}
    void participate()
    {
        System.out.println(name+" This student participates in research seminars");
    }
}

//ei subclass e duita method override korechin karon oi arraywala method overload korte bolse override na.

class Testing {
    public static void main(String[] args) {

        //amra ekhane parent class er object crate korbo na karon parent class er kono data chay nai
        //chawa hoyeche undergrad and grad strudents der specialized data
        //parent class er generalmethod gula amra ei class e bebohar korechi ekhon egula
        // subclass gular reference ariable use kore access korbo
        UndergraduateStudent u = new UndergraduateStudent(1,"Niaz","CSE");
        GraduateStudent g = new GraduateStudent(2,"Raiyan","BBA");

       int fu,fg;
        System.out.println("Taking single mark for an undergrad:");
        Scanner sc = new Scanner(System.in);
        fu = sc.nextInt();


        u.calculateGrade(fu);
        u.calculateGrade(new int[0]);
        u.participate();

        System.out.println("Taking single mark for a grad:");

        fg = sc.nextInt();


        g.calculateGrade(fg);
        g.calculateGrade(new int[0]);
        g.participate();


    }
}


/*
kahini hocche ami jehetu array ache oi method er bhitor input niyechi tai notun kore psvm
e input neyar dorkar nei,but jehetu parameterized method so kichu na kichu pass korte hobe tai dummy value pass korechi
ami first e single mark er methid o mnethod er bhitor input niyechilam
pore dekhlam jhamela hoy karon ei method arraywala method er shathe interconnected
avearage value pass korleo sheta abar first theke user theke input chay tai avearge passing
overshadow hoye jay.
one more thing,student class er moddhe scanner enechilam ja inherit kore subclasses duita peyeche tai
subclasses e anaa lagee nai,kintu psvm er bhitor notun kore ana legecge karon psvm static ,method
student and subclasses er jonno sc hocche instance variable,static methodn er bhior
instance variable access kora jay mna.
sorry for all the silly comments,sir. CT or mid er agee kaj e lagbe!

 */