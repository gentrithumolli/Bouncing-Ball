
public class Box {
    int box_size;
    int rad;
    
    public Box(int size)
    {
        box_size=size;
    }
    public void getRadius(int h)
    {
    rad=h;
    }
    public boolean inHorizontalContact(int x_position)
    {
    return (x_position<=0+rad) || (x_position>=box_size-(rad+4));
    }
    
     public boolean inVerticalContact(int y_position)
    {
    return (y_position<=0+rad) || (y_position>=box_size-(rad+4));
    }
     
     
     public boolean inBarrierContact(int x_position,int y_position)
     {
    
     return(x_position==(box_size/2) && y_position>75 && y_position<box_size-75);
     
     }
     
    
     public int sizeOf()
     {
     return box_size;
     }
}
