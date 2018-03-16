package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Panel extends JPanel {

    int x = 60;
    int y = 60;

    Color kakash = new Color(125, 80, 15);

    public void moveBall() {
        x = x + 10;
        y = y + 10;
    }


    Color[] colors = {Color.RED, Color.CYAN, Color.orange, Color.magenta };

    public void Blink() {
        for (int i=0; i<=10;  i++){
            kakash = new Color((1+i*20) % 255,(1+i*15) % 255,(1+i*21) % 255);

            //kakash = colors[i];
        }

    }

    public void paintComponent(Graphics gr) { //сначала это, потом вернуться в маин и добавить туда
        gr.setColor(Color.BLACK);
//        gr.drawRect(10,20, 100, 600);
        gr.fillRect(x,y, 400, 300);
        gr.setColor(Color.CYAN);
        gr.fillOval(x-10,y, 100, 200);

        gr.setColor(kakash);
        gr.fillOval(x+100,y, 100, 200);

        Button btnHi = new Button("HI ALL");
        btnHi.setSize(100, 100);













//        gr.fillOval(x,y,w,h);
//        gr.drawOval(x,y,w,h);
//
//        gr.drawString(str,x,y);

//        int[] x = {100, 150, 100};
//        int[] y = {100, 100, 150};
//        gr.fillPolygon(x,y,3);

        gr.setColor(Color.BLACK);

//        for (int i =0; i<20; i++){
//            gr.fillOval(100+10*i, 100+10*i, 400-20*i,400-20*i);
//
//        }
    }
}
