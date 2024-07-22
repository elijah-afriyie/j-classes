import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * MyFrame
 */
public class MyFrame extends JFrame implements ActionListener {

  JFrame frame = new JFrame();
  JButton button = new JButton("Click Me!");
  JTextField textField = new JTextField();

  MyFrame() {
    textField.setPreferredSize(new Dimension(250, 40));
    textField.setFont(new Font("Consolas", Font.PLAIN, 16));
    textField.setForeground(Color.green);
    textField.setBackground(Color.black);
    textField.setCaretColor(Color.yellow);
    textField.setText("Username");

    button.setBounds(0, 0, 100, 50);
    button.addActionListener(this);

    frame.add(button);
    frame.add(textField);

    frame.setTitle("My Awesome Title");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());
    frame.pack();
    frame.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) {
      System.out.println("Welcome, " + textField.getText());
      textField.setEditable(false);
      button.setEnabled(false);
    }
  }
}
