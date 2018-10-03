
import javax.swing.*;
import java.awt.*;

public class LBPanel extends JPanel {

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
    String LBweight;
    String PeopleNo;
    private Double weightOfLB;
    private Double noOfPeople;
    private double weightInLB = 0.0;
    private double totalWeight = 0.0;
    private double davitWeight = 0.0;

    public double weightInLbCalc() {
        if (LBweight != null && PeopleNo != null) {
            weightOfLB = Double.parseDouble(LBweight.replaceAll("[^0-9.]", ""));
            noOfPeople = Double.parseDouble(PeopleNo.replaceAll("[^0-9.]", ""));
            weightInLB = (weightOfLB * 1.1) + (noOfPeople * 75 * 1.1);
        }
        return weightInLB;
    }

    public double totalWeightCalc() {
        if (LBweight != null) {
            weightOfLB = Double.parseDouble(LBweight.replaceAll("[^0-9.]", ""));
            totalWeight = weightOfLB + weightInLB;
        }
        return totalWeight;
    }

    public double davitWeightCalc() {
        davitWeight = totalWeight;
        return davitWeight;
    }

    public void recalculatePanel() {
        LBweight = weightField.getText();
        PeopleNo = personsField.getText();
        weightInLbCalc();
        totalWeightCalc();
        davitWeightCalc();
        reInitializeLabels();
    }

    private void reInitializeLabels() {
        label1 = new JLabel("________________________________");
        label2 = new JLabel("Calculated weight to be loaded to LB: ");
        label3 = new JLabel(String.valueOf(weightInLB));
        label4 = new JLabel("Calculated total load: ");
        label5 = new JLabel(String.valueOf(totalWeight));
        label6 = new JLabel("Calculated weight to be used for Davit test: ");
        label7 = new JLabel(String.valueOf(davitWeight));
    }

    public LBPanel() {

        add(new JLabel("Weights to be loaded to the LB and used for Davits test (kg)"));
        add(new JLabel("________________________________"));

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.orange);

        Dimension fieleds = new Dimension(fieldWidth, fieldHight);

        add(new JLabel("Weight of the empty boat with equipment"));
        weightField = new JTextField();
        weightField.setPreferredSize(fieleds);
        add(weightField);

        add(new JLabel("No. of persons"));
        personsField = new JTextField();
        personsField.setPreferredSize(fieleds);
        add(personsField);

        reInitializeLabels();

        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(label6);
        add(label7);

    }

}
