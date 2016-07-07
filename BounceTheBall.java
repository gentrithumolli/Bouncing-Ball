
import java.awt.Color;


public class BounceTheBall {
    
    public static void main(String[] args)
    {
    int box_size=300;
    int ball_radius = 7;
    Box box= new Box(box_size);
    
    MovingBall ball = new MovingBall(box_size/3, box_size/5 , ball_radius , box);
    BallWriter ball_writer= new BallWriter(ball, Color.red);
    
    BoxWriter box_writer= new BoxWriter(box);
    
    
    AnimationWriter writer= new AnimationWriter(box_writer, ball_writer, box_size);
    
    new BounceController(ball,writer).runAnimation();
    }

}
