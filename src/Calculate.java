import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculate extends JButton implements ActionListener {

    public static final int HEIGHT = 30;
    public static final int WIDTH = 100;
    private boolean pushed = false;

    public Calculate() {

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        addActionListener(this);

        add(new JLabel("Calculate"));
    }

        @Override
        public void actionPerformed(ActionEvent e) {
            LBPanel calc = new LBPanel();
            RBPanel calcRB = new RBPanel();
            LRPanel calcLR = new LRPanel();
            if(pushed)
                calc.weightInLbCalc();
                calc.totalWeightCalc();
                calc.davitWeightCalc();

                calcRB.weightInRbCalc();
                calcRB.totalWeightCalc();
                calcRB.davitWeightCalc();

                calcLR.davitWeightCalc();
            pushed =!pushed;
        }

}
