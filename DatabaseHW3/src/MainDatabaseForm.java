import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainDatabaseForm {
    private JButton connectToDatabaseButton;
    private JButton addADeveloperInputButton;
    private JButton addLevelOfEffortButton;
    private JButton configurationFormButton;
    private JButton addANoteInputButton;
    private JButton requestReviewInputFormButton;
    private JButton updateStatusInputFormButton;
    private JButton businessReviewInputFormButton;
    private JButton reportRequestInputFormButton;
    private JButton pendingReviewInputFormButton;
    private JButton assignedInputFormButton;
    private JButton peerReviewInputFormButton;
    private JButton developmentInputFormButton;
    private JButton pendingDevelopmentInputFormButton;
    private JPanel TopLevelJPanel;

    public MainDatabaseForm() {
        connectToDatabaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open connect to Database form
                new ConnectForm();
            }
        });
        reportRequestInputFormButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open Report Request Input Form
                new ReportRequestInputForm();
            }
        });
        pendingReviewInputFormButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Pending Review input form
                new PendingDevelopmentInputForm();
            }
        });
        assignedInputFormButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open Assigned Input Form
                new AssignedInputForm();
            }
        });
        pendingDevelopmentInputFormButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open Pending Development input form
                new PendingDevelopmentInputForm();
            }
        });
        developmentInputFormButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open Development Input form
                new DevelopmentInputForm();
            }
        });
        peerReviewInputFormButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open Peer Review input form
                new PeerReviewInputForm();
            }
        });
        businessReviewInputFormButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open business review input form
                new BusinessReviewInputForm();
            }
        });
        updateStatusInputFormButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open update status input form
                new UpdateStatusInputForm();
            }
        });
        requestReviewInputFormButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open request review input form
                new RequestReviewInputForm();
            }
        });
        addANoteInputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open add a note input form
                new AddANoteInputForm();
            }
        });
        addLevelOfEffortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open add level of effort
                new AddLevelOfEffortInputForm();
            }
        });
        addADeveloperInputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open add a developer input form
                new AddADeveloperInputForm();
            }
        });
        configurationFormButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Open configuration form

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainDatabaseForm");
        frame.setContentPane(new MainDatabaseForm().TopLevelJPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
