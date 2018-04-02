import javax.swing.*;

public class AddLevelOfEffortInputForm {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton button1;
    private JButton button2;
    private JPanel topJPanel;

    public AddLevelOfEffortInputForm() {
        // Launch the form
        JFrame frame = new JFrame("ConnectForm");
        frame.setContentPane(this.topJPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("AddLevelOfEffortInputForm");
        frame.setContentPane(new AddLevelOfEffortInputForm().topJPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
