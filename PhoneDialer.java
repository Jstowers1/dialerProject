import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PhoneDialer{
    public PhoneDialer() {
        JFrame Dialer = new JFrame();
        Dialer.setSize(200,250);

        JPanel topPan = (JPanel) Dialer.getContentPane();
        topPan.setLayout(new BoxLayout(topPan, BoxLayout.Y_AXIS));
        Border topPanBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        topPan.setBorder(topPanBorder);

        JPanel textPan = new JPanel();
        textPan.setLayout(new FlowLayout(0, 0, 0));
        textPan.add(new JLabel("Enter the number to dial:"));

        JPanel numPan = new JPanel();
        numPan.setLayout(new GridLayout(4, 3, 5, 5));
        Border numBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        numPan.setBorder(numBorder);
        JButton but1 = new JButton("1");
        JButton but2 = new JButton("2");
        JButton but3 = new JButton("3");
        JButton but4 = new JButton("4");
        JButton but5 = new JButton("5");
        JButton but6 = new JButton("6");
        JButton but7 = new JButton("7");
        JButton but8 = new JButton("8");
        JButton but9 = new JButton("9");
        JButton butD = new JButton("-");
        JButton but0 = new JButton("0");
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

        topPan.add(textPan);
        topPan.add(numPan);

        JButton dialBut = new JButton("Dial Number");
        dialBut.setAlignmentX(Component.CENTER_ALIGNMENT);
        topPan.add(dialBut);
        
        Dialer.setVisible(true);
        Dialer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

