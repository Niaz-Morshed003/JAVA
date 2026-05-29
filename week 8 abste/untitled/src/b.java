public abstract class b extends A {
    public b(int price, int wheels, String model, int speed) {
        super(price, wheels);
        this.model = model;
        this.speed = speed;
    }

    public String model;
    public int speed;

    @Override
    public void affordability(int budget) {
        if(this.price>budget) System.out.println("NEED MORE.");
        else System.out.println("LUCKY");
    }

    @Override
    public void checkspeed() {
        if(this.speed>100) System.out.println("CHOLE.");
        else System.out.println("NO.");
    } //jehetu abstract class extend kortese tai
       //override method e ar abstract nai
    public abstract void getwh();

    @Override
    public void disin() {
        super.disin();
        System.out.println("model= "+this.model+" speed= "+this.speed);

    }
}
