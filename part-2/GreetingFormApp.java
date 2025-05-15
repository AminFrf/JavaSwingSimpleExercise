import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GreetingFormApp extends JFrame implements ActionListener {
    private JTextField nameField;   // Field for user input
    private JButton greetButton;    // Button to trigger greeting
    private JLabel messageLabel;    // Label to display greeting

    public GreetingFormApp() {
        setTitle("Greeting Form");
        nameField = new JTextField(15);
        greetButton = new JButton("Greet");
        messageLabel = new JLabel("Enter your name and press Greet.", SwingConstants.CENTER);

        greetButton.addActionListener(this);

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Name:"));
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        inputPanel.add(nameField);
        inputPanel.add(greetButton);

        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(messageLabel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText().trim();
        if (name.isEmpty()) {
            messageLabel.setText("Please enter a name.");
        } else {
            messageLabel.setText("Hello, " + name + "!");
        }
    }


}
