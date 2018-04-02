import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConnectForm {
    private JTextField hostTextField;
    private JTextField usernameTextField;
    private JTextField passwordTextField;
    private JButton connectButton;
    private JPanel field1;

    public ConnectForm() {
        connectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String host = hostTextField.getText();
                String username = usernameTextField.getText();
                String password = passwordTextField.getText();

                DBConnect dbConnection = new DBConnect(host, username, password);
                dbConnection.Connect();

                dbConnection.ExecuteStoredProcedure("add_request_review", "3,0,'please review'");
            }
        });

        // Launch the form
        JFrame frame = new JFrame("ConnectForm");
        frame.setContentPane(this.field1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ConnectForm");
        frame.setContentPane(new ConnectForm().field1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
