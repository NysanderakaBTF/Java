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
    private static JPanel p;
    private static JLabel Screen = new JLabel();
    private static ArrayList<ImageIcon> images = new ArrayList<>();
    public Animation() throws InterruptedException {
        p = new JPanel();
        this.setName("Guess a number");
        this.setLayout(new FlowLayout());
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for(int i=0;i<14;i++){
            images.add(new ImageIcon( i + ".jpg"));
        }
        sh=0;
        p.add(Screen);
        this.add(p);
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
                Thread.sleep(60);

            }
        }
    }
}

//package ru.mirea.task8.amination;
//
//import javax.swing.*;
//import java.awt.*;
//import java.util.ArrayList;
//
//public class Animation extends JPanel {
//    static ArrayList<ImageIcon> Gif = new ArrayList<>();
//    static JLabel Screen = new JLabel();
//
//    public void gif() throws InterruptedException {
//        while (true){
//            for (int i=0; i<=13; i++){
//                Screen.setIcon(Gif.get(i));
//                Thread.sleep(60);
//            }
//        }
//    }
//
//
//    public static void main(String [] argv) throws InterruptedException {
//        for (int i=0; i<=13; i++) {
//            String path ="C:/Users/1/IdeaProjects/Java/src/ru/mirea/task8/src/ru/mirea/task8/images" + i + ".png";
//            Gif.add(new ImageIcon(path));
//        }
//        JFrame frame = new JFrame();
//        frame.setSize(800, 600);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setBackground(Color.WHITE);
//
//        Animation anim = new Animation();
//
//        frame.add(anim);
//        frame.add(Screen);
//        frame.setVisible(true);
//
//        anim.gif();
//
//    }
//}