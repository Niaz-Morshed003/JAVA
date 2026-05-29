import java.util.Arrays;

public class firstclass {
    String name;
    int id;
    float cgpa;
    int [] m = new int [3];

    firstclass (String name,int id,float cgpa,int []m)
    {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;

        for (int i =0;i<3;i++)
        { this.m[i] = m [i] ;
    }
}

public String toString ()
{
    return "name: "+name+" "+"id: "+id+" "+"cgpa: "+cgpa+" "+"n: "+ Arrays.toString(m);
}
}
