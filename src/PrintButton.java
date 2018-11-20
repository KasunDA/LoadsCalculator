import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class PrintButton extends JButton implements ActionListener
{
    private static final int HEIGHT = 30;
    private static final int WIDTH = 100;

    PrintButton()
    {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        addActionListener(this);

        add(new JLabel("Print"));
    }
    @Override
    public void actionPerformed (ActionEvent e)
    {
        EventQueue.invokeLater(() -> new PrintFrame());
    }
}
