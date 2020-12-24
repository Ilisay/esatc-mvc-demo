import java.io.Serializable;

/**
 * @author Adrian Ilisei
 */
public class User implements Serializable {
    private String userName;
    private String passWord;
    private String emailAddress;

    public User() {
        userName = null;
        passWord = null;
        emailAddress = null;
    }

    public User(String userName, String passWord, String emailAddress) {
        setUserName(userName);
        setPassword(passWord);
        setEmailAddress(emailAddress);
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setUserName(String userName){
        this.userName = new String(userName);
    }

    public void setPassword(String passWord){
        this.passWord = new String(passWord);
    }

    public void setEmailAddress(String emailAddress){
        this.emailAddress = new String(emailAddress);
    }
}
