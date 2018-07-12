import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private JButton Calculate;
    private JButton Reset;
    private JPanel LBPanel;
    private JPanel RBPanel;
    private JPanel LRPanel;
    private JPanel LabelPanel;

    public MainFrame() {
        super("Loads Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(450, 100);
        setSize(1100, 600);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 15));
        setResizable(false);

        LabelPanel = new LabelPanel();
        add(LabelPanel);

        LBPanel = new LBPanel();
       // LBPanel.setLocation(10, 50);
        add(LBPanel);

        RBPanel = new RBPanel();
       // RBPanel.setLocation(220, 50);
        add(RBPanel);

        LRPanel = new LRPanel();
       // LRPanel.setLocation(450, 50);
        add(LRPanel);

        Calculate = new Calculate();
        add(Calculate);

        Reset = new Reset();
        add(Reset);

    }
}
