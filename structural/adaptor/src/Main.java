public class Main {
    public static void main(String[] args) {
        SocketAdaptor socketAdapter = new SocketAdaptorImpl();
        Voltage voltage12 = socketAdapter.getVoltageOf12V();
        System.out.println(voltage12.getVolts());

        Voltage voltage3 = socketAdapter.getVoltageOf3V();
        System.out.println(voltage3.getVolts());

        Voltage voltage240 = socketAdapter.getVoltageOf240V();
        System.out.println(voltage240.getVolts());
    }
}