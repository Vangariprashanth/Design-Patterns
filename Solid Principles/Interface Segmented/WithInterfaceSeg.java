interface WaiterInterface{
    void serveCustomers();
    void takeOrders();
}

interface ChefInterface{
    void cookFood();
    void decideMenu();
}

class Waiter implements WaiterInterface{

    @Override
    public void serveCustomers() {
        // TODO Auto-generated method stub
        System.out.println("Serving Customers");
        
    }

    @Override
    public void takeOrders() {
        // TODO Auto-generated method stub
        System.out.println("Taking Orders");
        
    }

}

class Chef implements ChefInterface{

    @Override
    public void cookFood() {
        // TODO Auto-generated method stub
        System.out.println("Cooking Food");
        
    }

    @Override
    public void decideMenu() {
        // TODO Auto-generated method stub
        System.out.println("Deciding Menu");
        
    }
    
}
public class WithInterfaceSeg {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        waiter.serveCustomers();
    }
}
