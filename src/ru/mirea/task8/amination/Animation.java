package ru.mirea.task8.amination;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Animation extends JFrame {
    JFrame frame = new JFrame("Task 8/3");
    ArrayList<Image> images = new ArrayList<Image>(0);
    public Animation(){
        //frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setVisible(true);
    }


    public void loadImg() throws IOException {
        for(int i=0;i<14;i++){
            images.add(ImageIO.read(new File("./images/frame_" + i + "_delay-0.06s.gif")));
        }
    }

    public static void main(String[] args) {
        new Animation();
    }
    public void paint(Graphics g){
        System.out.println("painting");
        try {
            loadImg();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(images);
        g.drawImage(images.get(0),0,0,null );

       /* while (true) {
            for (int i = 0; i < 14; i++) {
                gr2d.drawImage(images.get(i),0,0, 600, 400, null);
            }
            try {
                Thread.sleep(60);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }*/
    }
}
