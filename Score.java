package quiz.application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Score extends JFrame implements ActionListener {
    
    Score(String name,int score)
    {
        setBounds(250,60,900,600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
     
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/images.png"));
//        ImageIcon i2=i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
//        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,900,300);
        add(image);
       
        JLabel heading=new JLabel("Thank You " +name+ " for playing Simple Minds");
        heading.setBounds(100,330,700,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,30));
        add(heading);
        
        JLabel lscore=new JLabel("Your score is "+score);
        lscore.setBounds(100,390,650,30);
        lscore.setFont(new Font("Tahoma",Font.PLAIN,30));
        add(lscore);
        
        JButton submit=new JButton("Play Again");
        submit.setBounds(100,450,200,30);
        submit.setFont(new Font("Tahoma",Font.PLAIN,22));
        submit.setBackground(new Color(30,144,254));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(true);
        add(submit);
        
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Login();
    }
    public static void main(String args[])
    {
        new Score("User",0);
    }
}
