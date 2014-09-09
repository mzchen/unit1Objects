import java.awt.Color;
public class TurtleDingus
{
    public static void main(String[] args)
    {
        World turtleworld = new World();
        Turtle turtle = new Turtle(turtleworld);
        Turtle turtle2 = new Turtle(turtleworld);
        turtle.setColor(Color.GREEN);
        turtle2.setColor(Color.PINK);
        drawRecs(turtle2,turtle);         
    }
    private static void drawRecs(Turtle turtle2, Turtle turtle) 
    {
        turtle2.forward(100);
        turtle2.setPenColor(Color.BLUE);
        turtle2.turnRight();
        turtle2.forward(200);
        turtle2.setPenColor(Color.RED);
        turtle2.turnRight();
        turtle2.forward(100);
        turtle2.setPenColor(Color.GREEN);
        turtle2.turnRight();
        turtle2.forward(200);
        turtle.turnRight();
        turtle.turnRight();
        turtle.forward(100);
        turtle.setPenColor(Color.MAGENTA);
        turtle.turnRight();
        turtle.forward(200);
        turtle.setPenColor(Color.BLACK);
        turtle.turnRight();
        turtle.forward(100);
        turtle.turnRight();
        turtle.setPenColor(Color.CYAN);
        turtle.forward(200);
    }
}
    