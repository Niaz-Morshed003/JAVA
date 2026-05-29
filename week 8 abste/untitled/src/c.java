public class c extends b {
 static int x =5;
 final int y=7;
 public int age;

    public c(int price, int wheels, String model, int speed, int age) {
        super(price, wheels, model, speed);
        this.age = age;
    }

    @Override
    public void getwh() {
        System.out.println("wheels= "+ this.wheels);
    }

    @Override
    public void affordability(int budget) {
        if(this.price>budget+100) System.out.println("NEED M.");
        else System.out.println("LUCKY B");
    }

    @Override
    public void checkspeed() {
        if(this.speed>1000) System.out.println("CHOLEE.");
        else System.out.println("DHUR.");
    }//override korlei abstract gayeb;

    @Override
    public void disin() {
        super.disin();
        System.out.println("age= "+this.age);

    }

    public void hudai()
    {
        System.out.println("hudai");
    }
}
