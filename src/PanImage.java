
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
    int nFrame;
    int nCycle;

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

    public void SetVar(int _nFrame, int _nCycle) {
        //To Reset
        nFrame = _nFrame;
        nCycle = _nCycle;

    }

    public void SpriteAnim(int nX, int nY) {
        try {
            g.drawImage(ariSprite[nFrame][nCycle], nX, nY, this);
        } catch (Exception ex) {
        }
    }
}