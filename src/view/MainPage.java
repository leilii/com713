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
 *
 *
 * @author 4najal61
 */
public class MainPage extends JFrame implements ActionListener {
    //Constrauctor- initial state

    JButton Button1;
    JButton Button2;
    JButton Button3;

    public MainPage() {
        //set the window layout manager
        this.setLayout(new BorderLayout());
        // add heading
        addHeading();

        addButton1();
        //addButton2();
        //addButton3();
    }

    private void addHeading() {
        JLabel headingLabel = new JLabel("Wellcom");
        this.add(headingLabel, BorderLayout.NORTH);
    }

    private void addMyButtons() {

        JPanel MyButtons = new JPanel();
        MyButtons.setLayout(new GridLayout(1, 3));

        Button1 = new JButton("Login");
        MyButtons.add(Button1);
        Button1.addActionListener(this);

        Button2 = new JButton("Login");
        MyButtons.add(Button2);
        Button2.addActionListener(this);

        Button3 = new JButton("Login");
        MyButtons.add(Button3);
        Button3.addActionListener(this);

        this.add(MyButtons, BorderLayout.CENTER);
    }

    private void addButton1() {
        Button1 = new JButton("Login");
        Button1.addActionListener(this);
        this.add(Button1, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
