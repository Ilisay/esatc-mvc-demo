import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Fri Dec 25 00:10:54 EET 2020
 */



/**
 * @author Adrian Ilisei
 */
public class InfoGUI extends JFrame {
    public InfoGUI() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Adrian Ilisei
        welcomeLabel = new JLabel();
        emailLabel = new JLabel();
        button1 = new JButton();

        //======== this ========
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome");
        var contentPane = getContentPane();

        //---- welcomeLabel ----
        welcomeLabel.setText("Welcome, <USER_NAME>!");

        //---- emailLabel ----
        emailLabel.setText("Your e-mail address is: <EMAIL_ADDRESS>");

        //---- button1 ----
        button1.setText("Log out");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(77, Short.MAX_VALUE)
                    .addComponent(emailLabel)
                    .addGap(77, 77, 77))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(125, 125, 125)
                            .addComponent(welcomeLabel))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(161, 161, 161)
                            .addComponent(button1)))
                    .addContainerGap(125, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(180, 180, 180)
                    .addComponent(welcomeLabel)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(emailLabel)
                    .addGap(18, 18, 18)
                    .addComponent(button1)
                    .addContainerGap(206, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Adrian Ilisei
    private JLabel welcomeLabel;
    private JLabel emailLabel;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
