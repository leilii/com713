/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
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
 * @author 4najal61
 */
public class Booking  extends JFrame implements ActionListener {
    //Constrauctor- initial state
JButton BookingButton;
JTextField customernameTextField;
JTextField passworJTextField;
    public Booking() {
        //set the window layout manager
        this.setLayout(new BorderLayout());
        // add heading
        addHeading();
        addDataEntryPanel();
        addBookingButton();
    }

    private void addHeading() {
        JLabel headingLabel = new JLabel("New Booking Page");
        this.add(headingLabel, BorderLayout.NORTH);
    }

    private void addDataEntryPanel() {
        JPanel dataEntryPanel = new JPanel();
        dataEntryPanel.setLayout(new GridLayout(2, 2));

        JLabel usernameLabel = new JLabel("Customer Name");
        dataEntryPanel.add(usernameLabel);

        customernameTextField = new JTextField();
        dataEntryPanel.add(customernameTextField);

        JLabel passwordLabel = new JLabel("Custoner Email");
        dataEntryPanel.add(passwordLabel);

       passworJTextField = new JTextField();
        dataEntryPanel.add(passworJTextField);

        this.add(dataEntryPanel, BorderLayout.CENTER);
    }

    private void addBookingButton() {
        BookingButton = new JButton("Login");
        BookingButton.addActionListener(this);
        this.add(BookingButton, BorderLayout.SOUTH);
    }
    @Override
    public void actionPerformed(ActionEvent e){
      if (e.getSource() == BookingButton){
       
             System.out.println("Go to booking");
                    // MainPage MainGui = new MainPage();
                   //  MainGui.pack();
                    // MainGui.setVisible(true);
 
             
         }
         else {
            System.out.println("Booking failed");
         }
      }
      }
    

