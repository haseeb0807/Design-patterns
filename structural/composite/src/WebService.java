import java.util.ArrayList;
import java.util.List;

public class WebService implements Microservice{
    // Composite class
    // This is a composite class as it holds a collection of service components
    // as well as methods for adding and removing elements from the list.
    //
    //The composite printServiceName() method is implemented by iterating over the list of leaf elements and
    // invoking the appropriate method for each one.

    private String name;
    private List<Microservice> services;

    public WebService(String name) {
        this.name = name;
        this.services = new ArrayList<>();
    }

    public void addMicroservice(Microservice Microservice) {
        services.add(Microservice);
    }

    public void removeMicroservice(Microservice Microservice) {
        services.remove(Microservice);
    }
    @Override
    public void printServiceName() {
        services.forEach(Microservice::printServiceName);
    }
}
