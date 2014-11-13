
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

class PanImage extends JPanel {

    Image ariSprite[][] = new Image[4][2];
    String UploadName;
    Graphics g;
    int nFrame = 0;

    public PanImage() {
        try {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    UploadName = "Doge_";
                }
                for (int i = 0; i < 3; i++) {
                    ariSprite[i][j] = ImageIO.read(new File(UploadName + i + ".png"));
                }
            }

        } catch (IOException e) {
        }
    }

    public void SpriteAnim(int nX, int nY, int nCycle) {
        try {
            g.drawImage(ariSprite[nFrame][nCycle], nX, nY, this);
            if (nFrame == 3) {
                nFrame += 1;
            } else {
                nFrame = 1;
            }
        } catch (Exception ex) {
        }
    }
}