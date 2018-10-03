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

        Calculate = new Calculate(LBPanel);
        add(Calculate);

        Reset = new Reset();
        add(Reset);

    }
}
