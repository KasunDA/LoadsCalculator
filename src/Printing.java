import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.*;

class Printing extends JButton implements ActionListener, Printable
{
    private static final int HEIGHT = 30;
    private static final int WIDTH = 100;


    Printing()
    {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        addActionListener(this);

        add(new JLabel("Print"));
    }

    public int print(Graphics g, PageFormat pf, int page) throws PrinterException
    {
        if (page > 0)
        {
            return NO_SUCH_PAGE;
        }
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());

        PrintFrame printFrame = new PrintFrame();
        g.drawString(printFrame.toString(), 100, 100);

        return PAGE_EXISTS;
    }

    @Override
    public void actionPerformed (ActionEvent e)
    {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(this);
        boolean ok = job.printDialog();
        if (ok) {
            try {
                job.print();
            } catch (PrinterException ex) {
            }
        }
    }

}
