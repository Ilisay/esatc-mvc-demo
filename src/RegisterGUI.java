import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Thu Dec 24 18:45:53 EET 2020
 */


/**
 * @author Adrian Ilisei
 */
public class RegisterGUI extends JFrame {
    public RegisterGUI(JFrame parent) {
        this.parent = parent;
        initComponents();
    }

    private void thisWindowClosed(WindowEvent e) {
        parent.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Adrian Ilisei
        userTextField = new JTextField();
        emailTextField = new JTextField();
        registerButton = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        passwordField1 = new JPasswordField();
        passwordField2 = new JPasswordField();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register User");
        setResizable(false);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                thisWindowClosed(e);
            }
        });
        var contentPane = getContentPane();

        //---- userTextField ----
        userTextField.setText("username");

        //---- emailTextField ----
        emailTextField.setText("email");

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

        //---- label4 ----
        label4.setText("Please enter a password");
        label4.setFont(label4.getFont().deriveFont(label4.getFont().getStyle() | Font.ITALIC, label4.getFont().getSize() - 2f));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label2)
                        .addComponent(userTextField)
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(emailTextField)
                        .addComponent(passwordField1)
                        .addComponent(label4)
                        .addComponent(passwordField2)
                        .addComponent(label3))
                    .addContainerGap(65, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(134, Short.MAX_VALUE)
                    .addComponent(registerButton, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                    .addGap(134, 134, 134))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addComponent(userTextField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(emailTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label4)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(passwordField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label3)
                    .addGap(18, 18, 18)
                    .addComponent(registerButton)
                    .addContainerGap(145, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Adrian Ilisei
    private JTextField userTextField;
    private JTextField emailTextField;
    private JButton registerButton;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private JFrame parent;
}
