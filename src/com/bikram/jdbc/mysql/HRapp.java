package com.bikram.jdbc.mysql;

import javax.swing.*;
import java.awt.*;

public class HRapp extends JFrame {

    private JMenuBar mb;
    private  JMenu fileMenu,editMenu,viewMenu,helpMenu;
    private JMenuItem newMenuItem,openMenuItem,closeMenuItem,exitMenuItem;
    private JMenuItem redoItem,undoItem;
    private JMenuItem zoomItem,fontItem;
    private JMenuItem helpItem,searchItem;
    private JButton empButton ,payrollButton, leaveButton;

    //pannels

    private JPanel leftPanel,mainPanel,rightPanel,statusPanel;

    //others components


    public HRapp(){
        setTitle("HR App");
        setPreferredSize(new Dimension(800,600));
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        prepareGUI();
    }
    public void prepareGUI(){

        mb=new JMenuBar();
        fileMenu=new JMenu("File");
        editMenu=new JMenu("Edit");
        viewMenu= new JMenu("View");
        helpMenu= new JMenu("Help");
        newMenuItem= new JMenuItem("New");
        openMenuItem= new JMenuItem("Open");
        closeMenuItem= new JMenuItem("Close");
        exitMenuItem= new JMenuItem("Exit");
        undoItem= new JMenuItem("Undo");
        redoItem= new JMenuItem("Redo");
        zoomItem= new JMenuItem("Zoom");
        fontItem=new JMenuItem("Fonts");
        helpItem=new JMenuItem("Help topics");
        searchItem=new JMenuItem("Search web");

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(new JSeparator());
        fileMenu.add(closeMenuItem);
        fileMenu.add(exitMenuItem);


        editMenu.add(undoItem);
        editMenu.add(redoItem);

        viewMenu.add(zoomItem);
        viewMenu.add(fontItem);


        helpMenu.add(helpItem);
        helpMenu.add(searchItem);

        // add menu into menu bar
        mb.add(fileMenu);
        mb.add(editMenu);
        mb.add(viewMenu);
        mb.add(helpMenu);
        //add mb to frame

        this.add(mb,BorderLayout.PAGE_START);//or NORTH add on the top of frame

        //create and add panels to the frame

        JPanel containerPanel = new JPanel();
        leftPanel=new JPanel(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setBackground(Color.yellow);
        leftPanel.setLayout(null);
        JLabel servicesLabel= new JLabel("Services");
        servicesLabel.setBounds(10,10,190,40);
        empButton=new JButton("Employee Mgmt");
        empButton.setBounds(10,100,190,50);
        payrollButton=new JButton("Payroll Mgmt");
        payrollButton.setBounds(10,200,190,50);
        leaveButton=new JButton("Leave Mgmt");
        leaveButton.setBounds(10,300,190,50);


        leftPanel.add(servicesLabel);
        leftPanel.add(empButton);
        leftPanel.add(payrollButton);
        leftPanel.add(leaveButton);
        containerPanel.add(leftPanel);



        rightPanel=new JPanel();
        rightPanel.setBackground(Color.YELLOW);
        rightPanel.add(new JLabel("Useful links"));

        statusPanel=new JPanel();
        statusPanel.setBackground(Color.pink);
        statusPanel.add(new JLabel("Status"));

        mainPanel=new JPanel();
        mainPanel.setBackground(Color.PINK);

        //add panels to frame , respective  position

        this.add(leftPanel,BorderLayout.LINE_START);
        this.add(rightPanel,BorderLayout.LINE_END);
        this.add(statusPanel,BorderLayout.PAGE_END);
        this.add(mainPanel,BorderLayout.CENTER);
    }


    public static void main(String[] args) {
        HRapp app=new HRapp();
        app.setVisible(true);

    }
}
