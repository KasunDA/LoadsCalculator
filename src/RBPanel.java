import javax.swing.*;
import java.awt.*;

public class RBPanel extends JPanel {

    JTextField weightField;
    JTextField personsField;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JLabel label7;

    private static final int HEIGHT = 350;
    private static final int WIDTH = 370;
    private int fieldHight = 25;
    private int fieldWidth = 50;

    Logics calcs = new Logics();

    public void recalculatePanel() {
        calcs.RBweight = weightField.getText();
        calcs.PeopleNo = personsField.getText();
        calcs.weightInRbCalc();
        calcs.totalWeightCalc();
        calcs.davitWeightCalc();
        reInitializeLabels();
    }

    private void initializeLabels() {
        label1 = new JLabel("________________________________");
        label2 = new JLabel("Calculated weight to be loaded to RB: ");
        label3 = new JLabel(String.valueOf(calcs.weightInRB));
        label4 = new JLabel("Calculated total load: ");
        label5 = new JLabel(String.valueOf(calcs.totalWeight));
        label6 = new JLabel("Calculated weight to be used for Davit test: ");
        label7 = new JLabel(String.valueOf(calcs.davitWeight));
    }

    private void reInitializeLabels() {
        label3.setText(String.valueOf(calcs.weightInRB));
        label5.setText(String.valueOf(calcs.totalWeight));
        label7.setText(String.valueOf(calcs.davitWeight));
    }

    public RBPanel() {

        add(new JLabel("Weights to be loaded to the RB and used for Davit's test. (kg)"));
        add(new JLabel("________________________________"));

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.yellow);

        Dimension fieleds = new Dimension(fieldWidth, fieldHight);

        add(new JLabel("Weight of the empty boat with equipment"));
        JTextField weightField = new JTextField();
        weightField.setPreferredSize(fieleds);
        add(weightField);

        add(new JLabel("No. of persons"));
        JTextField personsField = new JTextField();
        personsField.setPreferredSize(fieleds);
        add(personsField);

        add(new JLabel("________________________________"));

        initializeLabels();

        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(label6);
        add(label7);
    }
}
