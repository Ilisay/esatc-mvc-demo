import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Fri Dec 25 00:10:54 EET 2020
 */


/**
 * @author Adrian Ilisei
 */
public class InfoGUI extends JFrame {
    public InfoGUI(JFrame parent) {
        this.parent = parent;
        initComponents();
    }

    private void thisWindowClosed(WindowEvent e) {
        parent.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Adrian Ilisei
        welcomeLabel = new JLabel();
        emailLabel = new JLabel();

        //======== this ========
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Welcome");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                thisWindowClosed(e);
            }
        });
        var contentPane = getContentPane();

        //---- welcomeLabel ----
        welcomeLabel.setText("Welcome, <USER_NAME>!");

        //---- emailLabel ----
        emailLabel.setText("Your e-mail address is: <EMAIL_ADDRESS>");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(77, Short.MAX_VALUE)
                    .addComponent(emailLabel)
                    .addGap(77, 77, 77))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(125, 125, 125)
                    .addComponent(welcomeLabel)
                    .addContainerGap(125, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(215, 215, 215)
                    .addComponent(welcomeLabel)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(emailLabel)
                    .addContainerGap(215, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Adrian Ilisei
    private JLabel welcomeLabel;
    private JLabel emailLabel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private JFrame parent;
}
