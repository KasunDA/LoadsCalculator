import javax.swing.*;
import java.awt.*;

class PrintFrame extends JFrame
{
    PrintFrame()
    {
        setTitle("Printing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(150, 0);
        setSize(1000, 1000);
        setLayout(new GridBagLayout());
        setResizable(true);
        GridBagConstraints border = new GridBagConstraints();
        border.insets = new Insets(5, 5, 5, 5);
        //pack();


        LogicsLB logicsLB = new LogicsLB();
        JLabel Label1;
        JLabel Label2;
        JLabel Label3;
        JLabel Label4;
        JLabel Label5;
        JLabel Label6;
        JLabel Label7;

        Label1 = new JLabel("LIFEBOAT:");
        Label1.setBorder(javax.swing.BorderFactory.createLineBorder(Color.ORANGE, 1));
        border.gridx = 0;
        border.gridy = 0;
        add(Label1, border);

        border.gridy = 1;
        Label2 = new JLabel("Weight of empty Lifeboat with equipment = " + logicsLB.LBweight + " kg.");
        Label2.setBorder(javax.swing.BorderFactory.createLineBorder(Color.ORANGE, 1));
        add(Label2, border);

        border.gridy = 2;
        Label3 = new JLabel("No. of People = " + logicsLB.PeopleNo + ", " + LBPanel.getPersonWeight() + " kg each.");
        add(Label3);

        border.gridy = 3;
        Label4 = new JLabel("Weight of the boat fully manned = " + (logicsLB.weightOfLB + logicsLB.noOfPeople) + ", + 10% = " + logicsLB.totalWeight + " kg.");
        add(Label4);

        border.gridy = 4;
        Label5 = new JLabel("Weights to be loaded to the Lifeboat = " + logicsLB.weightInLB + " kg.");
        add(Label5);

        border.gridy = 5;
        Label6 = new JLabel("DAVIT:");
        add(Label6);

        border.gridy = 6;
        Label7 = new JLabel("Test load of davit = " + logicsLB.totalWeight + " kg.");
        add(Label7);

        LogicsRB logicsRB = new LogicsRB();
        JLabel Label8;
        JLabel Label9;
        JLabel Label10;
        JLabel Label11;
        JLabel Label12;
        JLabel Label13;
        JLabel Label14;

        border.gridx = 1;
        border.gridy = 0;
        Label8 = new JLabel("RESCUE BOAT:");
        add(Label8);

        border.gridy = 1;
        Label9 = new JLabel("Weight of empty Rescue Boat with equipment = " + logicsRB.RBweight + " kg.");
        add(Label9);

        border.gridy = 2;
        Label10 = new JLabel("No. of People = " + logicsRB.PeopleNo + ", " + RBPanel.getPersonWeight() + " kg each.");
        add(Label10);

        border.gridy = 3;
        Label11 = new JLabel("Weight of the boat fully manned = " + (logicsRB.weightOfRB + logicsRB.noOfPeople) + ", + 10% = " + logicsRB.totalWeight + " kg.");
        add(Label11);

        border.gridy = 4;
        Label12 = new JLabel("Weights to be loaded to the Lifeboat = " + logicsRB.weightInRB + " kg.");
        add(Label12);

        border.gridy = 5;
        Label13 = new JLabel("DAVIT:");
        add(Label13);

        border.gridy = 6;
        Label14 = new JLabel("Test load of davit = " + logicsLB.totalWeight + " kg.");
        add(Label14);

        LogicsLR logicsLR = new LogicsLR();
        JLabel Label15;
        JLabel Label16;
        JLabel Label17;
        JLabel Label18;
        JLabel Label19;
        JLabel Label20;
        JLabel Label21;

        border.gridx = 2;
        border.gridy = 0;
        Label15 = new JLabel("LIFERAFT DAVIT:");
        add(Label15);

        border.gridy = 1;
        Label16 = new JLabel("Davit's SWL = " + logicsLR.SWL + " kg.");
        add(Label16);

        border.gridy = 2;
        Label17 = new JLabel("Test load = " + logicsLR.davitWeight);
        add(Label17);

        border.gridy = 3;
        Label18 = new JLabel("");
        add(Label18);

        border.gridy = 4;
        Label19 = new JLabel("");
        add(Label19);

        border.gridy = 5;
        Label20 = new JLabel("");
        add(Label20);

        border.gridy = 6;
        Label21 = new JLabel("");
        add(Label21);

        final int HEIGHT = 30;
        final int WIDTH = 100;
        JButton Printing;
        Printing = new Printing();
        Printing.setSize(new Dimension(WIDTH, HEIGHT));
        add(Printing);

    }
}
