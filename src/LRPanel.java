import javax.swing.*;
import java.awt.*;

public class LRPanel extends JPanel {

    public static final int HEIGHT = 350;
    public static final int WIDTH = 370;
    private int fieldHight = 25;
    private int fieldWidth = 50;
    protected String davitWeight;
    protected double SWL;

    public LRPanel() {

        add(new JLabel("Weights to for Davit's test. (kg)"));
        add(new JLabel("_______________________________________"));

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.white);

        Dimension fieleds = new Dimension(fieldWidth, fieldHight);

        add(new JLabel("SWL of the Davit"));
        JTextField weightField = new JTextField();
        weightField.setPreferredSize(fieleds);
        add(weightField);

        add(new JLabel("_______________________________________"));

        add(new JLabel("Calculated weight to be used for Davit test: "));
        add(new Label(davitWeight));
    }
}
