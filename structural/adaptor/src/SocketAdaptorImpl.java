public class SocketAdaptorImpl extends Socket implements SocketAdaptor {
    //Using Composition for adapter pattern
    private Socket sock = new Socket();

    private Voltage convertVolt(Voltage v, int i)
    {
        return new Voltage(v.getVolts() / i);
    }

    @Override
    public Voltage getVoltageOf240V()
    {
        return sock.getVoltage();
    }

    @Override
    public Voltage getVoltageOf12V()
    {
        Voltage v = sock.getVoltage();
        return convertVolt(v, 20);
    }

    @Override
    public Voltage getVoltageOf3V()
    {
        Voltage v = sock.getVoltage();
        return convertVolt(v, 80);
    }
}
