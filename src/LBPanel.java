import javax.swing.*;
import java.awt.*;

public class LBPanel extends JPanel {

    public static final int HEIGHT = 350;
    public static final int WIDTH = 370;
    private int fieldHight = 25;
    private int fieldWidth = 50;

    protected double weightOfLB;
    protected int noOfPeople;
    protected String weightInLB;
    protected String totalWeight;
    protected String davitWeight;



    public LBPanel() {

        add(new JLabel("Weights to be loaded to the LB and used for Davits test (kg)"));
        add(new JLabel("________________________________"));

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.orange);

        Dimension fieleds = new Dimension(fieldWidth, fieldHight);

        add(new JLabel("Weight of the empty boat with equipment"));
        JTextField weightField = new JTextField();
        weightField.setPreferredSize(fieleds);
        add(weightField(weightOfLB));


        add(new JLabel("No. of persons"));
        JTextField personsField = new JTextField();
        personsField.setPreferredSize(fieleds);
        add(personsField);

        add(new Label("______________________________"));

        add(new JLabel("Calculated weight to be loaded to LB: "));
        add(new JLabel(weightInLB));
        add(new JLabel("Calculated total load: "));
        add(new JLabel(totalWeight));
        add(new JLabel("Calculated weight to be used for Davit test: "));
        add(new JLabel(davitWeight));

    }
}
