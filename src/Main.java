public class Main {

    private static void testUser() {
        User user = new User("test_user", "test_pass", "test@pass.com");
        System.out.println("User is not created yet");
        if (Controller.saveUser(user)) {
            System.out.println("User was created");
        } else {
            System.out.println("FAILED to create user");
            return;
        }
        if (Controller.readUser("test_user")) {
            System.out.println("User " + user.getUserName() + " was retrieved");
        } else {
            System.out.println("User couldn't be retrieved");
        }
        if (Controller.deleteUser(user.getUserName())) {
            System.out.println("User was removed");
        } else {
            System.out.println("FAILED to remove user");
        }
    }

    public static void main(String[] args) {
        testUser();
        LoginGUI frame = new LoginGUI();
        frame.setVisible(true);
    }
}
