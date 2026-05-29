public class TwoD {
    public static void main(String[] args) {
        int [][] s1 = new int [5][5];
        int [][] s2 = new int [3][];
        s2[0]=new int [5];
        s2[1]=new int [6];
        int [][] s3 = new int [2][2];
        s3[0]=new int [] {4,5,6};
        s3[1]=new int [] {1,2,3};
        int [][] s4 = new int [3][];
        s4[0]= new int []{1,2};
        s4[1]=new int [] {4,5,6};
        s4[2] = new int [] {7,8,9};
        for (int i=0;i<s3.length;i++)
        { for(int j =0 ; j<s3[i].length;j++)
        {
            System.out.print(s3[i][j]+" ");

    }
            System.out.println();
} System.out.println();
        for (int i=0;i<s4.length;i++)
        { for(int j =0 ; j<s4[i].length;j++)
        {
            System.out.print(s4[i][j]+" ");

        }
            System.out.println();
        }

        System.out.println();

        int [][] s5 = {{1,2,3,5},{4,5,6,7,8,9},{1,6,7,8,8},{1,2}};
        for(int [] ok : s5 )
        {
        for(int el : ok)
        {
            System.out.print(el+" ");

    }
            System.out.println();}
        System.out.println();

    int [] s6;
        s6=new int [] {1,2,3};
        for(int ell : s6)
            System.out.print(ell+" ");





    }}
