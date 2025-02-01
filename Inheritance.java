
class try1{
    int x;
    public void setX(int x){
        this.x = x;
    }
    public int getX(){
        return this.x;
    }
}
//Inheritance
class try2 extends try1{
    int y;
    public void setY(int y){
        this.y = y;
    }
    public int getY(){
        return this.y;
    }
}

class Base{
    Base(){
        System.out.println("I m a constructor!");
    }
    Base(int x){
        System.out.println("I am 2nd constructor!");
    }
}
//Constructor in inheritance
class Derived extends Base{
    Derived(){
        System.out.println("I m a derived class constructor!");
    }
    Derived(int x, int y){
        super(x);
        System.out.println("I am 2nd derived Constructor!");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        
        try1 obj1 = new try1();

        obj1.setX(7);                              //Allowed
        System.out.println(obj1.getX());

        // obj1.setY(3);
        // System.out.println(obj1.getx());          //Not Allowed

        try2 obj2 = new try2();

        obj2.setX(8);                              //Allowed
        System.out.println(obj2.getX());             

        obj2.setY(2);                              //Allowed
        System.out.println(obj2.getY());

        Derived d = new Derived(3,4);
        



    }
}

