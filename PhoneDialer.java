import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PhoneDialer implements ActionListener {

    // Create string to hold dialed phone number
    private String phoneNumber = new String("");

    // Create 11 buttons to display 0-9 and a dash
    private JButton but1 = new JButton("1");
    private JButton but2 = new JButton("2");
    private JButton but3 = new JButton("3");
    private JButton but4 = new JButton("4");
    private JButton but5 = new JButton("5");
    private JButton but6 = new JButton("6");
    private JButton but7 = new JButton("7");
    private JButton but8 = new JButton("8");
    private JButton but9 = new JButton("9");
    private JButton butD = new JButton("-");
    private JButton but0 = new JButton("0");

    // Create the dial button
    private JButton dialBut = new JButton("Dial Number");

    // Create the main frame
    private JFrame Dialer = new JFrame();

    // Produce the panel that holds everything + its corresponding border
    private JPanel topPan = (JPanel) Dialer.getContentPane();
    private Border topPanBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);

    // Create panel that holds text asking the user to input a number
    private JPanel textPan = new JPanel();

    // Create the panel that holds the number buttons + its corresponding border
    private JPanel numPan = new JPanel();
    private Border numBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);

    public PhoneDialer() {
        // Set the size of the main frame too 200x250
        Dialer.setSize(200, 250);

        // Set the layout of the top panel to the box layout + set border
        topPan.setLayout(new BoxLayout(topPan, BoxLayout.Y_AXIS));
        topPan.setBorder(topPanBorder);

        // Set the layout of the text panel and add the label
        textPan.setLayout(new FlowLayout(0, 0, 0));
        textPan.add(new JLabel("Enter the number to dial:"));

        // Set the layout of the phone number dialer
        numPan.setLayout(new GridLayout(4, 3, 5, 5));
        numPan.setBorder(numBorder);

        // Add action listeners to all 11 phone buttons
        but1.addActionListener(this);
        but2.addActionListener(this);
        but3.addActionListener(this);
        but4.addActionListener(this);
        but5.addActionListener(this);
        but6.addActionListener(this);
        but7.addActionListener(this);
        but8.addActionListener(this);
        but9.addActionListener(this);
        butD.addActionListener(this);
        but0.addActionListener(this);

        // Add all 11 buttons to the phone dialer panel
        numPan.add(but1);
        numPan.add(but2);
        numPan.add(but3);
        numPan.add(but4);
        numPan.add(but5);
        numPan.add(but6);
        numPan.add(but7);
        numPan.add(but8);
        numPan.add(but9);
        numPan.add(butD);
        numPan.add(but0);

        // Add the panels to the top panel
        topPan.add(textPan);
        topPan.add(numPan);

        // Create listener and add buttons to the top panel
        dialBut.addActionListener(this);
        dialBut.setAlignmentX(Component.CENTER_ALIGNMENT);
        topPan.add(dialBut);

        // Make dialer visible
        Dialer.setVisible(true);
        Dialer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Create logic when a button is pressed
    public void actionPerformed(ActionEvent event) {
        Object control = event.getSource();

        // Append a number to the phone number string
        if (control == but1)
            phoneNumber += "1";
        else if (control == but2)
            phoneNumber += "2";
        else if (control == but3)
            phoneNumber += "3";
        else if (control == but4)
            phoneNumber += "4";
        else if (control == but5)
            phoneNumber += "5";
        else if (control == but6)
            phoneNumber += "6";
        else if (control == but7)
            phoneNumber += "7";
        else if (control == but8)
            phoneNumber += "8";
        else if (control == but9)
            phoneNumber += "9";
        else if (control == but0)
            phoneNumber += "0";
        else if (control == butD)
            phoneNumber += "-";

        // Display phone number string when pressing the dail button
        else if (control == dialBut)
            JOptionPane.showMessageDialog(null, "Dialing: " + phoneNumber);
    }
}

