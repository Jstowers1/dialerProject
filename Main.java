import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Main {
    public static void main(String[] args) {
        // create the JFrame window
        JFrame myFrame = new JFrame();
        myFrame.setSize(200, 250);
        // get the main JPanel
        JPanel myPanel = (JPanel) myFrame.getContentPane();
        JPanel buttonLayout = (JPanel) myFrame.getContentPane();

        JLabel label1 = new JLabel("Enter a number to dial:");
        myFrame.add(label1);

        // no spacing between areas
        BorderLayout layout1 = new BorderLayout();

        // set layout manager to JPanel directly
        myPanel.setLayout(layout1);
        GridLayout layout = new GridLayout(4, 3, 5, 10);
        buttonLayout.setLayout(layout);

        // add JButton to JPanel directly
        buttonLayout.add(new JButton("1"));
        buttonLayout.add(new JButton("2"));
        buttonLayout.add(new JButton("3"));
        buttonLayout.add(new JButton("4"));
        buttonLayout.add(new JButton("5"));
        buttonLayout.add(new JButton("6"));
        buttonLayout.add(new JButton("7"));
        buttonLayout.add(new JButton("8"));
        buttonLayout.add(new JButton("9"));
        buttonLayout.add(new JButton("-"));
        buttonLayout.add(new JButton("0"));

        // myPanel.add(buttonLayout, BorderLayout.CENTER);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        // help
    }
}
