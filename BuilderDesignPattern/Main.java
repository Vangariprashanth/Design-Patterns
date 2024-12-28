public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setEngine("V4")
                .setWheels(4)
                .setAirConditioning(false)
                .setSunRoof(false)
                .build();
        System.out.println(car);
    }
}
