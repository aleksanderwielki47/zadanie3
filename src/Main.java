import java.beans.VetoableChangeListener;

interface Device{
    void turnOn();
    void turnOff();

    default void charge(){
        System.out.println("urzadzenie sie laduje");
    }

    static void reset(){
        System.out.println("urzadzenie sie resetuje");
    }

}


class smartphone implements Device{

    @Override
    public void turnOn() {
        System.out.println("telefon sie wlacza");
    }

    @Override
    public void turnOff() {
        System.out.println("telefon sie wylacza");
    }
}

class laptop implements Device{

    @Override
    public void turnOn() {
        System.out.println("laptop sie wlacza");
    }

    @Override
    public void turnOff() {
        System.out.println("laptop sie wylacza");
    }
}






public class Main {
    public static void main(String[] args) {
        Device smartphone = new smartphone();
        smartphone.turnOn();
        smartphone.turnOff();
        smartphone.charge();
        Device laptop = new laptop();
        laptop.turnOn();
        laptop.turnOff();
        laptop.charge();

        Device.reset();


        }
    }
