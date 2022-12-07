public class WorkflowService implements  Microservice{
    private String name;

    public WorkflowService(String name) {
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
