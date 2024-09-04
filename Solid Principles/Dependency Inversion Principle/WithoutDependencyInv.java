class Keyboard{

}
class Mouse{

}
class WiredKeyboard extends Keyboard{

}
class BluetoothKeyboard extends Keyboard{

}
class WiredMouse extends Mouse{

}

class BluetoothMouse extends Mouse{

}

class MacBook {
    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;
    public MacBook(){
        this.keyboard = new WiredKeyboard();
        this.mouse= new WiredMouse();
    }
}

public class WithoutDependencyInv{
    public static void main(String[] args) {
        
    }
}