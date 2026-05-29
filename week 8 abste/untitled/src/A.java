public abstract class A {
    public int price,wheels;

    public A(int price, int wheels) {
        this.price = price;
        this.wheels = wheels;
    }

    public abstract void affordability(int budget);
    public abstract void checkspeed( );

    public void disin()
    {

        System.out.println("price= "+this.price+" wheels= "+this.wheels);
    }
    public static void sayhi()
    {
        System.out.println("HI");
    }
}

