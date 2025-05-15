//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClickCounterApp extends JFrame implements ActionListener {
    private JLabel counterLabel;
    private JButton clickButton;
    private int count = 0;

    public ClickCounterApp() {
        this.setTitle("Click Counter");
        this.counterLabel = new JLabel("Clicks: 0", 0);
        this.clickButton = new JButton("Click Me");
        this.clickButton.addActionListener(this);
        this.setLayout(new BorderLayout());
        this.add(this.counterLabel, "Center");
        this.add(this.clickButton, "South");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo((Component)null);
    }

    public void actionPerformed(ActionEvent e) {
        ++this.count;
        this.counterLabel.setText("Clicks: " + this.count);
    }
}
