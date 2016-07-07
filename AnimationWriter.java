
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class AnimationWriter extends JPanel {
    
    private BoxWriter box_writer;
    private BallWriter ball_writer;
    
    
    public AnimationWriter(BoxWriter b , BallWriter e, int size)
    {
    box_writer=b;
    ball_writer=e;
    JFrame f = new JFrame();
    f.getContentPane().add(this);
    f.setTitle("Bounce");
    f.setSize(size+50,size+50);
    f.setVisible(true); 
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void paintComponent(Graphics g)
    {
    box_writer.paint(g);
    box_writer.paintBarrier(g);
    ball_writer.paint(g);
    
    }
}
