package Panels;

import javax.swing.*;
import java.awt.*;
import java.awt.font.TextAttribute;

public class ThankYouPanel extends Panel {
    JLabel tyLabel1;
    JLabel tyLabel2;
    JLabel nextLabel;
    JButton nextLineButton;
    ImageIcon nextLineImage;

    public ThankYouPanel(JPanel screens) {
        super(screens);

    }

    public void gui() {
    		tyLabel1 = new JLabel("Thank you for your input!");
        tyLabel2 = new JLabel("Your recording will be reviewed and available the next day.");
        nextLabel = new JLabel("NEXT");

        nextLineImage = new ImageIcon(this.getClass().getResource("/line_2.png"));
		nextLineButton = new JButton();
		nextLineButton.setBorder(BorderFactory.createEmptyBorder());


        // Add components to Panel (this)

        this.add(tyLabel1);
        this.add(tyLabel2);
        this.add(nextLineButton);
        this.add(nextLabel);

        this.setOptions();
    }

    public void setOptions() {
        SpringLayout sl = (SpringLayout) this.getLayout();

        tyLabel1.setFont(this.customFont(TextAttribute.WEIGHT_REGULAR, 30));
        sl.putConstraint(SpringLayout.WEST, tyLabel1, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, tyLabel1, this.mainY() + this.scaledY(90), SpringLayout.NORTH, this);

        tyLabel2.setFont(this.customFont(TextAttribute.WEIGHT_REGULAR, 20));
        sl.putConstraint(SpringLayout.WEST, tyLabel2, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, tyLabel2, this.mainY() + this.scaledY(150), SpringLayout.NORTH, this);
        
        nextLabel.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 15));
        sl.putConstraint(SpringLayout.WEST, nextLabel, this.mainX() + this.scaledX(463), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, nextLabel, this.mainY() + this.scaledY(475), SpringLayout.NORTH, this);
        
        sl.putConstraint(SpringLayout.WEST, nextLineButton, this.mainX() + this.scaledX(450), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, nextLineButton, 0, SpringLayout.SOUTH, this);
        
        Image img = nextLineImage.getImage() ;  
		Image newimg = img.getScaledInstance(this.scaledY(65), this.scaledY(50),  java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon imicon = new ImageIcon( newimg );
		nextLineButton.setIcon(imicon);
    }

    public void PressedUp() {
    }

    public void PressedDown() {
    }

    public void PressedA() {
    }

    public void PressedB() {
        if(Variables.questionNumber == 1) {
        		showScreen(Panel.QUESTION1_PANEL);
        } else if (Variables.questionNumber == 2) {
        		showScreen(Panel.QUESTION2_PANEL);
        } else if (Variables.questionNumber == 3) {
    			showScreen(Panel.QUESTION3_PANEL);
        } else if (Variables.questionNumber == 4) {
    			showScreen(Panel.QUESTION4_PANEL);
        } else if (Variables.questionNumber== 5) {
    			showScreen(Panel.QUESTION5_PANEL);
        } else if (Variables.questionNumber == 6) {
    			showScreen(Panel.QUESTION6_PANEL);
        } else if (Variables.questionNumber == 7) {
    			showScreen(Panel.QUESTION7_PANEL);
        } else if (Variables.questionNumber == 8) {
    			showScreen(Panel.QUESTION8_PANEL);
        } else if (Variables.questionNumber == 9) {
    			showScreen(Panel.QUESTION9_PANEL);
        } else if (Variables.questionNumber == 10) {
    			showScreen(Panel.QUESTION10_PANEL);
        }
        
    }

	@Override
	public void shown() {
		// TODO Auto-generated method stub
		
	}
}

