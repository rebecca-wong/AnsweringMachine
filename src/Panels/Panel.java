package Panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.font.TextAttribute;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public abstract class Panel extends JPanel implements /*KeyListener,*/ ComponentListener {
	
    protected JPanel screens;
    public final static int WIDTH = 860;
    public final static int HEIGHT = 575;
    public final static String FONT = "Helvetica Neue";
    public final static String WELCOME_PANEL = "WELCOME_PANEL";
    public final static String TEST_PANEL = "TEST_PANEL";
    public final static String QUESTION1_PANEL = "QUESTION1_PANEL";
    public final static String QUESTION2_PANEL = "QUESTION2_PANEL";
    public final static String QUESTION3_PANEL = "QUESTION3_PANEL";
    public final static String QUESTION4_PANEL = "QUESTION4_PANEL";
    public final static String QUESTION5_PANEL = "QUESTION5_PANEL";
    public final static String QUESTION6_PANEL = "QUESTION6_PANEL";
    public final static String QUESTION7_PANEL = "QUESTION7_PANEL";
    public final static String QUESTION8_PANEL = "QUESTION8_PANEL";
    public final static String QUESTION9_PANEL = "QUESTION9_PANEL";
    public final static String QUESTION10_PANEL = "QUESTION10_PANEL";
    public final static String THANK_YOU_PANEL = "THANK_YOU_PANEL";
    public final static String Q1_RECORD_PANEL = "Q1_RECORD_PANEL";
    // Add more screen names <HERE>

   protected Font customFont(float style, int fontSize) {
	   try {
		   if (style == TextAttribute.WEIGHT_BOLD) {
			   InputStream is = this.getClass().getResourceAsStream("/neuzeitgro-bol.ttf");
			   Font font = Font.createFont(Font.TRUETYPE_FONT, is);
			   return font.deriveFont(Font.PLAIN, this.fontSize(fontSize));
		   } else if (style == TextAttribute.WEIGHT_LIGHT) {
			   InputStream is = this.getClass().getResourceAsStream("/neuzeitgro-lig.ttf");
			   Font font = Font.createFont(Font.TRUETYPE_FONT, is);
			   return font.deriveFont(Font.PLAIN, this.fontSize(fontSize));
		   } else {
			   InputStream is = this.getClass().getResourceAsStream("/neuzeitgro-reg.ttf");
			   Font font = Font.createFont(Font.TRUETYPE_FONT, is);
			   return font.deriveFont(Font.PLAIN, this.fontSize(fontSize));
		   } 
	   } catch(Exception e) {
		   e.printStackTrace();
	   }
	   
	   return new Font("Helvetica Neue", Font.PLAIN, this.fontSize(fontSize));
	   
	   /*try {
		    //create the font to use. Specify the size!
			
		Font NeuzeitGroBla = Font.createFont(Font.TRUETYPE_FONT, new File(("Fonts\\NeuzeitGro-Bla.otf")));
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		//register the font
		ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Fonts\\NeuzeitGro-Bla.otf")));
		} catch (IOException e) {
		    e.printStackTrace();
		} catch(FontFormatException e) {
		    e.printStackTrace();
		}*/
    }
    
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
        
        //this.customFont();
    }

    @Override
    public void componentShown(ComponentEvent cEvt) {
        Component src = (Component) cEvt.getSource();
        src.requestFocusInWindow();
        src.requestFocus();
        shown();
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
        return this.scaledY(60);
    }

    protected int leftY () {
        return this.scaledY(50);
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
    public abstract void shown();
}
