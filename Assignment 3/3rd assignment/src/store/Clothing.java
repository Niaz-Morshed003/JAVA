package store;

public class Clothing extends Product{
    String size;
    Clothing(String id,String name,int price,String size){
        super(id,name,price); this.size=size;

    }
    void displayDetails(){
        System.out.println("Clothing-ID: "+id+", "+"Name: "+name+", "+"Price: "+price+", "+"Size: "+size);
    }
}
