

public class TryCatchBlock {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;
        try {
             System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("Exception occured : ");
            System.out.println(e);
        }

        //Handling specific exceptions
        try {
            int x = 10/0;
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e){
            System.out.println(e);
        }

        //Nested try-catch
        try {
            System.out.println("Hello...");
            try {
                int ax = 10/0;
                System.out.println(ax);
            } catch (ArithmeticException e) {
                System.out.println("Level 2 catch block exexuted.");
            }
        } catch (Exception e) {
            System.out.println("Level 1 catch block executed.");
        }


    }
}
