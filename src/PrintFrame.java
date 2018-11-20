import javax.swing.*;
import java.awt.*;

class PrintFrame extends JFrame
{
    private LogicsLB logicsLB = new LogicsLB();

    PrintFrame()
    {

        JButton Printing;
        JLabel Label1;
        JLabel Label2;
        JLabel Label3;
        JLabel Label4;
        JLabel Label5;
        JLabel Label6;
        JLabel Label7;

        setTitle("Printing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(150, 50);
        setSize(1100, 1500);
        setLayout(new GridLayout(8, 1, 40, 40));
        setResizable(false);

        Label1 = new JLabel("LIFEBOAT:");
        add(Label1);
        Label2 = new JLabel("Weight of empty Lifeboat with equipment = " + logicsLB.LBweight);
        add(Label2);
        Label3 = new JLabel("No. of People = " + logicsLB.PeopleNo + ", " + LBPanel.getPersonWeight() + " kg each.");
        add(Label3);
        Label4 = new JLabel("Weight of the boat fully manned = " + (logicsLB.weightOfLB + logicsLB.noOfPeople) + ", + 10% = " + logicsLB.totalWeight);
        add(Label4);
        Label5 = new JLabel("Weights to be loaded to the Lifeboat: " + logicsLB.weightInLB);
        add(Label5);
        Label6 = new JLabel("DAVIT:");
        add(Label6);
        Label7 = new JLabel("Test load of davit: " + logicsLB.totalWeight);
        add(Label7);


        Printing = new Printing();
        add(Printing);

    }
}
