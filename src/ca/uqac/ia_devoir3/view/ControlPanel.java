package ca.uqac.ia_devoir3.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class ControlPanel extends JPanel implements Observer{
    private JButton moveButton = new JButton("Move");
    private JLabel scoreLabel = new JLabel("Score: 0");

    public ControlPanel() {
        setLayout(new GridLayout(2,1,0,20));
        setBorder(new EmptyBorder(100,20,100,20));
        setPreferredSize(new Dimension(200,100));
        add(scoreLabel);
        add(moveButton);
    }

    public JButton getMoveButton() {
        return moveButton;
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}