import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculate extends JButton implements ActionListener {

    public static final int HEIGHT = 30;
    public static final int WIDTH = 100;

    LBPanel lbPanel;
    RBPanel rbPanel;
    LRPanel lrPanel;

    public Calculate(JPanel lbPanel, JPanel rbPanel, JPanel lrPanel) {

        this.lbPanel = (LBPanel) lbPanel;
        this.rbPanel = (RBPanel) rbPanel;
        this.lrPanel = (LRPanel) lrPanel;

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        addActionListener(this);

        add(new JLabel("Calculate"));
    }

        @Override
        public void actionPerformed(ActionEvent e) {
                lbPanel.recalculatePanel();
                rbPanel.recalculatePanel();
                lrPanel.recalculatePanel();
        }

}
