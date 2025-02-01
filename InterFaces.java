interface Cycle{
    int applyBrake(int decrement);
    int speedUp(int increment);
}

interface Horn{
    void playHorn();
}

interface Service{
    void ServiceReminder();
}
class TataCycle implements Cycle, Horn, Service{
    int speed;
    public TataCycle(int speed){
        this.speed = speed;
    }
    @Override
    public int applyBrake(int decrement){
        speed-=decrement;
        return speed;
    }
    @Override
    public int speedUp(int increment){
        speed = speed+increment;
        return speed;
    }
    @Override
    public void playHorn(){
        System.out.println("peepeeeeep....peep...peepeeeep");
    }
    @Override
    public void ServiceReminder(){
        System.out.println("Your Vehicle needs a service...");
    }
}

//Inheritance in interfaces
interface papa{
    public void meth1();
}
interface beta extends papa{
    public void meth2();
}
class Test implements beta{
    @Override
    public void meth2(){
        System.out.println("Method 2...");
    }
    @Override
    public void meth1(){
        System.out.println("Method 1...");
    }

}



public class InterFaces {
    public static void main(String[] args) {
        TataCycle tc = new TataCycle(100);
        System.out.println(tc.applyBrake(10));
        System.out.println(tc.speedUp(50));
        tc.playHorn();
        tc.ServiceReminder();

        //2
        Test tt = new Test();
        tt.meth1();
        tt.meth2();

    }
}
