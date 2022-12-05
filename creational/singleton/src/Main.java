public class Main {
    public static void main(String[] args) {
        //Compile Time Error:  SingleObject() has private access in SingleObject
        //        SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();

    }
}