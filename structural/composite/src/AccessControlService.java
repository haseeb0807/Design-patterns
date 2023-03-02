public class AccessControlService implements Microservice{
    private String name;

    public AccessControlService(String name) {
        this.name = name;
    }

    @Override
    public void printServiceName() {
        System.out.println(getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
