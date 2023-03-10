package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
    JButton rules,back;
    JTextField tfname;
    Login()
    {
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,500,500);
        add(image);
        
        JLabel heading=new JLabel("Simple Minds");
        heading.setBounds(630,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel name=new JLabel("Enter your name");
        name.setBounds(690,100,300,70);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        name.setForeground(new Color(30,144,254));
        add(name);
        
        tfname=new JTextField();
        tfname.setBounds(600,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);
        
        rules=new JButton("Rules");
        rules.setBounds(610,280,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back=new JButton("Back");
        back.setBounds(765,280,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1000,500);
        setLocation(200, 150);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == rules)
        {
            String name=tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource() == back)
        {
            setVisible(false);
        }
    }
    public static void main(String args[])
    {
        new Login();
    }
}
