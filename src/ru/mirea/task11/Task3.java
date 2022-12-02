package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.regex.Pattern;

public class Task3 extends JFrame {
    private static JPanel[] frame;
    private static JLabel label;
    private static TextField input, inp2, inp3;
    private static JButton ans;
    private int kol;
    private int num;
    private int an;

    public Task3(){
        this.setName("Password application");

        this.setLayout(new GridLayout(3,1));
        this.setSize(600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        kol=0;
        frame = new JPanel[3];
        for (int i = 0; i < 3; i++) {
            frame[i]= new JPanel();
            this.add(frame[i]);
        }
        label = new JLabel("Service: ");
        input = new TextField();
        input.setBounds(0,0,200,10);
        input.setColumns(40);
        inp2=new TextField();
        inp2.setBounds(0,20,200,10);
        inp2.setColumns(40);
        inp3=new TextField();
        inp3.setBounds(0,40,200,10);
        inp3.setColumns(40);
        frame[0].add(label);
        frame[0].add(input);
        frame[1].add(new JLabel("User name:"));
        frame[1].add(inp2);
        frame[2].add(new JLabel("Password:"));
        frame[2].add(inp3);
        inp3.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER){
                    String ps = inp3.getText();
                    if(Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}").matcher(ps).find()){
                        JOptionPane.showMessageDialog(null, "Good password");
                    }else{
                        JOptionPane.showMessageDialog(null, "Bad passwoed");
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });


        this.setVisible(true);
    }
    public static void main(String[] args) {
        new Task3();
    }


}
