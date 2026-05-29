import java.util.Scanner;

public class test {
    public static void main(String[] args)

     {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter details for second class object:");
        System.out.print("Name: ");
        String name2 = sc.nextLine();
        System.out.print("Type: ");
        String type2 = sc.nextLine();
        System.out.print("ID: ");
        int id2 = sc.nextInt();
        System.out.print("Speed: ");
        int speed2 = sc.nextInt();

        second s = new second(name2, type2, id2, speed2);

        System.out.println("\nSecond class object details:");
        s.pd2();
        System.out.println("ID via getParentId(): " + s.getid());
        System.out.println("Speed via getspeed(): " + s.getspeed());
        System.out.println("\nPrinting all details manually:");
        System.out.println("Name: " + name2);          // from input
        System.out.println("Type: " + type2);
        s.id=200;
        s.speed=500;// from input
        System.out.println("ID: " + s.getid());        // using inherited parent method
        System.out.println("Speed: " + s.getspeed());  // using child method


    }

}  //getid ar getspeedke ektu use korlam
