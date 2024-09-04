public class ExtraCheeseToppings extends ToppingDecorator {
    BasePizza basepizza;

    public ExtraCheeseToppings(BasePizza pizza){
        this.basepizza=pizza;
    }

    @Override
    public int cost() {
        return this.basepizza.cost()+10;
    }
    
}
