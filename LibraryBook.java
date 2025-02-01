//Base Class
class Books{
    String name, author;
    Double price;
    public Books(String name,String author,Double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public void DisplayInfo(){
        System.out.println("Book Name : " + this.name);
        System.out.println("Book Author : " + this.author);
        System.out.println("Book Price : "  + this.price + "rs");
    }
}
//Derived class 1 for storing fictiional books collection...
class FictionalBooks extends Books{
    public FictionalBooks(String name,String author,Double price){
        super(name,author,price);
    }

    @Override
    public void DisplayInfo(){
        System.out.println("---Fictional Books---");
        super.DisplayInfo();
    }
}
//Derived class 2 for storing non fictional books collection...
class NonFictionalBooks extends Books{
    public NonFictionalBooks(String name,String author,Double price){
        super(name,author,price);
    }

    @Override
    public void DisplayInfo(){
        System.out.println("---Non Fictional Books---");
        super.DisplayInfo();
    }
}



public class LibraryBook {
    public static void main(String[] args) {

        //Making Object of Different Books
        FictionalBooks HarryPotter = new FictionalBooks("Harry Potter", "J K Rowling", 300.0);
        NonFictionalBooks Javaabg = new NonFictionalBooks("Java: A beginner's Guide", "Herbert Schildt", 500.0);

        //Displaying info of above created books...
        HarryPotter.DisplayInfo();
        System.out.println();
        Javaabg.DisplayInfo();
        System.out.println();
    }
}
