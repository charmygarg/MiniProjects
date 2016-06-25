import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Charmy Garg on 2/1/2016.
 */
public class TicTacToeScreen extends JFrame implements ActionListener {
    public JPanel panel;
    public JButton button00;
    public JButton button01;
    public JButton button02;
    public JButton button10;
    public JButton button11;
    public JButton button12;
    public JButton button20;
    public JButton button21;
    public JButton button22;
    public JButton resetButton;
    public JLabel ResultLabel;

    public int turn = 0;

    public void actionPerformed(ActionEvent e) {
        this.turn++;

        Object source = e.getSource();

        if (source instanceof JLabel) {
            JLabel theclickedLabel = (JLabel) e.getSource();
        } else if (source instanceof JButton) {

            JButton theclickedbutton = (JButton) e.getSource();
            theclickedbutton.setEnabled(false);

            if (theclickedbutton == this.resetButton) {
                this.resetGame();
            } else {

                if ((this.turn % 2) == 0) {
                    theclickedbutton.setText("0");
                    if (hasPlayerWon("0")) {
                        this.disableAllButton();
                        this.ResultLabel.setVisible(true);
                        this.ResultLabel.setText("Player 0 won!");
                        return;
                    }
                } else {
                    theclickedbutton.setText("X");
                    if (hasPlayerWon("X")) {
                        this.disableAllButton();
                        this.ResultLabel.setVisible(true);
                        this.ResultLabel.setText("Player X won!");
                        return;
                    }
                }
                if (this.turn == 9) {
                    this.ResultLabel.setText("Match draw");
                    this.resetButton.setVisible(true);
                }
            }
        }
    }
    public TicTacToeScreen()
    {
        super();
        //TicTacToeScreen screen = new TicTacToeScreen();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.button00.addActionListener(this);
        this.button01.addActionListener(this);
        this.button02.addActionListener(this);
        this.button10.addActionListener(this);
        this.button11.addActionListener(this);
        this.button12.addActionListener(this);
        this.button20.addActionListener(this);
        this.button21.addActionListener(this);
        this.button22.addActionListener(this);
        this.resetButton.addActionListener(this);

        this.setContentPane(this.panel);
        this.pack();
        this.setVisible(true);

    }
    private boolean hasPlayerWon(String symbol) {
        if ((this.button00.getText() == symbol) && (this.button01.getText() == symbol) && (this.button02.getText() == symbol)) {
            return true;
        }
        if ((this.button10.getText() == symbol) && (this.button11.getText() == symbol) && (this.button12.getText() == symbol)) {
            return true;
        }
        if ((this.button20.getText() == symbol) && (this.button21.getText() == symbol) && (this.button22.getText() == symbol)) {
            return true;
        }

        if ((this.button00.getText() == symbol) && (this.button10.getText() == symbol) && (this.button20.getText() == symbol)) {
            return true;
        }
        if ((this.button01.getText() == symbol) && (this.button11.getText() == symbol) && (this.button21.getText() == symbol)) {
            return true;
        }
        if ((this.button02.getText() == symbol) && (this.button12.getText() == symbol) && (this.button22.getText() == symbol)) {
            return true;
        }
        if ((this.button00.getText() == symbol) && (this.button11.getText() == symbol) && (this.button22.getText() == symbol)) {
            return true;
        }
        if ((this.button02.getText() == symbol) && (this.button11.getText() == symbol) && (this.button20.getText() == symbol)) {
            return true;
        }
        return false;

    }

    private void disableAllButton() {
        this.button00.setEnabled(false);
        this.button01.setEnabled(false);
        this.button02.setEnabled(false);
        this.button20.setEnabled(false);
        this.button21.setEnabled(false);
        this.button22.setEnabled(false);
        this.button10.setEnabled(false);
        this.button11.setEnabled(false);
        this.button12.setEnabled(false);
    }
    private void resetGame(){
        this.button00.setEnabled(true);
        this.button01.setEnabled(true);
        this.button02.setEnabled(true);
        this.button20.setEnabled(true);
        this.button21.setEnabled(true);
        this.button22.setEnabled(true);
        this.button10.setEnabled(true);
        this.button11.setEnabled(true);
        this.button12.setEnabled(true);
        this.ResultLabel.setText("");

        this.button00.setText("");
        this.button01.setText("");
        this.button02.setText("");
        this.button20.setText("");
        this.button21.setText("");
        this.button22.setText("");
        this.button10.setText("");
        this.button11.setText("");
        this.button12.setText("");
        this.turn=0;
    }
}