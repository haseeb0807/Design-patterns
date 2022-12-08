public class TestContainer extends Container {
    public TestContainer (ContainerType containerType) {
        super(containerType);
    }
    @Override
    public String create() {
        return "Created a Test container of type - "+ containerType.getType();
    }
}
