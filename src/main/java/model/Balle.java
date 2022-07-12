//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package model;

import java.awt.Color;
import java.awt.Graphics2D;

public class Balle {
    private int x;
    private int y;
    private int vitesseVertical;
    private int vitesseHorizontal;
    private Color couleur;

    public Balle(int x, int y, int vitesseVertical, int vitesseHorizontal, Color couleur) {
        this.x = x;
        this.y = y;
        this.vitesseVertical = vitesseVertical;
        this.vitesseHorizontal = vitesseHorizontal;
        this.couleur = couleur;
    }

    public Balle(int x, int y, int vitesseVertical, int vitesseHorizontal) {
        this.x = x;
        this.y = y;
        this.vitesseVertical = vitesseVertical;
        this.vitesseHorizontal = vitesseHorizontal;
        this.couleur = Color.RED;
    }

    public void mouvement(int largeur, int hauteur) {
        this.x += this.vitesseHorizontal;
        this.y += this.vitesseVertical;
        if (this.x > largeur || this.x < 0) {
            this.vitesseHorizontal *= -1;
        }

        if (this.y > hauteur || this.y < 0) {
            this.vitesseVertical *= -1;
        }

    }

    public void dessinner(Graphics2D dessin) {
        dessin.setColor(this.couleur);
        dessin.fillOval(this.x, this.y, 15, 15);
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVitesseVertical() {
        return this.vitesseVertical;
    }

    public void setVitesseVertical(int vitesseVertical) {
        this.vitesseVertical = vitesseVertical;
    }

    public int getVitesseHorizontal() {
        return this.vitesseHorizontal;
    }

    public void setVitesseHorizontal(int vitesseHorizontal) {
        this.vitesseHorizontal = vitesseHorizontal;
    }

    public Color getCouleur() {
        return this.couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }
}
