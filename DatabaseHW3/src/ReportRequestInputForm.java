import javax.swing.*;

public class ReportRequestInputForm {
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JButton button2;
    private JPanel topJPanel;

    public ReportRequestInputForm() {
        // Launch the form
        JFrame frame = new JFrame("ConnectForm");
        frame.setContentPane(this.topJPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }




    public static void main(String[] args) {
        JFrame frame = new JFrame("ReportRequestInputForm");
        frame.setContentPane(new ReportRequestInputForm().topJPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
