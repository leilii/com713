package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import leila.Config;

/**
 *
 * @author leila
 */
public class Gui extends JFrame implements ActionListener {
    //Constrauctor- initial state
JButton loginButton;
JTextField usernameTextField;
JTextField passworJTextField;
    public Gui() {
        //set the window layout manager
        this.setLayout(new BorderLayout());
        // add heading
        addHeading();
        addDataEntryPanel();
        addLoginButton();
    }

    private void addHeading() {
        JLabel headingLabel = new JLabel("Solent Booking System");
        this.add(headingLabel, BorderLayout.NORTH);
    }

    private void addDataEntryPanel() {
        JPanel dataEntryPanel = new JPanel();
        dataEntryPanel.setLayout(new GridLayout(2, 2));

        JLabel usernameLabel = new JLabel("UserName");
        dataEntryPanel.add(usernameLabel);

        usernameTextField = new JTextField();
        dataEntryPanel.add(usernameTextField);

        JLabel passwordLabel = new JLabel("Password");
        dataEntryPanel.add(passwordLabel);

       passworJTextField = new JTextField();
        dataEntryPanel.add(passworJTextField);

        this.add(dataEntryPanel, BorderLayout.CENTER);
    }

    private void addLoginButton() {
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        this.add(loginButton, BorderLayout.SOUTH);
    }
    @Override
    public void actionPerformed(ActionEvent e){
      if (e.getSource() == loginButton){
         if (usernameTextField.getText().equals(Config.USERNAME)&&passworJTextField.getText().equals(Config.PASSWORD)){
             System.out.println("login succesful");
             
         }
         else {
            System.out.println("login failed");
         }
      }
      }
}
