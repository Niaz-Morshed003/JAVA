public class Car {

    int price;
    float speed;
    boolean start;
    String name;
     int detail (int p,float s,boolean s1,String n)
     {
         if(s>85)
             System.out.println("the speed of "+n+" is "+s);
         else System.out.println("chole na ,beta.");
         if(p>10000000)
             System.out.println("the price of "+n+" is "+p);
         else System.out.println("shosta ,beta.");
         if(s1== true)
             System.out.println("ho choltese");
         else{ start=true;
             System.out.println("chalu hoise ekhon");}
         return 69;



     }
}
class Test {

    public static void main(String[] args) {
        Car car = new Car();
        car.price = 11000000;
       car.speed = 156.89f;
       car.name = "BMW";
       car.start = true;
       car.detail(1000,6.66f,false,"Mercedes");
    }
}