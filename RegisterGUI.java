import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Thu Dec 24 18:45:53 EET 2020
 */



/**
 * @author Adrian Ilisei
 */
public class RegisterGUI extends JFrame {
    public RegisterGUI() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Adrian Ilisei
        userTextField = new JTextField();
        emailTextField = new JTextField();
        pass1TextField = new JTextField();
        pass2TextField = new JTextField();
        registerButton = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register User");
        setResizable(false);
        var contentPane = getContentPane();

        //---- userTextField ----
        userTextField.setText("username");

        //---- emailTextField ----
        emailTextField.setText("email");

        //---- pass1TextField ----
        pass1TextField.setText("password");

        //---- pass2TextField ----
        pass2TextField.setText("confirm password");

        //---- registerButton ----
        registerButton.setText("Register");

        //---- label1 ----
        label1.setText("Username must contain alphanumeric characters");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getStyle() | Font.ITALIC, label1.getFont().getSize() - 2f));

        //---- label2 ----
        label2.setText("Please enter a valid email address");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getStyle() | Font.ITALIC, label2.getFont().getSize() - 2f));

        //---- label3 ----
        label3.setText("Passwords must match");
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getStyle() | Font.ITALIC, label3.getFont().getSize() - 2f));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label3)
                        .addComponent(label2)
                        .addComponent(userTextField)
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(emailTextField)
                        .addComponent(pass1TextField)
                        .addComponent(pass2TextField))
                    .addContainerGap(91, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(134, Short.MAX_VALUE)
                    .addComponent(registerButton, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                    .addGap(134, 134, 134))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(123, 123, 123)
                    .addComponent(userTextField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(emailTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(pass1TextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(pass2TextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label3)
                    .addGap(18, 18, 18)
                    .addComponent(registerButton)
                    .addContainerGap(99, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Adrian Ilisei
    private JTextField userTextField;
    private JTextField emailTextField;
    private JTextField pass1TextField;
    private JTextField pass2TextField;
    private JButton registerButton;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
