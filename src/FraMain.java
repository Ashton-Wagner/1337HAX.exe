
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JFrame;

public class FraMain extends JFrame {

    public FraMain() {

        setSize(400, 400);
        setTitle("Animation Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //setResizable(false);
        add(new PanMain());
    }
}