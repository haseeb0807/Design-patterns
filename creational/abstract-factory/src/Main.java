import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello Customer !!!\nEnter your Car Type : ");
        String carType = scanner.next();
        System.out.println("Enter your model make location : 1. ASIA     2. EUROPE");
        String makeLocation = scanner.next();

        MainFactory factory = new MainFactory();
        System.out.println(factory.decideMakeLocation(makeLocation, carType));
        scanner.close();
    }
}