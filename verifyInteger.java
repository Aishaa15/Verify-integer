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

    }




    
}
