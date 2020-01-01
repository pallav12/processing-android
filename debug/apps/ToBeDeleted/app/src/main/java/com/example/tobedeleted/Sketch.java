package com.example.tobedeleted;


import com.core.PApplet;
import com.core.PImage;

import static android.view.Gravity.CENTER;

public class Sketch extends PApplet {

    PImage leaf;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        leaf = loadImage("leaf.png");
        imageMode(CENTER);
    }

    public void draw() {
        background(9);
        image(leaf, mouseX, mouseY);
    }
}