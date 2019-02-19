import javax.swing.JOptionPane;

/**
 * Magic8Ball.java
 * James Jutt
 * 2/11/19
 * Magic 8 Ball that prompts the user to enter a question than recieves one of 10 reponses
 */
import javax.swing.JOptionPane;
public class Magic8Ball 
{
    public static void main(String[] args) 
    {
        String[] responses = {"It is certain", "As I see it, yes", "Ask again later", "My reply is no", "Very doubtful"};
        int random;
        final String KILL = "999";
        String question;
        question = JOptionPane.showInputDialog(null, "Ask the Magic 8 Ball any question or " + KILL + " to QUIT");
        while (!question.equalsIgnoreCase(KILL))
        {    
            random = (int)((1 * Math.random() * responses.length));
            JOptionPane.showMessageDialog(null, responses[random]);
            question = JOptionPane.showInputDialog(null, "Ask the Magic 8 Ball any question or " + KILL + " to QUIT");  
        }
        JOptionPane.showMessageDialog(null, "Thank you for playing");
    }  
}    
