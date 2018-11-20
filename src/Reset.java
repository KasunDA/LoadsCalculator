import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Reset extends JButton implements ActionListener
{
    private static final int HEIGHT = 30;
    private static final int WIDTH = 100;

    private LBPanel lbPanel;
    private RBPanel rbPanel;
    private LRPanel lrPanel;

    Reset(JPanel lbPanel, JPanel rbPanel, JPanel lrPanel)
    {

        this.lbPanel = (LBPanel) lbPanel;
        this.rbPanel = (RBPanel) rbPanel;
        this.lrPanel = (LRPanel) lrPanel;

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        addActionListener(this);

        add(new JLabel("Reset"));
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        lbPanel.resetFields();
        rbPanel.resetFields();
        lrPanel.resetFields();
    }

}
