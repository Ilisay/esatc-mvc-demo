import java.io.*;

/**
 * @author Adrian Ilisei
 */
public class Controller {
    private static User model;

    public String getUserName(){
        return model.getUserName();
    }

    public String getEmailAddress(){
        return model.getEmailAddress();
    }

    public static boolean saveUser() {
        return saveUser(model);
    }

    public static boolean saveUser(User model) {
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

    public static boolean readUser(String userName) {
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

    public static boolean deleteUser(String userName) {
        File file = new File(userName);
        return file.delete();
    }

    public static boolean checkPasswords(String passWord) {
        return (model.getPassWord().compareTo(passWord) == 0);
    }
}
