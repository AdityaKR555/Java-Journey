//Using Threads by extending thread class...

class MyThread extends Thread{
    @Override
    public void run(){
        int i = 1;
        while(i<2000){
             System.out.println("Running");
             i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 1;
        while(i<2000){
             System.out.println("Bhaging");
             i++;
        }
    }
}

//Using threads by implementing the runnable interface...

// class MyRunnable implements Runnable{
//     @Override
//     public void run(){
//         int i = 1;
//          while(i<2000){
//              System.out.println("From class 1...");
//              i++;
//          }
//     }
// }

// class MyRunnable2 implements Runnable{
//     @Override
//     public void run(){
//         int i = 1;
//         while(i<2000){
//             System.out.println("From class 2...");
//             i++;
//         }
//     }
// }

public class TryingThreads {
    public static void main(String[] args) {
        //using thread class...
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

        //using runnable interface...
        // MyRunnable mr1 = new MyRunnable();
        // Thread tt1 = new Thread(mr1);
        // MyRunnable2 mr2 = new MyRunnable2();
        // Thread tt2 = new Thread(mr2);
        // tt1.start(); 
        // tt2.start();

    }
}
