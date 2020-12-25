import java.io.*;

/**
 * @author Adrian Ilisei
 */
public class Controller {
    private enum errors {
        eTAKEN_ERROR,
        eSAVE_ERROR,
        eREAD_ERROR,
        eDELETE_ERROR,
        eUSERNAME_ERROR,
        eEMAIL_ERROR,
        ePASSWORD_ERROR,
        eREGISTER_SUCCESS,
        eLOGIN_SUCCESS,
        eNO_ERROR
    }

    private static final String[] errorMessages = {"The username is already taken.",
            "User information could not be saved.",
            "The user does not exist.",
            "User information could not be deleted.",
            "Username format is not valid.",
            "E-Mail format is not valid.",
            "Wrong password entered.",
            "User successfully registered.",
            "User successfully logged in.",
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
            errorStatus = errors.eREGISTER_SUCCESS;
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
            errorStatus = errors.eLOGIN_SUCCESS;
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

    public static boolean checkUserName(String userName) {
        File file = new File(userName);
        if (file.exists() && !file.isDirectory()) {
            errorStatus = errors.eTAKEN_ERROR;
            return false;
        }
        boolean bUserNameIsValid = userName.matches("[A-Za-z0-9]+");
        if (!bUserNameIsValid) {
            errorStatus = errors.eUSERNAME_ERROR;
        } else {
            errorStatus = errors.eNO_ERROR;
        }
        return bUserNameIsValid;
    }

    public static boolean checkEmailAddress(String emailAddress) {
        boolean bEmailIsValid = emailAddress.matches("^(.+)@(.+)$");
        if (!bEmailIsValid) {
            errorStatus = errors.eEMAIL_ERROR;
        } else {
            errorStatus = errors.eNO_ERROR;
        }
        return bEmailIsValid;
    }

    public static boolean checkPasswords(String passWord1, String passWord2) {
        boolean bPasswordsMatch = (passWord1.compareTo(passWord2) == 0);
        if (!bPasswordsMatch) {
            errorStatus = errors.ePASSWORD_ERROR;
        } else {
            errorStatus = errors.eNO_ERROR;
        }
        return bPasswordsMatch;
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
