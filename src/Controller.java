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

    public Boolean saveUser() {
        try {
            FileOutputStream file = new FileOutputStream(model.getUserName());
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(model);
            out.close();
            file.close();
            return Boolean.TRUE;
        } catch (IOException e) {
            return Boolean.FALSE;
        }
    }

    public Boolean getUser(String userName) {
        try {
            FileInputStream file = new FileInputStream(userName);
            ObjectInputStream object = new ObjectInputStream(file);
            model = new User((User)object.readObject());
            file.close();
            object.close();
            return Boolean.TRUE;
        } catch (IOException | ClassNotFoundException e) {
            return Boolean.FALSE;
        }
    }

    public Boolean userExists() {
        File file = new File(model.getUserName());
        return (file.exists() == Boolean.TRUE && file.isDirectory() == Boolean.FALSE);
    }
}
