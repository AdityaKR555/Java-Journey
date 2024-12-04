public class ChapterSix {
    public static void main(String[] args){
        //Question 1 : Create an array of 5 floats and calculate their sum

        // float[] sum = new float[5];
        // float add=0;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter five values : ");
        // for(float x : sum){
        //     x = sc.nextFloat();
        //     add+=x;
        // }
        // System.out.println(add);

        //Question 2 : To check whether an integer is in an array or not 

        // int[] arr = {53, 42, 31, 20, 19};
        // System.out.println("Find : ");
        // int n = sc.nextInt();
        // boolean mila = false;
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] == n){
        //         System.out.println("Element "+ n + " present at index "+ i);
        //         mila = true;
        //         break;
        //     }
            
        // }
        // if(!mila) System.out.println("Element not found ");

        //Question 3 : add two matrices of size of 2x3

        // int[][] a = {{2,3,4},{5,7,9}};
        // int[][] b = new int[2][3];
        // int[][] sum = new int[2][3];
        // int i,j;
        // System.out.println("Enter the value of 2nd matrix : ");
        // for (i = 0; i < 2; i++) {
        //     for (j = 0; j < 3; j++) {
        //         b[i][j] = sc.nextInt();      // taking 2nd matrix ka input
        //     }
        // }
        //     for (i = 0; i < 2; i++) {
        //         for (j = 0; j < 3; j++) {
        //            sum[i][j] = a[i][j] + b[i][j];  //adding a+b
        //            System.out.print(sum[i][j]);    //printing the sum
        //         }
        //         System.out.println("");
        //     }
            
        
        //Question 4 : To reverse an array
        // int[] arr = {23,45,67,89,10,32,55};
        // int temp;
        // for(int i=0; i<arr.length/2; i++){
        //     temp = arr[i];
        //     arr[i] = arr[arr.length-i-1];
        //     arr[arr.length-i-1] = temp;
        // }
        // for(int x : arr){
        //     System.out.print(x + " ");
        // }


        //Question 5 : Find Maximum and Minimum element of an array
        // int[] arr = new int[5];
        // System.out.println("Enter array elements : ");
        // for(int i=0; i<5; i++){
        //     arr[i] = sc.nextInt();
        // }
    
        // int max = arr[0];
        // int min = arr[0];

        // for(int x : arr){
        //     if(x>max) max = x;
        //     if(x<min) min = x;
        // }
    
        // System.out.println("Maximum value = " + max);
        // System.out.println("Minimum value = " + min);
        

        //Question 6 : To find whether an array is sorted or not
        // int[] arr = new int[5];
        // for(int i=0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }
        // boolean isSorted = false;
        // for(int i=0; i<arr.length-1; i++){
        //     if(arr[i]>arr[i+1]){
        //     isSorted = true;
        //     break;
        //    }
        // }
        // if(isSorted) System.out.println("Not Sorted");
        // else System.out.println("Sorted ");

    }
}
