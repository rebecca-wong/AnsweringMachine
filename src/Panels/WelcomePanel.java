package Panels;

import javax.swing.*;
import java.awt.*;
import java.awt.font.TextAttribute;

public class WelcomePanel extends Panel {
    JLabel wl1;
    JLabel wl2;
    JLabel hsl1;
    JLabel hsl2;
    JLabel hsl3;
    JLabel enterLabel;
    JButton enterLineButton;
    ImageIcon enterLineImage;

    public WelcomePanel(JPanel screens) {
        super(screens);
    }

    public void gui() {
    		wl1 = new JLabel("Welcome to");
        wl2 = new JLabel("the ANSWERING MACHINE.");
        hsl1 = new JLabel("Have knowledge you wish to impart concerning");
        hsl2 = new JLabel("the [School of Art + Art History + Design]?");
        hsl3 = new JLabel("Leave it here!");
        enterLabel = new JLabel("ENTER");

        enterLineImage = new ImageIcon(this.getClass().getResource("/line_2.png"));
		enterLineButton = new JButton();
		enterLineButton.setBorder(BorderFactory.createEmptyBorder());


        // Add components to Panel (this)

        this.add(wl1);
        this.add(wl2);
        this.add(hsl1);
        this.add(hsl2);
        this.add(hsl3);
        this.add(enterLineButton);
        this.add(enterLabel);

        this.setOptions();
    }

    public void setOptions() {
        SpringLayout sl = (SpringLayout) this.getLayout();

        wl1.setFont(this.customFont(TextAttribute.WEIGHT_REGULAR, 40));
        sl.putConstraint(SpringLayout.WEST, wl1, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, wl1, this.mainY(), SpringLayout.NORTH, this);

        wl2.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 40));
        sl.putConstraint(SpringLayout.WEST, wl2, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, wl2, this.mainY() + this.scaledY(50), SpringLayout.NORTH, this);

        hsl1.setFont(this.customFont(TextAttribute.WEIGHT_REGULAR, 20));
        sl.putConstraint(SpringLayout.WEST, hsl1, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, hsl1, this.mainY() + this.scaledY(180), SpringLayout.NORTH, this);

        hsl2.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 20));
        sl.putConstraint(SpringLayout.WEST, hsl2, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, hsl2, this.mainY() + this.scaledY(210), SpringLayout.NORTH, this);

        hsl3.setFont(this.customFont(TextAttribute.WEIGHT_REGULAR, 20));
        sl.putConstraint(SpringLayout.WEST, hsl3, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, hsl3, this.mainY() + this.scaledY(260), SpringLayout.NORTH, this);
        
        enterLabel.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 15));
        sl.putConstraint(SpringLayout.WEST, enterLabel, this.mainX() + this.scaledX(463), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, enterLabel, this.mainY() + this.scaledY(475), SpringLayout.NORTH, this);
        
        sl.putConstraint(SpringLayout.WEST, enterLineButton, this.mainX() + this.scaledX(450), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, enterLineButton, 0, SpringLayout.SOUTH, this);
        
        Image img = enterLineImage.getImage() ;  
		Image newimg = img.getScaledInstance(this.scaledY(65), this.scaledY(50),  java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon imicon = new ImageIcon( newimg );
		enterLineButton.setIcon(imicon);
    }

    public void PressedUp() {
    }

    public void PressedDown() {
        System.out.println("Welcome: DOWN");
    }

    public void PressedA() {
        System.out.println("Welcome: A");
    }

    public void PressedB() {
        System.out.println("Welcome: B");
        showScreen(Panel.QUESTION1_PANEL);
    }

	@Override
	public void shown() {
		// TODO Auto-generated method stub
		
	}
}
