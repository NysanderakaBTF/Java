package ru.mirea.task8.amination;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Animation extends JFrame {
    private static int sh;
    private static JPanel frame;
    private static JLabel Screen = new JLabel();
    private static ArrayList<ImageIcon> images = new ArrayList<>();
    public Animation() throws InterruptedException {

        this.setName("Guess a number");
        this.setLayout(new FlowLayout());
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for(int i=0;i<14;i++){
            images.add(new ImageIcon( i + ".jpg"));
        }
        frame = new JPanel();
        sh=0;

        frame.add(Screen);
        this.add(frame);
        this.setVisible(true);
    }

    public static void main(String[] args) throws InterruptedException {
        Animation a = new Animation();
        a.gif();
    }
    public void gif() throws InterruptedException {
        while (true){
            for (int i=0; i<14; i++){
                Screen.setIcon(images.get(i));
                frame.add(Screen);
                Thread.sleep(60);
            }
        }
    }
}
