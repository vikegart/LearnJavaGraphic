package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {



    public static void main(String[] args) throws InterruptedException {
        Panel panel = new Panel();
        JFrame frame = new JFrame("Mini Tennis");

//        Button btnHi = new Button("HI ALL");
//
//        frame.setLayout(new FlowLayout());
//
//        btnHi.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });

        frame.add(panel);
//        frame.add(btnHi);
        frame.setBounds(50, 50, 1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == 'a'){
                    panel.moveBall();
                    frame.repaint();
                }
                if (e.getExtendedKeyCode() == KeyEvent.VK_UP){
                    frame.repaint();
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {


            }
        });

//        while (true){
//            panel.Blink();
//            panel.repaint();
////            Thread.sleep(10);
//        }




    }
}
