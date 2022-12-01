public class AsianCarFactory {
    public Car orderNewCar(String carType) {
        Car car = null;
        if(carType.equalsIgnoreCase("LUXURY")) {
            car = new LuxuryCar("ASIA");
        }
        else if(carType.equalsIgnoreCase("SUV")) {
            car = new SuvCar("ASIA");
        }
        return car;
    }
}
