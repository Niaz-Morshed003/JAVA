public class FirstClass {

    int a = initA();
    static int x = 10;

    FirstClass() {
        this(SecondClass.b);
        System.out.println("FirstClass: no-arg ctor");
    }

    FirstClass(int a) {
        System.out.println("FirstClass: one-arg ctor, a=" + a);
    }

    static {
        System.out.println("FirstClass: static block");
    }

    public static void main(String[] args) {

        System.out.println("MAIN: start");

        FirstClass f1 = new FirstClass();
        FirstClass f2 = new FirstClass(SecondClass.b);

        f1.display();
        SecondClass.display();

        SecondClass s = new SecondClass();
        s.display();

        System.out.println("MAIN: end");
    }

    final void display() {
        System.out.println(
                "FirstClass: display(), a=" + a + ", x=" + x
        );
    }

    static {
        System.out.println("FirstClass: static block again");
    }

    int initA() {
        return 2;
    }
}

class SecondClass {

    static int b;
    int y = initY();

    {
        System.out.println("SecondClass: instance block");
    }

    SecondClass() {
        b = 8;
        System.out.println("SecondClass: no-arg ctor");
    }

    SecondClass(int b) {
        this.b = b;
        System.out.println("SecondClass: one-arg ctor, b=" + b);
    }

    static void display() {
        System.out.println("SecondClass: display(), b=" + b);
    }

    static {
        b = initB();
        System.out.println("SecondClass: static block");
    }

    static int initB() {
        System.out.println("SecondClass: static var b init");
        return 9;
    }

    int initY() {
        return 7;
    }
}
