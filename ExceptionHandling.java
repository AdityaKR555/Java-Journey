import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return "I am toString()";
    }

    @Override
    public String getMessage(){
        return "I am getMessage()";
    }
}

class NegativeException extends Exception{           //Custom exception
        @Override
        public String toString() {
            return "Radius cannot be negative";
        }
        @Override
        public String getMessage() {
            return "Enter a valid radius";
        }
}



public class ExceptionHandling {

    public static double area(float radius) throws NegativeException{
        if(radius<0){
            throw new NegativeException();
        }
        double areaOfCircle = Math.PI * radius * radius;
        return areaOfCircle;
    }
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<9){
            try {
                throw new MyException();
            } catch (MyException e) {
                System.out.println(e);                  //prints to string() method
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                
            }
        }
        try {
            System.out.println(area(3));
        } catch (NegativeException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("program terminates here.");
        }
        
    }
}
