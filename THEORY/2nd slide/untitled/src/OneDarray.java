public class OneDarray {

    public static void main(String[] args) {
        int [] sam1 = new int [03];
        int [] sam2;
        sam2 = new int [04];
        int [] sam3 = {1,2,3};
        int [] sam4;
        sam4 = new int[] {3,4,5};
       // int [] sam5 ;
        //sam5={1,2,3,4};bhul
        sam1[0] = 1;
        sam1[1] = 2;
        sam1[2] = 3;
        sam2[0]=4;
        sam2[1]=5;
        sam2[2]=6;
        sam2[3]=7;

        System.out.println(sam1.length);
        System.out.println(sam2.length);
        System.out.println(sam3.length);
        System.out.println(sam4.length);
        int a = sam1[2];
        int b = sam2[3];
        System.out.println(a);
        System.out.println(b);


    }
}
