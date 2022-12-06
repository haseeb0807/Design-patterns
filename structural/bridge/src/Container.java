public abstract class Container {
    protected ContainerType containerType;

    public Container(ContainerType containerType) {
        this.containerType=containerType;
    }

    abstract public String create();
}
