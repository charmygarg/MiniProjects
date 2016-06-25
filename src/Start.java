import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Charmy Garg on 2/5/2016.
 */
public class Start implements ActionListener{
    public JButton playButton;
    public JPanel startPannel;
    public JButton exitButton;
    public JLabel startLabel;


    public void actionPerformed(ActionEvent e)
    {
        JButton clickedButton = (JButton)e.getSource();

        if(clickedButton == this.exitButton)
        {
            exitButton.setEnabled(false);
            playButton.setEnabled(false);
            System.exit(0);

        }
        else
        {
            if(clickedButton == this.playButton)
            {
                TicTacToeScreen screen = new TicTacToeScreen();
                //startPannel.setEnabled(false);
            }
        }
    }
}
