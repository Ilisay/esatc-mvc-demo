import java.io.*;

/**
 * @author Adrian Ilisei
 */
public class Controller {
    private enum errors {
        eSAVE_ERROR,
        eREAD_ERROR,
        eDELETE_ERROR,
        ePASSWORD_ERROR,
        eNO_ERROR
    }

    private static final String[] errorMessages = {"User information could not be saved.",
            "The user does not exist.",
            "User information could not be deleted.",
            "Wrong password entered.",
            null};

    private static User model;
    private static errors errorStatus;

    public static String getUserName() {
        return model.getUserName();
    }

    public static String getEmailAddress() {
        return model.getEmailAddress();
    }

    public static String getError() {
        return errorMessages[errorStatus.ordinal()];
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
            errorStatus = errors.eNO_ERROR;
            return true;
        } catch (IOException e) {
            errorStatus = errors.eSAVE_ERROR;
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
            errorStatus = errors.eNO_ERROR;
            return true;
        } catch (IOException | ClassNotFoundException e) {
            errorStatus = errors.eREAD_ERROR;
            return false;
        }
    }

    public static boolean deleteUser(String userName) {
        File file = new File(userName);
        boolean bFileWasDeleted = file.delete();
        if (!bFileWasDeleted) {
            errorStatus = errors.eDELETE_ERROR;
        } else {
            errorStatus = errors.eNO_ERROR;
        }
        return bFileWasDeleted;
    }

    public static boolean checkPasswords(String passWord) {
        boolean bPasswordsMatch = (model.getPassWord().compareTo(passWord) == 0);
        if (!bPasswordsMatch) {
            errorStatus = errors.ePASSWORD_ERROR;
        } else {
            errorStatus = errors.eNO_ERROR;
        }
        return bPasswordsMatch;
    }
}
