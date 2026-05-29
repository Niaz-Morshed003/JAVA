import java.util.ArrayList;

public class forthclass {
    public static void main(String[] args) {


    ArrayList <firstclass> mak = new ArrayList<>();
    firstclass f1 = new firstclass("niaz",333,2.9f,new int[]{10,20,30});

    firstclass f2 = new firstclass("moaz",343,5.9f,new int[]{10,40,30});
    mak.add(f1);
        mak.add(f2);
       for(int i =0;i< mak.size();i++)
       {
           System.out.println(mak.get(i));}
       mak.remove(0);
        for(int i =0;i< mak.size();i++)
        {
            System.out.println(mak.get(i));}

        firstclass f3 = new firstclass("sax",333,2.9f,new int[]{10,23});
        mak.set(1,f3);
        for(int j =0;j<mak.size();j++)
        {
            System.out.println(mak.get(j));}






}}

/*
When you remove an element from an ArrayList,
all the elements after it move one position to the left.
There is no empty slot left at the removed index.shrink hoy
So you cannot use set() at an index that does not exist.
If you want to put a new element at that position, use add() instead.
*/