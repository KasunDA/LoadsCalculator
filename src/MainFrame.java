import javax.swing.*;
import java.awt.*;

class MainFrame extends JFrame {

    MainFrame() {

        JButton Calculate;
        JButton Reset;
        JPanel LBPanel;
        JPanel RBPanel;
        JPanel LRPanel;
        JPanel LabelPanel;

        setTitle("Loads calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(50, 100);
        setSize(1220, 600);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 15));
        setResizable(false);

        LabelPanel = new LabelPanel();
        add(LabelPanel);

        LBPanel = new LBPanel();
        add(LBPanel);

        RBPanel = new RBPanel();
        add(RBPanel);

        LRPanel = new LRPanel();
        add(LRPanel);

        Calculate = new Calculate(LBPanel, RBPanel, LRPanel);
        add(Calculate);

        Reset = new Reset(LBPanel, RBPanel, LRPanel);
        add(Reset);

    }
}
