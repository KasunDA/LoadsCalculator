import javax.swing.*;
import java.awt.*;

public class LBPanel extends JPanel {

    public static final int HEIGHT = 350;
    public static final int WIDTH = 370;
    private int fieldHight = 25;
    private int fieldWidth = 50;


    String LBweight;
    Double weightOfLB;
    String PeopleNo;
    Double noOfPeople;
    double weightInLB;
    double totalWeight;
    double davitWeight;


    public double weightInLbCalc(){
        if (LBweight!=null && PeopleNo!=null) {
            weightOfLB = Double.valueOf(LBweight);
            noOfPeople = Double.valueOf(PeopleNo);
            weightInLB = (weightOfLB * 1.1) + (noOfPeople * 75 * 1.1);
        }
        return weightInLB;
    }

    public double totalWeightCalc(){
        weightOfLB = Double.valueOf(LBweight);
        totalWeight = weightOfLB + weightInLB;
        return totalWeight;
    }

    public double davitWeightCalc(){
        davitWeight = totalWeight;
        return davitWeight;
    }


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
        add(weightField);
        LBweight = weightField.getText();

        add(new JLabel("No. of persons"));
        JTextField personsField = new JTextField();
        personsField.setPreferredSize(fieleds);
        add(personsField);
        PeopleNo = personsField.getText();

        add(new Label("______________________________"));

        add(new JLabel("Calculated weight to be loaded to LB: "));
        add(new JLabel(String.valueOf(weightInLB)));
        add(new JLabel("Calculated total load: "));
        add(new JLabel(String.valueOf(totalWeight)));
        add(new JLabel("Calculated weight to be used for Davit test: "));
        add(new JLabel(String.valueOf(davitWeight)));

    }

}
