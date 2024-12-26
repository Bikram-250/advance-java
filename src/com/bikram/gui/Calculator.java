package com.bikram.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JLabel infoLabel, input1Label, input2Label, resultLabel;
    private JTextField input1Field;
    private JTextField input2Field;
    private JTextField resultField;
    private JButton sumButton;
    private JButton differenceButton;
    private JButton multiplicationButton;
    private JButton divisionButton;


    public Calculator() {
        infoLabel = new JLabel("Welcome to the Simple Calculator");
        input1Label = new JLabel("Input 1");
        input2Label = new JLabel("Input 2");
        resultLabel = new JLabel("Result ");

        input1Field = new JTextField(20);
        input2Field = new JTextField(20);
        resultField = new JTextField(20);

        resultField.setEditable(false); // Make result field read-only

        //for making different buttons
        sumButton = new JButton("sum");
        differenceButton = new JButton("Difference");
        multiplicationButton = new JButton("multiplication");
        divisionButton = new JButton("Division");

        //set frame size
        this.setSize(500, 500);

        this.setLayout(null);



        //Declearing exact position of indivisuals.....

        infoLabel.setBounds(50, 30, 200, 40);
        input1Label.setBounds(50, 100, 100, 30);
        input1Field.setBounds(200, 100, 150, 30);
        input2Label.setBounds(50, 160, 150, 30);
        input2Field.setBounds(200, 160, 150, 30);
        resultLabel.setBounds(50, 220, 150, 30);
        resultField.setBounds(200, 220, 150, 30);
        sumButton.setBounds(50, 280, 80, 30);
        differenceButton.setBounds(150, 280, 80, 30);
        multiplicationButton.setBounds(250, 280, 80, 30);
        divisionButton.setBounds(350, 280, 80, 30);

        this.add(infoLabel);
        this.add(input1Label);
        this.add(input1Field);
        this.add(input2Label);
        this.add(input2Field);
        this.add(resultLabel);
        this.add(resultField);
        this.add(sumButton);
        this.add(differenceButton);
        this.add(multiplicationButton);
        this.add(divisionButton);


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Calculator  App");

        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  performCalculation("+");
            }
        });

        differenceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 performCalculation("-");
            }
        });

        multiplicationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 performCalculation("*");
            }
        });

        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   performCalculation("/");
            }
        });
    }

  private void performCalculation(String operators) {

        //taking the two inputs
        try {
            double input1 = Double.parseDouble(input1Field.getText().trim());
            double input2 = Double.parseDouble(input2Field.getText().trim());
            double result = 0;


            switch (operators) {
                case "+":
                    result = input1 + input2;
                    break;

                case "-":
                    result = input1 - input2;
                    break;
                case "*":
                    result = input1 * input2;
                    break;
                case "/":
                    if (input2 != 0) {
                        result = input1 / input2;
                    } else {
                        JOptionPane.showMessageDialog(this, "Cannot divide by zero!",
                                "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    break;
            }
            // Display the result
            resultField.setText(String.valueOf(result));


        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers!", "Error", JOptionPane.ERROR_MESSAGE);
        }
  }



    public static void main(String[] args) {
        Calculator app = new Calculator();
        app.setVisible(true);
    }

}