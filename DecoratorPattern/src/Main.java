public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheeseToppings(new Margherita());
        System.out.println(pizza.cost());
        BasePizza pizza2 = new MushroomToppings(pizza);
        System.out.println(pizza2.cost());
    }


}
