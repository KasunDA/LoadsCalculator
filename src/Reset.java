import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Reset extends JButton implements ActionListener {

    public static final int HEIGHT = 30;
    public static final int WIDTH = 100;
    private boolean pushed = false;

    public Reset(){

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        addActionListener(this);

        add(new JLabel("Reset"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        LBPanel calc = new LBPanel();
        RBPanel calcRB = new RBPanel();
        LRPanel calcLR = new LRPanel();
        if(pushed)
          calc.LBweight = "" ;
          calc.PeopleNo = "";

          calcRB.RBweight = "";
          calcRB.PeopleNo = "";

          calcLR.SWLStr = "";

        pushed =!pushed;
    }

}
