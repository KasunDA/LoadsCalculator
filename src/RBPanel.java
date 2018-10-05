import javax.swing.*;
import java.awt.*;

class RBPanel extends JPanel {

    private JTextField weightField;
    private JTextField personsField;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;

    private static final int HEIGHT = 350;
    private static final int WIDTH = 370;

    private LogicsRB calcs = new LogicsRB();

    void recalculatePanel() {
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

    void resetFields() {
        weightField.setText("");
        personsField.setText("");
    }

    RBPanel() {

        int fieldHight = 25;
        int fieldWidth = 50;

        add(new JLabel("Weights to be loaded to the RB and used for Davit's test. (kg)"));
        add(new JLabel("________________________________"));

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.yellow);

        Dimension fieleds = new Dimension(fieldWidth, fieldHight);

        add(new JLabel("Weight of the empty boat with equipment"));
        weightField = new JTextField();
        weightField.setPreferredSize(fieleds);
        add(weightField);

        add(new JLabel("No. of persons"));
        personsField = new JTextField();
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
