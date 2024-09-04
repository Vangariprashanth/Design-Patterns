interface Keyboard{

}
interface Mouse{

}

class WiredKeyboard implements Keyboard{
    String name;
    WiredKeyboard(){
        this.name = "WiredKeyboard";
    }
}
class WiredMouse implements Mouse{

}

class MacBook{
    private final Keyboard keyboard;
    private final Mouse mouse;
    MacBook(Keyboard keyboard, Mouse mouse){
        this.keyboard = keyboard;
        this.mouse= mouse;
    }
}
public class WithDependencyInv {
    public static void main(String[] args) {
        MacBook macbook = new MacBook(new WiredKeyboard(),new WiredMouse() );

    }
}
