public class MushroomToppings extends ToppingDecorator{
   BasePizza basePizza;
   public MushroomToppings(BasePizza pizza){
    this.basePizza = pizza;
   }
@Override
public int cost() {
    // TODO Auto-generated method stub
    return this.basePizza.cost()+15;
} 

}
