
interface RestaurantEmployee{
    void washDishes();
    void serveCustomers();
    void cookFood();   
}

class Waiter implements RestaurantEmployee{
    public void washDishes(){
        //not my job
    }

    @Override
    public void cookFood() {
        // not my job
        
    }

    @Override
    public void serveCustomers() {
        System.out.println("Serving the customers");
        
    }
    
}
public class WithoutInterfaceSeg {
    
}
