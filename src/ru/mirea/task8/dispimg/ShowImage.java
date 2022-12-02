package ru.mirea.task8.dispimg;

import javax.swing.*;
import java.io.IOException;

public class ShowImage extends JFrame {
    ShowImage(String path) throws IOException {
        JFrame f = new JFrame("Show Image");
        ImageIcon icon = new ImageIcon(path);
        f.add(new JLabel(icon));
        f.pack();
        f.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) throws IOException {
        new ShowImage("img1.jpg");
    }
}
