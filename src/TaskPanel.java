import javax.swing.*;
import java.awt.*;

public class TaskPanel extends JPanel
{
    Task data;
    JCheckBox selected;
    JLabel labelFromNow;
    JLabel labelDays;
    JLabel labelTime;

    TaskPanel()
    {
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.FIRST_LINE_START;

        selected = new JCheckBox();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridheight = 3;
        add(selected, constraints);



        labelFromNow = new JLabel();
        labelFromNow.setText("6h - DV1549 - J1506");
        constraints.gridy = 0;
        constraints.gridx = 1;
        constraints.gridheight = 1;
        add(labelFromNow, constraints);


        labelTime = new JLabel();
        labelTime.setText("10:00 - 13:00");
        constraints.gridy = 1;
        add(labelTime, constraints);


        labelDays = new JLabel();
        labelDays.setText("Mondays, Fridays");
        constraints.gridy = 2;
        add(labelDays, constraints);

//        add(new JLabel("6h - DV1575 - G202"));

    }

}
