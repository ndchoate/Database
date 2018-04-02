import javax.swing.*;

public class PendingDevelopmentInputForm {
    private JTextField textField1;
    private JTextField textField2;
    private JButton okButton;
    private JButton cancelButton;
    private JPanel topJPanel;

    public PendingDevelopmentInputForm() {
        // Launch the form
        JFrame frame = new JFrame("ConnectForm");
        frame.setContentPane(this.topJPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("PendingDevelopmentInputForm");
        frame.setContentPane(new PendingDevelopmentInputForm().topJPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
