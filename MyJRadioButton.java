import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyJRadioButton extends JFrame implements ActionListener {
    private JRadioButton my_button1 = new JRadioButton("Blue");
    private JRadioButton my_button2 = new JRadioButton("Green");
    private JRadioButton my_button3 = new JRadioButton("Red");
    private JRadioButton my_button4 = new JRadioButton("Yellow");
    private JLabel selection = new JLabel();

    public MyJRadioButton() {
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());

        JLabel title = new JLabel("Select your MOST favourite color:", SwingConstants.CENTER);
        pane.add(title, BorderLayout.NORTH);

        JPanel radioPanel = new JPanel(new FlowLayout());
        radioPanel.add(my_button1);
        radioPanel.add(my_button2);
        radioPanel.add(my_button3);
        radioPanel.add(my_button4);
        pane.add(radioPanel, BorderLayout.CENTER);

        ButtonGroup btn_group = new ButtonGroup();
        btn_group.add(my_button1);
        btn_group.add(my_button2);
        btn_group.add(my_button3);
        btn_group.add(my_button4);

        my_button1.addActionListener(this);
        my_button2.addActionListener(this);
        my_button3.addActionListener(this);
        my_button4.addActionListener(this);

        JPanel bottomPanel = new JPanel(new FlowLayout());
        bottomPanel.add(new JLabel("You have selected:"));
        bottomPanel.add(selection);
        pane.add(bottomPanel, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = "";

        if (my_button1.isSelected())
            input = my_button1.getText();
        else if (my_button2.isSelected())
            input = my_button2.getText();
        else if (my_button3.isSelected())
            input = my_button3.getText();
        else if (my_button4.isSelected())
            input = my_button4.getText();

        selection.setText(input);
    }

    public static void main(String[] args) {
        MyJRadioButton frame = new MyJRadioButton();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My Frame");
        frame.setSize(350, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
