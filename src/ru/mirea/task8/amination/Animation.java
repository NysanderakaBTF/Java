package ru.mirea.task8.amination;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Animation extends JFrame {
    private ArrayList<Image> images = new ArrayList<>();
    public Animation() throws IOException {
        //frame.add(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 400);
        this.setVisible(true);
        for(int i=0;i<14;i++){
            images.add(ImageIO.read(new File("./images/frame_" + i + "_delay-0.06s.jpg")));
        }
    }



    public static void main(String[] args) throws IOException {
        new Animation();
    }
    public void paint(Graphics g){
        System.out.println("painting");
        g.drawImage(images.get(0),0,0,null );
        Graphics2D gr2d = (Graphics2D) g;
            for (int i = 0; i < 14; i++) {
                gr2d.drawImage(images.get(i), 0, 0, 600, 400, null);
                try {
                    Thread.sleep(60);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
    }
}
