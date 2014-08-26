import javax.swing.JOptionPane;
public class DialogViewer
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("what is your name");
        System.out.print("Hello,");
        System.out.print(name);
    }
}