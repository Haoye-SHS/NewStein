package Java2.Snake;

import javax.swing.*;
import java.awt.*;

public class Main{
    //width and height of frame
    public final static int WIDTH = 600, HEIGHT = 680;

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        int option;

        do {
            //game rule
            JOptionPane.showMessageDialog(null, "Game Rule: ");

            //frame
            JFrame f = new JFrame("Position Game");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setPreferredSize(new Dimension(WIDTH, HEIGHT));
            f.setResizable(false);
            f.setVisible(true);
            f.pack();

            //panel
            Panel p = new Panel();
            f.add(p);
            p.start();

            //do another?
            option = JOptionPane.showConfirmDialog(null, "Game Over! Restart?");

            //close the frame
            f.dispose();

        }while(option == JOptionPane.YES_OPTION); //restart if yes option
    }
}
