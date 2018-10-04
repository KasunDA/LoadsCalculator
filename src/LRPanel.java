import javax.swing.*;
import java.awt.*;

public class LRPanel extends JPanel {

    JTextField SWLStr;
    JLabel label1;
    JLabel label6;
    JLabel label7;

    public static final int HEIGHT = 350;
    public static final int WIDTH = 370;
    private int fieldHight = 25;
    private int fieldWidth = 50;

    LogicsLR calcs = new LogicsLR();

    public void recalculatePanel() {
        calcs.davitWeightCalc();
        reInitializeLabels();
    }

    private void initializeLabels() {
        label1 = new JLabel("________________________________");
        label6 = new JLabel("Calculated weight to be used for Davit test: ");
        label7 = new JLabel(String.valueOf(calcs.davitWeight));
    }

    private void reInitializeLabels() {
        label7.setText(String.valueOf(calcs.davitWeight));
    }

    void resetFields() {
        SWLStr.setText("");
    }

    public LRPanel() {

            add(new JLabel("Weights to for Davit's test. (kg)"));
            add(new JLabel("_______________________________________"));

            setLayout(new FlowLayout(FlowLayout.CENTER));
            setPreferredSize(new Dimension(WIDTH, HEIGHT));
            setBackground(Color.white);

            Dimension fieleds = new Dimension(fieldWidth, fieldHight);

            add(new JLabel("SWL of the Davit: "));
            SWLStr = new JTextField();
            SWLStr.setPreferredSize(fieleds);
            add(SWLStr);

            add(new JLabel("_______________________________________"));

            initializeLabels();

            add(label1);
            add(label6);
            add(label7);

        }
    }
