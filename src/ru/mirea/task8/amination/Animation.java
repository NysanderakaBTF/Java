package ru.mirea.task8.amination;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Animation extends JPanel {
    JFrame frame = new JFrame("Task 8/3");
    ArrayList<Image> images = new ArrayList<>(0);
    public Animation(){
        frame.add(new Animation());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setVisible(true);

    }
    public void loadImg() throws IOException {
        for(int i=0;i<14;i++){
            images.add(new ImageIcon("./images/frame_"+i+"_delay-0.06s.gif").getImage());
        }
    }

    public static void main(String[] args) {
        new Animation();
    }
    public void paint(Graphics g){
        Graphics2D gr2d = (Graphics2D) g;
        try {
            loadImg();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        while (true) {
            for (int i = 0; i < 14; i++) {
                gr2d.drawImage(images.get(i),0,0, 600, 400, null);
                try {
                    Thread.sleep(60);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
