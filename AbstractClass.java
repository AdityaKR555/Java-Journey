// package concepts;

abstract class Parent{
    abstract public void greet();
}

class Child1 extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning...!!!");
    }
}

class Child2 extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Night...!!!");
    }
}


public class AbstractClass{
    public static void main(String[] args) {
        Child1 c = new Child1();
        c.greet();
        Child2 c2 = new Child2();
        c2.greet();

    }
}