package model;

import java.awt.*;
import java.awt.Color;
import java.awt.Graphics2D;

public class Rectangle {

    private int x;
    private int y;
    private Color color;



    public Rectangle(int x, int y, Color coule) {
        this.x = x;
        this.y = y;
        this.color = coule;
    }

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = Color.RED;
    }

    public void dessinner(Graphics2D dessin) {
        dessin.setColor(this.color);
        dessin.fillRect(this.x, this.y, 40, 15);
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
