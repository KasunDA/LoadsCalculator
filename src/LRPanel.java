import javax.swing.*;
import java.awt.*;

class LRPanel extends JPanel {

    private JTextField SWLStr;
    private JLabel label1;
    private JLabel label6;
    private JLabel label7;

    private static final int HEIGHT = 350;
    private static final int WIDTH = 370;

    private LogicsLR calcs = new LogicsLR();

    void recalculatePanel() {
        calcs.davitWeightCalc();
        reInitializeLabels();
    }

    private void initializeLabels() {
        label1 = new JLabel("_______________________________________");
        label6 = new JLabel("Calculated weight to be used for Davit test: ");
        label7 = new JLabel(String.valueOf(calcs.davitWeight));
    }

    private void reInitializeLabels() {
        label7.setText(String.valueOf(calcs.davitWeight));
    }

    void resetFields() {
        SWLStr.setText("");
    }

    LRPanel() {

        int fieldHight = 25;
        int fieldWidth = 50;

            add(new JLabel("Weights for Davit's test. (kg)"));
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
