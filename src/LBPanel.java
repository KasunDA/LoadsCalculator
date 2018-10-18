import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

class LBPanel extends JPanel implements ActionListener {

    private JTextField weightField;
    private JTextField personsField;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    JRadioButton firstButton;
    JRadioButton secondButton;
    private ButtonGroup group;

    private static final int HEIGHT = 350;
    private static final int WIDTH = 370;

    private LogicsLB calcs = new LogicsLB();

    void recalculatePanel() {
        calcs.LBweight = weightField.getText();
        calcs.PeopleNo = personsField.getText();
        calcs.weightInLbCalc();
        calcs.totalWeightCalc();
        calcs.davitWeightCalc();
        reInitializeLabels();
    }
    
    private void initializeLabels() {

        label1 = new JLabel("________________________________");
        label2 = new JLabel("Calculated weight to be loaded to LB: ");
        label3 = new JLabel(String.valueOf(calcs.weightInLB));
        label4 = new JLabel("Calculated total load: ");
        label5 = new JLabel(String.valueOf(calcs.totalWeight));
        label6 = new JLabel("Calculated weight to be used for Davit test: ");
        label7 = new JLabel(String.valueOf(calcs.davitWeight));
    }

    private void reInitializeLabels() {
        label3.setText(String.valueOf(calcs.weightInLB));
        label5.setText(String.valueOf(calcs.totalWeight));
        label7.setText(String.valueOf(calcs.davitWeight));
    }

    void resetFields() {
        weightField.setText("");
        personsField.setText("");
    }

    LBPanel() {

        int fieldHight = 25;
        int fieldWidth = 50;

        add(new JLabel("Weights to be loaded to the LB and used for Davit's test (kg)"));
        add(new JLabel("_______________________________________"));

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

        firstButton = new JRadioButton("75 kg");
        firstButton.setMnemonic(KeyEvent.VK_B);
        firstButton.setActionCommand("75 kg");
        firstButton.setSelected(true);

        secondButton = new JRadioButton("82,5 kg");
        secondButton.setActionCommand("82,5 kg");
        secondButton.setMnemonic(KeyEvent.VK_C);

        add(new JLabel("                                         "));
        add(new JLabel("Weight of a person"));

        group = new ButtonGroup();
        group.add(firstButton);
        group.add(secondButton);

        firstButton.addActionListener(this);
        secondButton.addActionListener(this);

        JPanel radioPanel = new JPanel(new GridLayout(1, 2));
        add(radioPanel);
        radioPanel.add(firstButton);
        radioPanel.add(secondButton);


        add(new JLabel("_____________________________________"));


        initializeLabels();

        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(label6);
        add(label7);

    }

    private static double personWeight;

    void setPersonWeight(double personWeight) {
        this.personWeight = personWeight;
    }
    public void actionPerformed(ActionEvent e) {
        if (firstButton.isSelected()){
            setPersonWeight(75.0);
        }
        else {
            setPersonWeight(82.5);
        }
    }

    public static double getPersonWeight() {
        return personWeight;
    }
}
