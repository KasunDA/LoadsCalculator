
import javax.swing.*;
import java.awt.*;

class LabelPanel extends JPanel {

    private static final int HEIGHT = 50;
    private static final int WIDTH = 890;

    LabelPanel() {

        JLabel General = new JLabel();

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        General.setText("This program calculates loads necessary for load tests of Lifeboats and Davits.");
        General.setFont(Font.getFont(Font.SANS_SERIF));
        General.setSize(10, 12);
        add(General);

    }
}
