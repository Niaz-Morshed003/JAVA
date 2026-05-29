public class ok {

    static void checkA() {
        System.out.println("Inside checkA");
        try {
            System.out.println("Inside try of checkA");
            int[] arr = new int[4];
            arr[5] = 7; // RuntimeException
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught inside catch of checkA");
            throw new RuntimeException();
        } finally {
            System.out.println("Inside finally of checkA");
        }
    }

    static void checkB() {
        System.out.println("Inside checkB");
        try {
            System.out.println("Inside try of checkB");
            checkA();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught inside catch1 of checkB");
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught inside catch of checkB");
            throw new IllegalArgumentException();
        } finally {
            System.out.println("Inside finally of checkB");
        }
    }

    public static void main(String[] args) {
        System.out.println("Main function start");
        try {
            System.out.println("Inside outer try of main");
            try {
                checkB();
                System.out.println("Inside inner try of main");
                throw new RuntimeException("Thrown from try of main");
            } catch (ArithmeticException e) {
                System.out.println("Exception caught inside inner catch of main");
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Inside inner finally of main");
            }
        } catch (RuntimeException e) {
            System.out.println("Exception caught inside outer catch of main");
            System.out.println(e.getMessage());
        }

        System.out.println("Main function end");
    }
}
