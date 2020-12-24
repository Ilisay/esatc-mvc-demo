import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Thu Dec 24 19:11:32 EET 2020
 */



/**
 * @author Adrian Ilisei
 */
public class LoginGUI extends JFrame {
    public LoginGUI() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Adrian Ilisei
        userTextField = new JTextField();
        loginButton = new JButton();
        registerButton = new JButton();
        passField = new JPasswordField();

        //======== this ========
        setResizable(false);
        setTitle("Login");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();

        //---- userTextField ----
        userTextField.setText("username");

        //---- loginButton ----
        loginButton.setText("Login");

        //---- registerButton ----
        registerButton.setText("Register");

        //---- passField ----
        passField.setText("password");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(94, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(userTextField, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                        .addComponent(loginButton, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                        .addComponent(registerButton, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                        .addComponent(passField, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                    .addGap(88, 88, 88))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(159, 159, 159)
                    .addComponent(userTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(passField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addComponent(loginButton)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(registerButton)
                    .addContainerGap(177, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Adrian Ilisei
    private JTextField userTextField;
    private JButton loginButton;
    private JButton registerButton;
    private JPasswordField passField;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
