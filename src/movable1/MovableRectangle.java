package movable1;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    
    public MovableRectangle(int x, int y, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x,y,xSpeed,ySpeed);
        bottomRight = new MovablePoint(x,y,xSpeed,ySpeed);
    }
    
    
}
