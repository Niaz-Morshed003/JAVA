public class Outer {

    public static void main(String[] args) {
        bal:{

            for (int i = 1; i < 6; i++) { bal2 : {
                for (int j = 1; j <= 6; j++) {
                    System.out.println(i + " " + j);
                    if (j==3) {
                        System.out.println("break ");
                        break bal2;
                    }
                   if(i==5) break bal;
                }
            }
            int x = 10;
            System.out.println(x);
        }
        System.out.println("out");
    }








} }
