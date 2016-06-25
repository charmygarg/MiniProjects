import javax.swing.*;
/**
 * Created by Charmy Garg on 2/1/2016.
 */
public class TicTacToe {
    public static void main(String[] args) {

        JFrame window1 = new JFrame();

        window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Start start1 = new Start();
        start1.playButton.addActionListener(start1);
        start1.exitButton.addActionListener(start1);

        window1.setContentPane(start1.startPannel);
        window1.pack();
        window1.setVisible(true);

        }
}
