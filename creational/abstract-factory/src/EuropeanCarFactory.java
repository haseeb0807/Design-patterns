public class EuropeanCarFactory {
    public Car orderNewCar(String carType) {
        Car car = null;
        if(carType.equalsIgnoreCase("LUXURY")) {
        car = new LuxuryCar("EUROPE");
    }
        else if(carType.equalsIgnoreCase("SUV")) {
        car = new SuvCar("EUROPE");
    }
        return car;
}
}
