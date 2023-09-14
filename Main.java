import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Main {
    public static void main(String[] args) {
        // create the JFrame window
        JFrame frame = new JFrame();
        frame.setSize(200, 250);

        // get the main JPanel
        GridLayout gridLay = new GridLayout(4, 8, 10, 10);
        JPanel grid = new JPanel(gridLay);

        grid.add(new JButton("1"));
        grid.add(new JButton("1"));
        grid.add(new JButton("1"));
        grid.add(new JButton("1"));
        grid.add(new JButton("1"));
        grid.add(new JButton("1"));
        grid.add(new JButton("1"));

        frame.add(grid);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
