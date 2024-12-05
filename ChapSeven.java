public class ChapSeven {
  
    // Question 1 : Method to print multiplication table of a no.
    void table(int x){
        for(int i=1; i<=10; i++){
            System.out.print(x*i + " ");
        }
    }
    
    // Question 2 : print the pattern
    void pattern(){
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    // Question 3 : Function to print sum of n natural no.s
    int sumNatural(int limit){
        int sum=0;
        for(int i=1; i<=limit; i++){
            sum+=i;
        }
        return sum;
    }
    
    // Question 4 : Q3 using recursive function
    int sumRec(int limit){
        if(limit == 1) return 1;
        else return limit + sumRec(limit - 1);
    }
    
    // Question 5 : Print the pattern
    void printPattern(){
        for(int i=1; i<=4; i++){
            for(int j=4; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    
    
    
    
        public static void main(String[] args) {
          ChapSeven ak = new ChapSeven();
          ak.table(20);
            ak.pattern();
            System.out.println(ak.sumNatural(10));
            System.out.println(ak.sumRec(10));
            ak.printPattern();
        
        }
    }
    