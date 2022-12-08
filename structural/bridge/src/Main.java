public class Main {
    public static void main(String[] args) {
        Container testPlateContainer = new TestContainer(new PlateContainerType());
        System.out.println(testPlateContainer.create());
        // Created a Test container of type - Plate

        Container strateosContainer = new StrateosContainer((new TubeContainerType()));
        System.out.println(strateosContainer.create());
        // Created a Strateos container of type - Tube
    }
}