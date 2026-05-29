package store;

public class Electronics extends Product{
    int warranty;
    Electronics(String id,String name,int price,int warranty){

        super(id,name,price); this.warranty=warranty;
    }
    void displayDetails(){
        System.out.println("Electronics-ID: "+id+", "+"Name: "+name+", "+"Price: "+price+", "+"Warranty: "+warranty+" "+"years");
    }
}

