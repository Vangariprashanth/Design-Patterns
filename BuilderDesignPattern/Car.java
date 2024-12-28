class Car {
    private String engine;
    private int wheels;
    private boolean airConditioning;
    private boolean sunroof;

    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.sunroof = builder.sunroof;
        this.airConditioning = builder.sunroof;
    }

    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", airConditioning=" + airConditioning +
                ", sunroof=" + sunroof +
                '}';
    }

    static class CarBuilder {
        private String engine;
        private int wheels;
        private boolean airConditioning;
        private boolean sunroof;

        CarBuilder() {

        }

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public CarBuilder setAirConditioning(boolean airConditioning) {
            this.airConditioning = airConditioning;
            return this;
        }

        public CarBuilder setSunRoof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}