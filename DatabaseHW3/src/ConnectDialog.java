import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class ConnectDialog extends JDialog{
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField hostTextField;
    private JTextField usernameTextField;
    private JTextField passwordTextField;
    private JButton connectButton;
    private JButton insertStatementButton;

    public ConnectDialog() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        connectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DBConnect connection = new DBConnect("LAPTOP-I76IODMJ", "omfgWork", "password");
                connection.Connect();
                // Test insert with inserting into developer_review table
//                try {
//                    Statement insertStmt = connection.m_connection.createStatement();
//                    insertStmt.executeUpdate("INSERT INTO [Reporting_developer].[work].[developer_review] " +
//                            "(item_id, reviewer, estimate, comment, added)" + " VALUES " +
//                            "(67, 'herpderp', 4500, 'poop', '20180401 10:34:09 AM');");
//                    System.out.println("Insert Success!!");
//                }
//                catch (SQLException err) {
//                    System.out.println(err.getMessage());
//                }
            }
        });
        insertStatementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void onOK() {
        //ConnectForm connectionForm = new ConnectForm();
        //connectionForm.setVisble(true);
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        ConnectDialog dialog = new ConnectDialog();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
