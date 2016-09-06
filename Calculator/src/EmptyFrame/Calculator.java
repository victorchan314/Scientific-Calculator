// EmptyFrame.java
//Victor Chan, Manik Khurana
package EmptyFrame;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
class EmptyFrame extends JFrame{
  public EmptyFrame(){
  }

  public static void main(String[] args){
    JFrame Calculator = new EmptyFrame();
    Calculator.setTitle("Calculator");
    Calculator.setSize(800,550);
    Calculator.setLocationRelativeTo(null);
    Calculator.setDefaultCloseOperation(EXIT_ON_CLOSE);
   
    JPanel panel = new JPanel();
    Calculator.add(panel);
    panel.setLayout(null); 
    
    final JLabel Answer = new JLabel("Answer");
    Answer.setBounds(20,5,250,50);
    Answer.setFont(new Font("Sans Serif",0,50));
    panel.add(Answer);
    
    final JLabel firstnumberlabel = new JLabel("First Number");
    firstnumberlabel.setBounds(20,80,500,40);
    firstnumberlabel.setFont(new Font("Sans Serif",0,30));
    panel.add(firstnumberlabel);
    
    final JTextArea firstnumber =new JTextArea();
    firstnumber.setLineWrap(true);
    firstnumber.setWrapStyleWord(false);
    firstnumber.setBounds(20,120,250,50);
    panel.add(firstnumber);
    
    final JLabel secondnumberlabel = new JLabel("Second Number");
    secondnumberlabel.setBounds(20,230,500,40);
    secondnumberlabel.setFont(new Font("Sans Serif",0,30));
    panel.add(secondnumberlabel);
    
    final JTextArea secondnumber =new JTextArea();
    secondnumber.setLineWrap(false);
    secondnumber.setWrapStyleWord(true);
    secondnumber.setBounds(20,270,250,50);
    panel.add(secondnumber);
    
    JButton quit = new JButton("Quit");
    quit.setBounds(600, 450, 100, 50);
    quit.setFont(new Font("Sans Serif",0,30));
    panel.add(quit);
    
    JButton clearall = new JButton("Clear All");
    clearall.setBounds(425, 450, 150, 50);
    clearall.setFont(new Font("Sans Serif",0,30));
    panel.add(clearall);

    JButton addition = new JButton("+");
    addition.setBounds(20, 350, 50, 50);
    addition.setFont(new Font("Sans Serif",0,28));
    panel.add(addition);
    
    JButton subtraction = new JButton("-");
    subtraction.setBounds(80, 350, 50, 50);
    subtraction.setFont(new Font("Sans Serif",0,28));
    panel.add(subtraction);
    
    JButton multiplication = new JButton("x");
    multiplication.setBounds(140, 350, 50, 50);
    multiplication.setFont(new Font("Sans Serif",0,28));
    panel.add(multiplication);
    
    JButton division = new JButton("/");
    division.setBounds(200, 350, 50, 50);
    division.setFont(new Font("Sans Serif",0,28));
    panel.add(division);
    
    JButton exponent = new JButton("^");
    exponent.setBounds(260, 350, 50, 50);
    exponent.setFont(new Font("Sans Serif",0,28));
    panel.add(exponent);
    
    JButton root = new JButton("root");
    root.setBounds(320, 350, 100, 50);
    root.setFont(new Font("Sans Serif",0,28));
    panel.add(root);
    
    JButton logarithm = new JButton("log");
    logarithm.setBounds(20, 410, 100, 50);
    logarithm.setFont(new Font("Sans Serif",0,28));
    panel.add(logarithm);
    
    JButton pi1 = new JButton("pi");
    pi1.setBounds(300, 120, 75, 50);
    pi1.setFont(new Font("Sans Serif",0,28));
    panel.add(pi1);
    
    JButton e1 = new JButton("e");
    e1.setBounds(400, 120, 50, 50);
    e1.setFont(new Font("Sans Serif",0,28));
    panel.add(e1);
    
    JButton Answer1 = new JButton("Answer");
    Answer1.setBounds(475, 120, 150, 50);
    Answer1.setFont(new Font("Sans Serif",0,28));
    panel.add(Answer1);
    
    JButton Clear1 = new JButton("Clear");
    Clear1.setBounds(650, 120, 100, 50);
    Clear1.setFont(new Font("Sans Serif",0,28));
    panel.add(Clear1);
    
    JButton pi2 = new JButton("pi");
    pi2.setBounds(300, 270, 75, 50);
    pi2.setFont(new Font("Sans Serif",0,28));
    panel.add(pi2);
    
    JButton e2 = new JButton("e");
    e2.setBounds(400, 270, 50, 50);
    e2.setFont(new Font("Sans Serif",0,28));
    panel.add(e2);
    
    JButton Answer2 = new JButton("Answer");
    Answer2.setBounds(475, 270, 150, 50);
    Answer2.setFont(new Font("Sans Serif",0,28));
    panel.add(Answer2);
    
    JButton Clear2 = new JButton("Clear");
    Clear2.setBounds(650, 270, 100, 50);
    Clear2.setFont(new Font("Sans Serif",0,28));
    panel.add(Clear2);
    
    Calculator.setVisible(true);
    
    quit.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
            System.exit(0);
       }
    });
    
    clearall.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
        	Answer.setText(null);
        	firstnumber.setText(null);
        	secondnumber.setText("");
       }
    });
    
    addition.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
        	double n1=Double.parseDouble(firstnumber.getText());
        	double n2=Double.parseDouble(secondnumber.getText());
        	Answer.setText(Double.toString(n1+n2));
	       }
	   });
    
    subtraction.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
        	double n1=Double.parseDouble(firstnumber.getText());
        	double n2=Double.parseDouble(secondnumber.getText());
        	Answer.setText(Double.toString(n1-n2));
	       }
	   });
    
    multiplication.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
        	double n1=Double.parseDouble(firstnumber.getText());
        	double n2=Double.parseDouble(secondnumber.getText());
        	Answer.setText(Double.toString(n1*n2));
	       }
	   });
    
    division.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
        	double n1=Double.parseDouble(firstnumber.getText());
        	double n2=Double.parseDouble(secondnumber.getText());
        	Answer.setText(Double.toString(n1/n2));
	       }
	   });
    
    exponent.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
        	double n1=Double.parseDouble(firstnumber.getText());
        	double n2=Double.parseDouble(secondnumber.getText());
        	Answer.setText(Double.toString(Math.pow(n1,n2)));
	       }
	   });
    
    root.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
        	double n1=Double.parseDouble(firstnumber.getText());
        	double n2=Double.parseDouble(secondnumber.getText());
        	Answer.setText(Double.toString(Math.pow(n1,(1/n2))));
	       }
	   });
    
    logarithm.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
        	double n1=Double.parseDouble(firstnumber.getText());
        	double n2=Double.parseDouble(secondnumber.getText());
        	Answer.setText(Double.toString(Math.log(n2)/Math.log(n1)));
	       }
	   });
    
    pi1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
        	firstnumber.setText(Double.toString(Math.PI));
	       }
	   });
    
    e1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
        	firstnumber.setText(Double.toString(Math.E));
	       }
	   });
    
    Answer1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
        	firstnumber.setText(Answer.getText());
	       }
	   });
    
    Clear1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
        	firstnumber.setText(null);
	       }
	   });
    
    pi2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
        	secondnumber.setText(Double.toString(Math.PI));
	       }
	   });
    
    e2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
        	secondnumber.setText(Double.toString(Math.E));
	       }
	   });
    
    Answer2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
        	secondnumber.setText(Answer.getText());
	       }
	   });
    
    Clear2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
        	secondnumber.setText("");
	       }
	   });
  }
}