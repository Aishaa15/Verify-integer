import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class verifyInteger  extends JFrame
{
    // declare GUI components
    private JTextField textField;
    private JButton verifyButton, cancelButton;
    private JLabel resultLabel;

    // constructor for IntegerVerifier class
    public verifyInteger()
    {
        // set layout
        setLayout(new FlowLayout());

        // initialize GUI components
        textField = new JTextField(10);
        verifyButton = new JButton("Verify");
        cancelButton = new JButton("Cancel");
        resultLabel = new JLabel("");

        // add GUI components to window
        add(new JLabel("Enter an Integer: "));
        add(textField);
        add(verifyButton);
        add(cancelButton);
        add(resultLabel);

        // add action listener to verify button
        verifyButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) {
                try {
                    // try to parse input as integer
                    int num = Integer.parseInt(textField.getText());

                    // display success message
                    resultLabel.setText(num + " is an integer!");
                } catch (NumberFormatException ex) {
                    // display error message
                    resultLabel.setText(textField.getText() + " is not an integer.");
                }
            }
        });

        // add action listener to cancel button
        cancelButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) {
                // close the window
                dispose();
            }
        });

        // set window size and make it visible
        setSize(300, 300);
        setVisible(true);


    }
    
}
