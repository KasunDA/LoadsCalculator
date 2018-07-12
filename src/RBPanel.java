import javax.swing.*;
import java.awt.*;

public class RBPanel extends JPanel {

    public static final int HEIGHT = 350;
    public static final int WIDTH = 330;

    public RBPanel() {

        add(new JLabel("Weights to be laoded to the RB and used for Davit's test."));

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.yellow);

        add(new JTextField("Weight of the empty boat with equipment"));
        add(new JTextField("No. of persons"));

        add(new JLabel("Calculated weight to be loaded to RB: "));
        add(new JLabel("Calculated total load: "));
        add(new JLabel("Calculated weight to be used for Davit test: "));
    }
}
