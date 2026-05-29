package store;

public class Book extends Product{
    String author;
    Book(String id,String name,int price,String author){
        super(id,name,price); this.author=author;

    }
    void displayDetails(){
        System.out.println("Book- ID: "+id+", "+"Name: "+name+", "+"Price: "+price+", "+"Author: "+author);
    }
}

