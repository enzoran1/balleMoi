//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.Balle;
import model.Rectangle;

public class Fenetre extends Canvas {
    private int largeur;
    private int hauteur;

    public Fenetre(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        JFrame fenetre = new JFrame("Casse brique");
        JPanel panneau = (JPanel)fenetre.getContentPane();
        panneau.setPreferredSize(new Dimension(largeur, hauteur));
        this.setBounds(0, 0, largeur, hauteur);
        panneau.add(this);
        fenetre.pack();
        fenetre.setResizable(false);
        fenetre.setLocationRelativeTo((Component)null);
        fenetre.setVisible(true);
        fenetre.setDefaultCloseOperation(3);
        fenetre.requestFocus();
        this.createBufferStrategy(2);
        this.setIgnoreRepaint(true);
        this.setFocusable(false);
        this.demarrer();
    }

    public void demarrer() {
        Balle[] tableauBalle = new Balle[10];

        Rectangle Rectangle = new Rectangle(20,20,Color.BLUE);

        for(int i = 0; i < 10; ++i) {
            tableauBalle[i] = new Balle((int)(Math.random() * (double)this.largeur), (int)(Math.random() * (double)this.hauteur), (int)(Math.random() * 4.0 + 1.0), (int)(Math.random() * 4.0 + 1.0));
        }

        while(true) {
            Graphics2D dessin = (Graphics2D)this.getBufferStrategy().getDrawGraphics();
            dessin.setColor(Color.WHITE);
            dessin.fillRect(0, 0, this.largeur, this.hauteur);
            Balle[] var3 = tableauBalle;
            int var4 = tableauBalle.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                Balle balle = var3[var5];
                balle.mouvement(this.largeur, this.hauteur);
                balle.dessinner(dessin);
            }
            Rectangle.dessinner(dessin);

            dessin.dispose();
            this.getBufferStrategy().show();

            try {
                Thread.sleep(16L);
            } catch (Exception var7) {
            }
        }
    }
}
