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
