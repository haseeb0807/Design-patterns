public class StrateosContainer extends Container{

    public StrateosContainer (ContainerType containerType) {
        super(containerType);
    }
    @Override
    public String create() {
        return "Created a Strateos container of type - "+ containerType.getType();
    }
}
