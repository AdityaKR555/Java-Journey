
public class ChapterFour {
    public static void main(String[] args) {
        //question 1 : check output
        // int a = 10;
        // if(a=11) System.out.println("i'm 11");  // gives error as cant convert int to boolean so either use true or false
        // else System.out.println("i'm not 11");


        //question 2 : overall marks>40% and each subject marks>33% out of 100 in 3 subjects
        // byte m1,m2,m3;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the marks of subject 1 : ");
        // m1 = sc.nextByte();
        // System.out.println("Enter the marks of subject 2 : ");
        // m2 = sc.nextByte();
        // System.out.println("Enter the marks of subject 3 : ");
        // m3 = sc.nextByte();
        
        // float totalPer = (m1+m2+m3)/3;
        // if(totalPer>=40 && m1>=33 && m2>=33 && m3>=33) System.out.println("Congratulations! You are passed...!");
        // else System.out.println("Padhai Likhai me dhyan do, fail ho baua...!");






        //question 3 : calculate income tax
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter your salary");
    //     double salary = sc.nextDouble();
    //     double tax;
    //     if(salary<=250000) tax=0;
    //     else if(salary > 250000 && salary <= 500000) tax = 0.05*salary;
    //     else if(salary > 500000 && salary <= 1000000) tax = 0.2*salary;
    //     else tax = 0.3*salary;

    //     System.out.println("The Tax you have to pay is : "+tax);


        //question 4 : find the day of the week given the day no.
        // String dayName = "";
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter day no. : ");
        // int dayNo = sc.nextInt();
        // boolean isValid = true;
        // switch(dayNo){
        //     case 1 : dayName = "Monday";
        //              break;
        //     case 2 : dayName = "Tuesday";
        //              break;
        //     case 3 : dayName = "Wednesday";
        //              break;
        //     case 4 : dayName = "Thursday";
        //              break;
        //     case 5 : dayName = "Friday";
        //              break;
        //     case 6 : dayName = "Saturday";
        //              break;
        //     case 7 : dayName = "Sunday";
        //              break;
        //     default : System.out.println("Invalid Choice");
        //                 isValid = false;
                      
        // }
        // if(isValid)
        // System.out.println("day "+dayNo+" is "+dayName);


        // question 5 : Leap year or not 
        // System.out.println("Enter a year : ");
        // int year = sc.nextInt();
        // if(year%4==0 && (year%100!=0 || year%400==0)) System.out.println(year + " is a leap year");
        // else System.out.println(year + " is not a leap year");


        //question 6 : which type of website is this
        // Scanner sc = new Scanner(System.in);
        // String website = sc.next();
        // if(website.endsWith(".com")) System.out.println("its a commercial website.");
        // else if(website.endsWith(".org")) System.out.println("its an organizational website.");
        // else if(website.endsWith(".in")) System.out.println("its an indian website.");



       
        // sc.close();
     
    }
}
