package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Text extends JFrame {
    private JPanel[] panel;
    private JComboBox color;
    private JComboBox font;
    private JTextArea text;
    private String[] c;
    private String[] t;
    public Text(){
        c = new String[]{"Red", "Black", "Green"};
        t = new String[]{"font1", "font2", "font3"};
        panel = new JPanel[3];
        for (int i = 0; i < 3; i++) {
            panel[i]=new JPanel();
        }
        setLayout(new GridLayout(3, 1));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200,200);

        color = new JComboBox<>(c);
        font = new JComboBox<>(t);
        text= new JTextArea(5,10);
        panel[0].add(text);
        panel[1].add(color);
        panel[2].add(font);

        color.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox b = (JComboBox) e.getSource();
                String an = (String) b.getSelectedItem();
                if(an.equals(c[0])){
                    text.setForeground(Color.RED);
                }
                if(an.equals(c[1])){
                    text.setForeground(Color.BLACK);
                }
                if(an.equals(c[2])){
                    text.setForeground(Color.GREEN);
                }
            }
        });

        font.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                font.setEnabled(true);
                JComboBox b = (JComboBox) e.getSource();
                String an = (String) b.getSelectedItem();
                System.out.println(an);
                if(an.equals(t[0])){
                    text.setFont(new Font("serif",Font.ITALIC, 14 ));
                }
                if(an.equals(t[1])){
                    text.setFont(new Font("monospaced",Font.ROMAN_BASELINE, 14 ));
                }
                if(an.equals(t[2])){
                    text.setFont(new Font("serif",Font.CENTER_BASELINE, 14 ));
                }
            }
        });

        for (int i = 0; i < 3; i++) {
            this.add(panel[i]);
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new Text();
    }
}
