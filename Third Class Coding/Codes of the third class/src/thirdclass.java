import java.util.ArrayList;

public class thirdclass {
    public static void main(String[] args) {
         ArrayList<Integer> m = new ArrayList<>();
         m.add(10);
        m.add(20);
        m.add(30);
        m.add(40);
        System.out.println(m.get(0));
        System.out.println(m.get(1));
        System.out.println(m.get(2));
        System.out.println(m.get(3));
        m.set(0,1);
        m.set(1,11);
        m.set(2,21);
        m.set(3,21);
        System.out.println(m.get(0));
        System.out.println(m.get(1));
        System.out.println(m.get(2));
        System.out.println(m.get(3));
m.remove(3);
for (int j =0;j<m.size();j++)
{
    System.out.println(m.get(j));}








    }
}
