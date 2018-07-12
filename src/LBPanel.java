import javax.swing.*;
import java.awt.*;

public class LBPanel extends JPanel {

    public static final int HEIGHT = 350;
    public static final int WIDTH = 330;

    public LBPanel() {

        add(new JLabel("Weights to be laoded to the LB and used for Davits test"));

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.orange);

        add(new JTextField("Weight of the empty boat with equipment"));
        add(new JTextField("No. of persons"));

        add(new JLabel("Calculated weight to be loaded to LB: "));
        add(new JLabel("Calculated total load: "));
        add(new JLabel("Calculated weight to be used for Davit test: "));

    }
}
