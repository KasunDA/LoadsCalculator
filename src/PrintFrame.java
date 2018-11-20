import javax.swing.*;
import java.awt.*;

class PrintFrame extends JFrame
{

    PrintFrame()
    {

        LogicsLB logicsLB = new LogicsLB();
        LogicsRB logicsRB = new LogicsRB();
        LogicsLR logicsLR = new LogicsLR();

        final int HEIGHT = 30;
        final int WIDTH = 100;

        JButton Printing;
        JLabel Label1;
        JLabel Label2;
        JLabel Label3;
        JLabel Label4;
        JLabel Label5;
        JLabel Label6;
        JLabel Label7;

        JLabel Label8;
        JLabel Label9;
        JLabel Label10;
        JLabel Label11;
        JLabel Label12;
        JLabel Label13;
        JLabel Label14;

        JLabel Label15;
        JLabel Label16;
        JLabel Label17;
        JLabel Label18;
        JLabel Label19;
        JLabel Label20;
        JLabel Label21;

        setTitle("Printing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(150, 0);
        //setSize(1700, 500);
        setLayout(new GridBagLayout());

        setBackground(Color.WHITE);
        setResizable(true);

        Label1 = new JLabel("LIFEBOAT:");
        add(Label1);
        Label2 = new JLabel("Weight of empty Lifeboat with equipment = " + logicsLB.LBweight + " kg.");
        add(Label2);
        Label3 = new JLabel("No. of People = " + logicsLB.PeopleNo + ", " + LBPanel.getPersonWeight() + " kg each.");
        add(Label3);
        Label4 = new JLabel("Weight of the boat fully manned = " + (logicsLB.weightOfLB + logicsLB.noOfPeople) + ", + 10% = " + logicsLB.totalWeight + " kg.");
        add(Label4);
        Label5 = new JLabel("Weights to be loaded to the Lifeboat = " + logicsLB.weightInLB + " kg.");
        add(Label5);
        Label6 = new JLabel("DAVIT:");
        add(Label6);
        Label7 = new JLabel("Test load of davit = " + logicsLB.totalWeight + " kg.");
        add(Label7);

        Label8 = new JLabel("RESCUE BOAT:");
        add(Label8);
        Label9 = new JLabel("Weight of empty Rescue Boat with equipment = " + logicsRB.RBweight + " kg.");
        add(Label9);
        Label10 = new JLabel("No. of People = " + logicsRB.PeopleNo + ", " + RBPanel.getPersonWeight() + " kg each.");
        add(Label10);
        Label11 = new JLabel("Weight of the boat fully manned = " + (logicsRB.weightOfRB + logicsRB.noOfPeople) + ", + 10% = " + logicsRB.totalWeight + " kg.");
        add(Label11);
        Label12 = new JLabel("Weights to be loaded to the Lifeboat = " + logicsRB.weightInRB + " kg.");
        add(Label12);
        Label13 = new JLabel("DAVIT:");
        add(Label13);
        Label14 = new JLabel("Test load of davit = " + logicsLB.totalWeight + " kg.");
        add(Label14);

        Label15 = new JLabel("LIFERAFT DAVIT:");
        add(Label15);
        Label16 = new JLabel("Davit's SWL = " + logicsLR.SWL + " kg.");
        add(Label16);
        Label17 = new JLabel("Test load = " + logicsLR.davitWeight);
        add(Label17);
        Label18 = new JLabel("");
        add(Label18);
        Label19 = new JLabel("");
        add(Label19);
        Label20 = new JLabel("");
        add(Label20);
        Label21 = new JLabel("");
        add(Label21);

        Printing = new Printing();
        Printing.setSize(new Dimension(WIDTH, HEIGHT));
        add(Printing);

    }
}
