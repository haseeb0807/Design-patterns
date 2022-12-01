public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Barney", "Stinson")
                .age(30)
                .phone("1234567")
                .address("xyz")
                .build();

        System.out.println(user1);

        User user2 = new User.UserBuilder("Ted", "Mosby")
                .age(29)
                .phone("5655")
                //no address
                .build();

        System.out.println(user2);
    }
}