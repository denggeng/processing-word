package me.denggeng.processingword.sketch;

import processing.core.PApplet;

/**
 * Created by root on 25/6/15.
 */
public class Particles2 extends PApplet {
    Spring2D s1, s2;


    public void setup() {
        fill(255, 126);
        // Inputs: x, y, mass, gravity
        s1 = new Spring2D(0.0f, 0f);
    }

    @Override
    public void settings() {
        size(1000, 1000, P2D);
    }


    public void draw() {
        background(0);
        s1.update(mouseX, mouseY);
//        System.out.println("###############mouseX:"+mouseX);
        s1.display();
        //s2.update(s1.x, s1.y);
        //s2.display(s1.x, s1.y);
    }

    class Spring2D {
        float x, y; // The x- and y-coordinates


        Spring2D(float xpos, float ypos) {
            x = xpos;
            y = ypos;
        }

        void update(float targetX, float targetY) {
            x = targetX;
            y = targetY;
        }

        void display() {
            textSize(45);
            String s0 = "fundamental";
            String s1 = "funda";
            String s2 = "ment";
            String s3 = "al";

            float s0w = textWidth(s0);
            float s1w = textWidth(s1);
            float s2w = textWidth(s2);
            float s3w = textWidth(s3);


            System.out.println("s1w:" + s1w);
            System.out.println("s2w:" + s2w);

            float[] s0Pos = {x - s0w / 2, y};
            float secondLineY = s0Pos[1] + 100;
            float[] s0CenterPos = {x, y};

            float[] s1Pos = {s0Pos[0], secondLineY};
            float[] s1CenterPos = {s0Pos[0] + s1w / 2, secondLineY};

            float[] s2Pos = {s1Pos[0] + s1w + 20, secondLineY};
            float[] s2CenterPos = {s2Pos[0] + s2w / 2, secondLineY};

            float[] s3Pos = {s2Pos[0] + s2w + 20, secondLineY};
            float[] s3CenterPos = {s3Pos[0] + s3w / 2, secondLineY};

            fill(255);
            noStroke();
            //ellipse(x, y, radius*2, radius*2);
            stroke(255);
            //line(x, y, nx, ny);
            text(s0, s0Pos[0], s0Pos[1]);
            fill(255, 0, 0);
            //textSize(30);
            text(s1, s1Pos[0], s1Pos[1]);
            //textSize(30);
            fill(0, 255, 0);
            text(s2, s2Pos[0], s2Pos[1]);
            fill(0, 0, 255);
            text(s3, s3Pos[0], s3Pos[1]);
            line(s0CenterPos[0], s0CenterPos[1], s1CenterPos[0], s1CenterPos[1] - 45);
            line(s0CenterPos[0], s0CenterPos[1], s2CenterPos[0], s2CenterPos[1] - 45);
            line(s0CenterPos[0], s0CenterPos[1], s3CenterPos[0], s3CenterPos[1] - 45);
        }
    }
}
