import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculate extends JButton implements ActionListener {

    public static final int HEIGHT = 30;
    public static final int WIDTH = 100;
    private boolean pushed = false;

    LBPanel lbPanel;

    public Calculate(JPanel lbPanel) {

        this.lbPanel = (LBPanel) lbPanel;
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        addActionListener(this);

        add(new JLabel("Calculate"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(pushed)
            lbPanel.recalculatePanel();

        pushed =!pushed;
    }


}
