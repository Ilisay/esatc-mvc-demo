public class Main {

    private static void testUser() {
        User user = new User("ilisay", "123456qwerty", "123456qwerty");
        Controller ctrl = Controller.getInstance(user);
        System.out.println("User is not created yet");
        if (ctrl.userExists()) {
            System.out.println("User " + user.getUserName() + " exists");
        } else {
            System.out.println("User " + user.getUserName() + " doesn't exist");
        }
        if (ctrl.saveUser()) {
            System.out.println("User was created");
        } else {
            System.out.println("FAILED to create user");
            return;
        }
        if (ctrl.userExists()) {
            System.out.println("User " + user.getUserName() + " exists");
        } else {
            System.out.println("User " + user.getUserName() + " doesn't exist");
        }
        if (ctrl.getUser("ilisay")) {
            System.out.println("User " + user.getUserName() + " was retrieved");
        } else {
            System.out.println("User couldn't be retrieved");
        }
        if (ctrl.deleteUser()) {
            System.out.println("User was removed");
        } else {
            System.out.println("FAILED to remove user");
            return;
        }
        if (ctrl.userExists()) {
            System.out.println("User " + user.getUserName() + " exists");
        } else {
            System.out.println("User " + user.getUserName() + " doesn't exist");
        }
    }

    public static void main(String[] args) {
        testUser();
        RegisterGUI frame = new RegisterGUI();
        frame.setVisible(true);
    }
}
