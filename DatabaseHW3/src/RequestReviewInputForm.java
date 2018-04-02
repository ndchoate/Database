import javax.swing.*;

public class RequestReviewInputForm {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton okButton;
    private JButton cancelButton;
    private JPanel topJPanel;

    public RequestReviewInputForm() {
        // Launch the form
        JFrame frame = new JFrame("ConnectForm");
        frame.setContentPane(this.topJPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("RequestReviewInputForm");
        frame.setContentPane(new RequestReviewInputForm().topJPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
