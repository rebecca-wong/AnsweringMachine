package Panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public abstract class Panel extends JPanel implements /*KeyListener,*/ ComponentListener {
    protected JPanel screens;
    public final static int WIDTH = 860;
    public final static int HEIGHT = 575;
    public final static String FONT = "Helvetica Neue";
    public final static String WELCOME_PANEL = "WELCOME_PANEL";
    public final static String TEST_PANEL = "TEST_PANEL";
    public final static String QUESTION1_PANEL = "QUESTION1_PANEL";
    // Add more screen names <HERE>

    private final Action pressed_a = new AbstractAction() {
        public void actionPerformed(ActionEvent e) {
            PressedA();
        }
    };

    private final Action pressed_b = new AbstractAction() {
        public void actionPerformed(ActionEvent e) {
            PressedB();
        }
    };

    private final Action pressed_up = new AbstractAction() {
        public void actionPerformed(ActionEvent e) {
            PressedUp();
        }
    };

    private final Action pressed_down = new AbstractAction() {
        public void actionPerformed(ActionEvent e) {
            PressedDown();
        }
    };

    public Panel(JPanel screens) {
        super();
        this.setLayout(new SpringLayout());
        this.setFocusable(true);
        this.addComponentListener(this);
        this.setBackground(Color.WHITE);

        this.getInputMap(WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).put(KeyStroke.getKeyStroke(65, 0), "pressed_a");
        this.getInputMap(WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).put(KeyStroke.getKeyStroke(66, 0), "pressed_b");
        this.getInputMap(WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).put(KeyStroke.getKeyStroke(38, 0), "pressed_up");
        this.getInputMap(WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).put(KeyStroke.getKeyStroke(40, 0), "pressed_down");

        this.getActionMap().put("pressed_a", pressed_a);
        this.getActionMap().put("pressed_b", pressed_b);
        this.getActionMap().put("pressed_up", pressed_up);
        this.getActionMap().put("pressed_down", pressed_down);

        this.screens = screens;
        this.gui();
    }

    @Override
    public void componentShown(ComponentEvent cEvt) {
        Component src = (Component) cEvt.getSource();
        src.requestFocusInWindow();
        src.requestFocus();
    }

    @Override
    public void componentHidden(ComponentEvent cEvt) {}

    @Override
    public void componentResized(ComponentEvent cEvt) {
        setOptions();
    }

    @Override
    public void componentMoved(ComponentEvent cEvt) {}

    // Helper Functions - Logic

    protected void showScreen(String screenId) {
        CardLayout cl = (CardLayout)(screens.getLayout());
        cl.show(screens, screenId);
    }

    // Helper Functions - Visual

    protected int scaledX (int s) {
        if (this.getSize().width == 0) {
            return s;
        } else {
            return (int)(this.getSize().width / (double)Panel.WIDTH * s);
        }
    }

    protected int scaledY (int s) {
        if (this.getSize().height == 0) {
            return s;
        } else {
            return (int)(this.getSize().height / (double)Panel.HEIGHT * s);
        }
    }

    protected int mainX () {
        // this centers the main body content
        if (this.getSize().width == 0) {
            return 230;
        } else {
            return this.getSize().width / 2 - this.scaledX(270);
        }
    }

    protected int mainY () {
        // this basically acts as padding from the top
        return this.scaledY(50);
    }

    protected int leftX () {
        return this.scaledY(30);
    }

    protected int leftY () {
        return this.scaledY(30);
    }

    protected int rightX () {
        return this.scaledY(30);
    }

    protected int rightY () {
        return this.scaledY(30);
    }

    protected int fontSize (int fs) {
        if (this.getSize().width == 0 || this.getSize().height == 0) {
            return fs;
        } else {
            double ratio = Math.min((this.getSize().width / (double) Panel.WIDTH), (this.getSize().height / (double) Panel.HEIGHT));
            return (int) (ratio * fs);
        }
    }

    // Abstract Functions

    public abstract void gui();
    public abstract void setOptions();
    public abstract void PressedUp();
    public abstract void PressedDown();
    public abstract void PressedA();
    public abstract void PressedB();
}
