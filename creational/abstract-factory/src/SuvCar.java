public class SuvCar extends Car{
    public SuvCar(String makeLocation) {

        super("SUV", makeLocation);
        orderCar();
    }

    @Override
    protected void orderCar() {

        System.out.println("\nOrdered your new SUV Car !!!\n");
        specifications();
    }

    public void specifications() {

        System.out.println("Specifications : 15 Lakh INR, 7 seater, Mercedes 300GL, 50L fuel capacity\n");
    }
}
