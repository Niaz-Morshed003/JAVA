package store;

public class Product {

    int price;
    String id;
    String name;
    Product(String id,String name,int price){
        this.id=id;
        this.name=name;
        this.price=price;

    }
    void displayDetails(){
        System.out.println("ID: "+id+" "+"Name: "+name+" "+"Price: "+price);
    }
}
