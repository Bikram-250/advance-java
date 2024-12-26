package com.bikram.gui;


import javax.swing.*;
import java.awt.*;

public class gui {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Demo App");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setAlwaysOnTop(true);

        JLabel label=new JLabel("Welcome to GUI using Swing");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setForeground(Color.RED);
        label.setFont(new Font("SANS_SERIF",3,24));
        label.setOpaque(true);
        label.setBackground(Color.BLUE);
        frame.add(label);
        //label is a which can be added into a container like frame
        frame.setVisible(true);
    }
}
