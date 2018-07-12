
import javax.swing.*;
import java.awt.*;

public class LabelPanel extends JPanel {

    public static final int HEIGHT = 50;
    public static final int WIDTH = 850;
    private JLabel General = new JLabel();

    public LabelPanel() {

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        General.setText("This program calculates loads necessary for load tests of Lifeboats and Davits.");
        General.setFont(Font.getFont(Font.SANS_SERIF));
        add(General);

    }
}
