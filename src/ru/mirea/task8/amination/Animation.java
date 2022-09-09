package ru.mirea.task8.amination;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Animation extends JFrame {
    private int sh;
    private ArrayList<Image> images = new ArrayList<>();
    public Animation() throws IOException {
        //frame.add(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 400);
        this.setVisible(true);
        for(int i=0;i<14;i++){
            images.add(new ImageIcon("./images/frame_" + i + "_delay-0.06s.jpg").getImage());
        }
        sh=0;
    }



    public static void main(String[] args) throws IOException {
        new Animation();
    }
    public void paint(Graphics g){
        super.paint(g);
        if(sh==0) {sh++; return;}
        System.out.println(images);
        g.drawImage(images.get(sh % 14), 0, 0, 600, 400, null);
        try {
            Thread.sleep(60);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sh++;
        repaint();
    }
}
