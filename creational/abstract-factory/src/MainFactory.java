public class MainFactory {
    public Car decideMakeLocation(String makeLocation, String carType) {

        Car car = null;
        if(makeLocation.equals("ASIA")) {

            AsianCarFactory asianCarFactory = new AsianCarFactory();
            car = asianCarFactory.orderNewCar(carType);
        }
        else if(makeLocation.equals("EUROPE")) {

            EuropeanCarFactory europeanCarFactory = new EuropeanCarFactory();
            car = europeanCarFactory.orderNewCar(carType);
        }
        return car;
    }
}
