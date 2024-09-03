
interface Bike{
    void turnOnEngine();
    void accelerate();
}

class MotorCycle implements Bike{
    private boolean isEngineOn;
    int speed;
    @Override
    public void accelerate() {
        speed+=10;
        
    }

    @Override
    public void turnOnEngine() {
        this.isEngineOn = true;
        System.out.println("Turned on the engine");
    }
    
}

class Bicycle implements Bike{
    int speed;

    @Override
    public void accelerate() {
        // TODO Auto-generated method stub
        speed+=10;
    }

    @Override
    public void turnOnEngine() {
        // Cycle does not have engine
        throw new AssertionError("There is no Engine");
    }
    
}
public class WithoutLiskov {
    public static void main(String[] args) {
        Bicycle cycle = new Bicycle();
        MotorCycle motorCycle = new MotorCycle();
        motorCycle.turnOnEngine();
        cycle.turnOnEngine();
    }
}
