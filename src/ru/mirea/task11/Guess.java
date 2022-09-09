package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Guess extends JFrame {
    private static JPanel[] frame;
    private static JLabel label;
    private static TextField input;
    private static JButton ans;
    private int kol;
    private int num;
    private int an;

    public Guess(){
        this.setName("Guess a number");
        Random random = new Random();
        num=random.nextInt(20);
        this.setLayout(new FlowLayout());
        this.setSize(600, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        kol=0;
        frame = new JPanel[3];
        for (int i = 0; i < 3; i++) {
            frame[i]= new JPanel();
            this.add(frame[i]);
        }
        label = new JLabel("Угадайте число между 0 и 20, есть три попытки");
        input = new TextField();
        ans = new JButton("Попытаться");
        ans.addActionListener( new TryActionListener(this) );
        frame[0].add(label);
        frame[1].add(input);
        frame[2].add(ans);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new Guess();
    }
    public class TryActionListener implements ActionListener{
        JFrame caller;
        public TryActionListener(JFrame own){
            caller=own;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            an = Integer.parseInt(input.getText());
            kol++;
            if (kol==3 && an!=num){
                JOptionPane.showMessageDialog(null, "Game over");
            }else if (kol>3){
                JOptionPane.showMessageDialog(null, "Game over");
            } else if (an==num) {
                JOptionPane.showMessageDialog(null, "You won!");
            } else if (an<num) {
                JOptionPane.showMessageDialog(null, "Try greater value");
            } else {
                JOptionPane.showMessageDialog(null, "Try smaller value");
                DialogFrame df = new DialogFrame(caller, "Try smaller value");
                df.setVisible(true);
            }
        }
    }
   public class DialogFrame extends JDialog{
       public DialogFrame(JFrame owner, String text)
      {
           super(owner, "Result", true);

           add(new JLabel(text));

            JButton ok = new JButton("ok");
            ok.addActionListener(event -> setVisible(false));

           JPanel panel = new JPanel();
            panel.add(ok);
           add(panel, BorderLayout.SOUTH);
            setSize(260, 160);
        }
  }
}

