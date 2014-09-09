
import java.util.Random;
public class DieSimulation
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        int randomValue= generator.nextInt(6);
        randomValue = randomValue +1;
        System.out.println(randomValue);
        Random dingus = new Random();
        System.out.println(dingus.nextInt(6));
    }
}