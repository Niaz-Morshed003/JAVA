public class first {
    String nam;
    String type;
    int id;
    first (String nam,String type,int id)
    {
        this.nam= nam;
        this.type = type;
        this.id = id;
    }
    public void pd1 ()
    {
        System.out.println("name= "+this.nam);
        System.out.println("type= "+this.type);
        System.out.println("id= "+this.id);
    }
       int getid()
       {
           return this.id;
       }
}


