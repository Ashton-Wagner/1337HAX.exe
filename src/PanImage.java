
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

class PanImage extends JPanel {

    Image ariSprite[][] = new Image[4][2];
    Graphics g;

    public PanImage() {
        try {
            for (int i = 0; i < 3; i++) {
                ariSprite[i][0] = ImageIO.read(new File("Doge_" + i + ".png"));
            }
        } catch (IOException e) {
        }
        //Call Anim here
    }

    public void SpriteAnim(int nX, int nY) {
        try {
            g.drawImage(ariSprite[0][0], nX, nY, this);
        } catch (Exception ex) {
        }
    }
}