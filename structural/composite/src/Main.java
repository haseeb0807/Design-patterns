public class Main {
    public static void main(String[] args) {
        Microservice accessControlService = new AccessControlService("Access Control Service");
        Microservice workflowService = new WorkflowService("Workflow Service");

        WebService webService = new WebService("Web Service");
        webService.addMicroservice(accessControlService);
        webService.addMicroservice(workflowService);

        webService.printServiceName();
    }
}