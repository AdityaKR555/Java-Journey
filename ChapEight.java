

class Employee{
    int salary;
    String name;
    int getSalary(){
        return salary;
    }
    void setName(String n){
        name = n;
    }
    String getName(){
        return name;
    }
}

class Phone{
    void ring(){
        System.out.println("Phone is ringing....");
    }
    void vibrate(){
        System.out.println("Phone is vibrating...");
    }
    void callAFriend(){
        System.out.println("Calling sonu....");
    }
}

class Rectangle{
    int length, breadth;
    void setLB(int l, int b){
        length = l;
        breadth = b;
    }
    void area(){
        System.out.println("Area = "+ length*breadth);
    }
    void perimeter(){
        System.out.println("Perimeter = "+ 2*(length*breadth));
    }
}

class Game{
    void run(){
        System.out.println("Player is running....");
    }
    void hit(){
        System.out.println("Player is hitting...");
    }
    void fire(){
        System.out.println("Player is firing....");
    }
}


public class ChapEight {
    public static void main(String[] args) {
        

    // Question 1 :-
    Employee aadi = new Employee();
    aadi.setName("Aditya");
    aadi.salary = 7000000;
    System.out.println(aadi.getSalary());
    System.out.println(aadi.getName());

    // Question 2 :-
    Phone galaxy = new Phone();
    galaxy.ring();
    galaxy.vibrate();
    galaxy.callAFriend();

    // Question 3 :-
     Rectangle x = new Rectangle();
     x.setLB(3, 4);
     x.area();
     x.perimeter();   

    // Question 4 :-
    Game bgmi = new Game();
    bgmi.hit();
    bgmi.run();
    bgmi.fire();

    }   
}
