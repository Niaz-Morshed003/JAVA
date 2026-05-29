import java.util.Scanner;

public class userdefined extends Exception {

    public userdefined(String message) {
        super(message);
    }
}
class person {
  private int age;

    public person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void invalid (int age) throws userdefined
    {

        if(age<0)
             throw new userdefined("cant be negative");
        else System.out.println("all good");
    }


}

class test1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        person p = new person(a);
        try {
            p.invalid(a);
            System.out.println("no issue");
        }catch (userdefined e)
        {
            System.out.println("cant be negative");
    } catch (Exception e) {
            throw new RuntimeException(e);
        }



}}