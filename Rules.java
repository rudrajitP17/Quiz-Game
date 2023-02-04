package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton start,back;
    
    Rules(String name)
    {
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading=new JLabel("Welcome "+name+" to Simple Minds");
        heading.setBounds(50,20,600,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,22));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel rules=new JLabel("Find below the Rules");
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setText(
              "<html>"+ 
                "1. You are given 15 seconds for one question." + "<br><br>" +
                "2. There are in total 10 questions." + "<br><br>" +
                "3. Once you go the next question, you are not allowed to visit the previous question." + "<br><br>" +
                "4. You are given 50-50 lifeline option, which can be used only once." + "<br><br>" +
                "5. Once you are in the last question you have to tap on the Submit button to end the test." + "<br><br>" +
                "6. Your score will be displayed at the end of the test." + "<br><br>" +
                "7. Let's get started." + "<br><br>" +
              "<html>");
        add(rules);
        
        start=new JButton("Start");
        start.setBounds(320,450,100,25);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        back=new JButton("Back");
        back.setBounds(470,450,100,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        setSize(900,550);
        setLocation(230,100);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==start)
        {
            setVisible(false);
            new Quiz(name);
        }
        else
        {
            setVisible(false);
            new Login();
        }
    }
    public static void main(String args[])
    {
        new Rules("User");
    }
}
