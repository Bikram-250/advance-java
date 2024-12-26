package com.bikram.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.management.LockInfo;

public class LoginForm extends JFrame {
    private JLabel infoLabel,usernamelabel,passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginForm(){
        infoLabel=new JLabel("User login here....");
        usernamelabel=new JLabel("Username");
        passwordLabel= new JLabel("Password");
        usernameField=new JTextField(20);
        passwordField=new JPasswordField(20);
        loginButton=new JButton("Login");
        //set frame size

        this.setSize(500,500);

        //Absolute layout ,Null Layout

        this.setLayout(null);

        //now we can declare  exact position of  individual elements .....
        infoLabel.setBounds(50,30,200,50);
        usernamelabel.setBounds(50,150,100,30);
        usernameField.setBounds(200,150,150,30);
        passwordLabel.setBounds(50,210,100,30);
        passwordField.setBounds(200,210,150,30);
        loginButton.setBounds(50,280,70,30);

        this.add(infoLabel);
        this.add(usernamelabel);
        this.add(usernameField);
        this.add(passwordLabel);
        this.add(passwordField);
        this.add(loginButton);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Login Form");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username =usernameField.getText().trim();
                String password = String.valueOf(passwordField.getPassword()).trim();
                if(username.equals("admins")&& password.equals("admin123")){
                    JOptionPane.showMessageDialog(null,"Login Successful");
                }else{
                    JOptionPane.showMessageDialog(null,"Unsuccessfull login");
                }
            }
                String username=usernameField.getText();
        });


    }

    public static void main(String[] args) {
        LoginForm app= new LoginForm();
        app.setVisible(true);
    }
}
