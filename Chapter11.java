abstract class Pen{
    abstract public void refill();
    abstract public void write();
}
class Pen11 extends Pen{
    @Override
    public void refill(){
        System.out.println("Pen is refilling...");
    }
    @Override
    public void write(){
        System.out.println("Pen is Writing...");
    }
}
class FountainPen extends Pen{
    @Override
    public void refill(){
        System.out.println("Fountain Pen is refilling...");
    }
    @Override
    public void write(){
        System.out.println("Fountain Pen is Writing...");
    }
    public void changeNib(){
        System.out.println("Changing nib of the pen...");
    }
}
class Monkey{
    public void jump(){
        System.out.println("Monkey is jumping...");
    }
    public void bite(){
        System.out.println("Monkey can bite...");
    }
}
interface BasicAnimal{
    public void eat();
    public void sleep();
}
class Human extends Monkey implements BasicAnimal{
    @Override
    public void jump(){
        System.out.println("Human can jump...");
    }
    @Override
    public void bite(){
        System.out.println("Human can bite...");
    }
    @Override
    public void eat(){
        System.out.println("Human can eat...");
    }
    @Override
    public void sleep(){
        System.out.println("Human can sleep...");
    }

}
abstract class TelePhone{
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnect();
}
class SmartPhone extends TelePhone{
    @Override
    public void ring(){
        System.out.println("Phone is ringing...");
    }
    @Override
    public void lift(){
        System.out.println("Picking Up the phone...");
    }
    @Override
    public void disconnect(){
        System.out.println("Disconnecting the Phone...");
    }
}
interface TvRemote{
    public void ChannelChange();
}
interface SmartTvRemote extends TvRemote{
    public void PlayOtt();
}
class TeleVision implements SmartTvRemote{
    @Override
    public void ChannelChange(){
        System.out.println("Changing Channels...");
    }
    @Override
    public void PlayOtt(){
        System.out.println("Playing OTT Content...");
    }
}

public class Chapter11{
    public static void main(String[] args) {
        //Question 1 :
        Pen11 obj = new Pen11();
        obj.refill();
        obj.write();
        //Question 2 :
        FountainPen fp = new FountainPen();
        fp.changeNib();
        fp.write();
        //Question 3 :
        Human person = new Human();
        person.jump();
        person.bite();
        person.eat();
        person.sleep();
        //Question 4 :
        SmartPhone sm = new SmartPhone();
        sm.ring();
        sm.lift(); 
        sm.disconnect();
        //Question 5 :
        Monkey m1 = new Human();
        m1.jump();
        m1.bite();
        // m1.eat();   --> will not work 
        // m1.sleep(); --> will not work

        //Question 6 and 7 :
        TeleVision tv = new TeleVision();
        tv.PlayOtt();
        tv.ChannelChange();
    }
}