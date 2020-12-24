import java.io.*;

/**
 * @author Adrian Ilisei
 */
public class Controller {
    private static Controller controller = null;
    private User model;

    private Controller(User model) {
        this.model = new User(model);
    }

    public static Controller getInstance(User model) {
        if (controller == null) {
            controller = new Controller(model);
        }
        return controller;
    }

    public boolean saveUser() {
        try {
            FileOutputStream file = new FileOutputStream(model.getUserName());
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(model);
            out.close();
            file.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public boolean getUser(String userName) {
        try {
            FileInputStream file = new FileInputStream(userName);
            ObjectInputStream object = new ObjectInputStream(file);
            model = new User((User) object.readObject());
            file.close();
            object.close();
            return true;
        } catch (IOException | ClassNotFoundException e) {
            return false;
        }
    }

    public boolean deleteUser() {
        File file = new File(model.getUserName());
        model = null;
        return file.delete();
    }

    public boolean userExists() {
        File file = new File(model.getUserName());
        return (file.exists() && !file.isDirectory());
    }
}
