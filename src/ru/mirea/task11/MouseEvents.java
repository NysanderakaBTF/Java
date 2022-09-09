package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class MouseEvents extends JFrame {

    public MouseEvents() {

        this.setName("Mouse Events");
        this.setLayout(new BorderLayout());
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel l1 = new JLabel("NORTH", SwingConstants.CENTER);
        JLabel l2 = new JLabel("EAST",SwingConstants.CENTER);
        JLabel l3 = new JLabel("SOUTH",SwingConstants.CENTER);
        JLabel l4 = new JLabel("WEST",SwingConstants.CENTER);
        JLabel l5 = new JLabel("CENTER",SwingConstants.CENTER);
        Container window = getContentPane();
        window.add(l1, BorderLayout.NORTH);
        window.add(l2, BorderLayout.SOUTH);
        window.add(l3, BorderLayout.WEST);
        window.add(l4, BorderLayout.EAST);
        window.add(l5, BorderLayout.CENTER);


        l4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(null, "Welcome to East");
            }
        });


        l3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(null, "Welcome to West");
            }
        });


        l1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(null, "Welcome to North");
            }
        });


        l2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(null, "Welcome to South");
            }
        });



        l5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(null, "Welcome to Center");
            }
        });

        this.setVisible(true);
    }

    public static void main(String[] args) {
        MouseEvents m = new MouseEvents();
    }
//        label = new JLabel("Угадайте число между 0 и 20, есть три попытки");
//        input = new TextField();
//        ans = new JButton("Попытаться");
//        ans.addActionListener( new Guess.TryActionListener(this) );
//        frame[0].add(label);
//        frame[1].add(input);
//        frame[2].add(ans)
}

