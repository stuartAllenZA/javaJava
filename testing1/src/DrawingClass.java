import javax.swing.*;
import java.awt.*;

public class DrawingClass extends JFrame {
    public DrawingClass() {
        this.setSize(400,400);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPos, yPos);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JFrame Application");

        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("Label Text");
        JButton button1 = new JButton("Send");
        JTextField textField = new JTextField("Text", 15);
        JTextArea textArea = new JTextArea("massive amounts of text is\nable to go in a text area like this one");
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        int numOfLines = textArea.getLineCount();
        textArea.append(" number of lines" + numOfLines);

        JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);


        label1.setText("Change is good");
        label1.setToolTipText("Tooltip");

        panel.add(button1);
        panel.add(label1);
        panel.add(textField);
        panel.add(scrollPane);
        this.add(panel);
        this.setVisible(true);
        textField.requestFocus();
    }
}
