import javax.swing.*;
import java.awt.*;

public class LRPanel extends JPanel {

    public static final int HEIGHT = 350;
    public static final int WIDTH = 330;

    public LRPanel() {

        add(new JLabel("Weights to for Davit's test."));

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.white);

        add(new JTextField("SWL of the Davit"));

        add(new JLabel("Calculated weight to be used for Davit test: "));
    }
}
