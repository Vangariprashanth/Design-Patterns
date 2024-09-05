package OOPs;

abstract class BasePizza{
    public int cost(){
        return 100;
    }
}

class Margherita extends BasePizza{
    public int cost(){
        return 100;
    }
}

class Farmhouse extends BasePizza{

    public int cost(){
        return 200;
    }

}
public class Practice {
    public static void main(String[] args) {
        BasePizza margherita = new Margherita();
        BasePizza farmhouse = new Farmhouse();

        System.out.println(margherita.cost()); // Prints: 100
        System.out.println(farmhouse.cost());  // Prints: 200

        
    }
}
