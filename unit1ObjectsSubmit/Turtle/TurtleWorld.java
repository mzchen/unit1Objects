import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle.penDown();
        turtle.forward(100);
        turtle.turnRight();
 
        turtle.forward(100);
        turtle.turnRight();
 
        turtle.forward(100);
        turtle.turnRight();
 
        turtle.forward(100);
        turtle.turnRight();
        turtle.forward(50);
        
        turtle.turnRight();
        turtle.forward(50);
        turtle.setPenWidth(100);
        turtle.forward(25);
        
 
    }
}
