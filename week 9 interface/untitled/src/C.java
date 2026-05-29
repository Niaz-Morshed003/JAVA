import java.util.Scanner;

public class C implements A,B {

    boolean eng = false ;
     int speed = 100;

    @Override
    public void start() {
        if (eng==false)
        { eng = true;
            System.out.println("started");
    }
        else if (eng==true) {
            System.out.println("not started");
}
else {
            System.out.println("other issue");
}
    }

    @Override
    public void incs(int nspeed) {
        if (eng){
        if (nspeed>0)
        {System.out.println("new speed= "+(speed+nspeed));
    } else System.out.println("it is lower than 0");
} else System.out.println("not started");}


    @Override
    public void decs(int nspeed) {
        if (eng){
            if (nspeed>0)
            {System.out.println("new speed= "+(speed-nspeed));
            } else System.out.println("it is lower than 0");
        } else System.out.println("not started");}


    @Override
    public void push() {

        int speed = 100;
        if(eng)
        { if(speed==0)
        {
            System.out.println("pushed");
    } else if (speed!=0) {
            System.out.println("not = 0");
        }
} else System.out.println("kono labh nai");}

    @Override
    public void checkit() {
        System.out.println("checked");
    }

    @Override
    public void hudai2() {
        A.super.hudai2();
        System.out.println("hudai2");
    }
}

