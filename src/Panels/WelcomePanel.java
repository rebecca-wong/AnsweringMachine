package Panels;

import javax.swing.*;
import java.awt.*;

public class WelcomePanel extends Panel {
    JLabel wl1;
    JLabel wl2;
    JLabel hsl1;
    JLabel hsl2;
    JLabel hsl3;
    JButton enterButton;
    ImageIcon enterImage;

    public WelcomePanel(JPanel screens) {
        super(screens);
    }

    public void gui() {
    		wl1 = new JLabel("Welcome to");
        wl2 = new JLabel("the ANSWERING MACHINE.");
        hsl1 = new JLabel("Have knowledge you wish to impart concerning");
        hsl2 = new JLabel("the [School of Art + Art History + Design]?");
        hsl3 = new JLabel("Leave it here!");

        enterImage = new ImageIcon(this.getClass().getResource("/ENTER.png"));
		enterButton = new JButton();
		enterButton.setBorder(BorderFactory.createEmptyBorder());


        // Add components to Panel (this)

        this.add(wl1);
        this.add(wl2);
        this.add(hsl1);
        this.add(hsl2);
        this.add(hsl3);
        this.add(enterButton);

        this.setOptions();
    }

    public void setOptions() {
        SpringLayout sl = (SpringLayout) this.getLayout();

        wl1.setFont(new Font("Helvetica Neue", Font.PLAIN, this.fontSize(40)));
        sl.putConstraint(SpringLayout.WEST, wl1, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, wl1, this.mainY(), SpringLayout.NORTH, this);

        wl2.setFont(new Font("Helvetica Neue", Font.BOLD, this.fontSize(40)));
        sl.putConstraint(SpringLayout.WEST, wl2, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, wl2, this.mainY() + this.scaledY(50), SpringLayout.NORTH, this);

        hsl1.setFont(new Font("Helvetica Neue", Font.PLAIN, this.fontSize(20)));
        sl.putConstraint(SpringLayout.WEST, hsl1, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, hsl1, this.mainY() + this.scaledY(180), SpringLayout.NORTH, this);

        hsl2.setFont(new Font("Helvetica Neue", Font.BOLD, this.fontSize(20)));
        sl.putConstraint(SpringLayout.WEST, hsl2, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, hsl2, this.mainY() + this.scaledY(210), SpringLayout.NORTH, this);

        hsl3.setFont(new Font("Helvetica Neue", Font.PLAIN, this.fontSize(20)));
        sl.putConstraint(SpringLayout.WEST, hsl3, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, hsl3, this.mainY() + this.scaledY(300), SpringLayout.NORTH, this);
        
        sl.putConstraint(SpringLayout.WEST, enterButton, this.mainX() + this.scaledX(500), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, enterButton, 0, SpringLayout.SOUTH, this);
        
        Image img = enterImage.getImage() ;  
		Image newimg = img.getScaledInstance(this.scaledY(65), this.scaledY(50),  java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon imicon = new ImageIcon( newimg );
		enterButton.setIcon(imicon);
    }

    public void PressedUp() {
        System.out.println("Welcome: UP");
    }

    public void PressedDown() {
        System.out.println("Welcome: DOWN");
    }

    public void PressedA() {
        System.out.println("Welcome: A");
        showScreen(Panel.TEST_PANEL);
    }

    public void PressedB() {
        System.out.println("Welcome: B");
        showScreen(Panel.QUESTION1_PANEL);
    }
}
