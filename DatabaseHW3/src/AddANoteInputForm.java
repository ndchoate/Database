import javax.swing.*;

public class AddANoteInputForm {
    private JTextField textField1;
    private JTextField textField2;
    private JButton okButton;
    private JButton cancelButton;
    private JPanel topJPanel;

    public AddANoteInputForm() {
        // Launch the form
        JFrame frame = new JFrame("ConnectForm");
        frame.setContentPane(this.topJPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("AddANoteInputForm");
        frame.setContentPane(new AddANoteInputForm().topJPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
