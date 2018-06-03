import java.awt.*;
import java.io.InputStream;

import javax.swing.*;
import Panels.*;
import Panels.Panel;

public class MainPanel {
    public void addComponentToPane(Container pane) {
        JPanel screens = new JPanel(new CardLayout());

        screens.add(new WelcomePanel(screens), Panels.Panel.WELCOME_PANEL);
        screens.add(new TestPanel(screens), Panels.Panel.TEST_PANEL);
        screens.add(new Question1Panel(screens), Panels.Panel.QUESTION1_PANEL);
        screens.add(new Question2Panel(screens), Panels.Panel.QUESTION2_PANEL);
        screens.add(new Question3Panel(screens), Panels.Panel.QUESTION3_PANEL);
        screens.add(new Question4Panel(screens), Panels.Panel.QUESTION4_PANEL);
        screens.add(new Question5Panel(screens), Panels.Panel.QUESTION5_PANEL);
        screens.add(new Question6Panel(screens), Panels.Panel.QUESTION6_PANEL);
        screens.add(new Question7Panel(screens), Panels.Panel.QUESTION7_PANEL);
        screens.add(new Question8Panel(screens), Panels.Panel.QUESTION8_PANEL);
        screens.add(new Question9Panel(screens), Panels.Panel.QUESTION9_PANEL);
        screens.add(new Question10Panel(screens), Panels.Panel.QUESTION10_PANEL);
        screens.add(new ThankYouPanel(screens), Panels.Panel.THANK_YOU_PANEL);
        screens.add(new Q1RecordPanel(screens), Panels.Panel.Q1_RECORD_PANEL);
        screens.add(new Q1StoppedRecordPanel(screens), Panels.Panel.Q1_STOPPED_RECORD_PANEL);
        screens.add(new MaybeDeletePanel(screens), Panels.Panel.MAYBE_DELETE_PANEL);
        screens.add(new DeletedPanel(screens), Panels.Panel.DELETED_PANEL);
        screens.add(new BrowseP1_1Panel(screens), Panels.Panel.BROWSEP1_1PANEL);
        screens.add(new BrowseP1_2Panel(screens), Panels.Panel.BROWSEP1_2PANEL);
        screens.add(new BrowseP1_3Panel(screens), Panels.Panel.BROWSEP1_3PANEL);
        screens.add(new BrowseP2_1Panel(screens), Panels.Panel.BROWSEP2_1PANEL);
        screens.add(new BrowseP2_2Panel(screens), Panels.Panel.BROWSEP2_2PANEL);
        screens.add(new BrowseP2_3Panel(screens), Panels.Panel.BROWSEP2_3PANEL);
        screens.add(new BrowseP3_1Panel(screens), Panels.Panel.BROWSEP3_1PANEL);
        screens.add(new BrowseP3_2Panel(screens), Panels.Panel.BROWSEP3_2PANEL);
        screens.add(new BrowseP3_3Panel(screens), Panels.Panel.BROWSEP3_3PANEL);
        screens.add(new BrowseP4_1Panel(screens), Panels.Panel.BROWSEP4_1PANEL);
        screens.add(new ListenQ1_1Panel(screens), Panels.Panel.LISTENQ1_1PANEL);
        screens.add(new ListenQ2Panel(screens), Panels.Panel.LISTENQ2_PANEL);
        screens.add(new ListenQ3Panel(screens), Panels.Panel.LISTENQ3_PANEL);
        screens.add(new ListenQ4Panel(screens), Panels.Panel.LISTENQ4_PANEL);
        screens.add(new ListenQ5Panel(screens), Panels.Panel.LISTENQ5_PANEL);
        screens.add(new ListenQ6Panel(screens), Panels.Panel.LISTENQ6_PANEL);
        screens.add(new ListenQ7Panel(screens), Panels.Panel.LISTENQ7_PANEL);
        screens.add(new ListenQ8Panel(screens), Panels.Panel.LISTENQ8_PANEL);
        screens.add(new ListenQ9Panel(screens), Panels.Panel.LISTENQ9_PANEL);
        screens.add(new ListenQ10Panel(screens), Panels.Panel.LISTENQ10_PANEL);
        
        
        // Add more screens <HERE>

        pane.add(screens, BorderLayout.CENTER);
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Answering Machine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(Panel.WIDTH, Panel.HEIGHT));

        //Create and set up the content pane.
        MainPanel p = new MainPanel();
        p.addComponentToPane(frame.getContentPane());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
}
