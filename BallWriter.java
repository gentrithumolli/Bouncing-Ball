

import java.awt.Color;
import java.awt.Graphics;


class BallWriter {
private MovingBall ball;
private Color balls_color;

private Box bs;

public BallWriter(MovingBall x , Color c)
{
ball=x;
balls_color=c;
}

public void paint(Graphics g) 
{
g.setColor(balls_color);
int radius = ball.radiusOf();
g.fillOval(ball.xPosition()-radius, ball.yPosition()-radius, 2*radius, 2*radius);
}

}
