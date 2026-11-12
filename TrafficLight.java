import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLight extends JFrame implements ActionListener {

    JButton redButton, yellowButton, greenButton;

    Color redLight = Color.GRAY;
    Color yellowLight = Color.GRAY;
    Color greenLight = Color.GRAY;

    public TrafficLight() {

        setTitle("Traffic Light Simulator");
        setSize(400, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        redButton = new JButton("Red");
        yellowButton = new JButton("Yellow");
        greenButton = new JButton("Green");

        add(redButton);
        add(yellowButton);
        add(greenButton);

        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void paint(Graphics g) {

        super.paint(g);

        // Traffic Light Box
        g.setColor(Color.BLACK);
        g.fillRect(125, 120, 150, 300);

        // Red Light
        g.setColor(redLight);
        g.fillOval(170, 150, 60, 60);

        // Yellow Light
        g.setColor(yellowLight);
        g.fillOval(170, 240, 60, 60);

        // Green Light
        g.setColor(greenLight);
        g.fillOval(170, 330, 60, 60);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == redButton) {

            redLight = Color.RED;
            yellowLight = Color.GRAY;
            greenLight = Color.GRAY;
        }

        if (e.getSource() == yellowButton) {

            redLight = Color.GRAY;
            yellowLight = Color.YELLOW;
            greenLight = Color.GRAY;
        }

        if (e.getSource() == greenButton) {

            redLight = Color.GRAY;
            yellowLight = Color.GRAY;
            greenLight = Color.GREEN;
        }

        repaint();
    }

    public static void main(String[] args) {

        new TrafficLight();
    }
}
