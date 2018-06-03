package Panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.font.TextAttribute;

import javax.swing.*;

import javafx.scene.chart.PieChart.Data;

public class DeletedPanel extends Panel {
	
	JLabel questionLabel1;
	JLabel backLabel;
	JButton backLineButton;
	ImageIcon backLineImage;

	
    public DeletedPanel(JPanel screens) {
        super(screens);
    }

    public void gui() {
    	
    		///// Make labels ///////
    		questionLabel1 = new JLabel("Your recording has been deleted."); 
		backLabel = new JLabel("BACK");

		/////// Make Buttons /////////
		
		//back button
		backLineImage = new ImageIcon(this.getClass().getResource("/line_2.png"));
		backLineButton = new JButton();
		backLineButton.setBorder(BorderFactory.createEmptyBorder());
		
		
        ////////Add Components to this//////////
		this.add(questionLabel1);
		this.add(backLabel);
		this.add(backLineButton);
		
		
		this.setOptions();
    }
    
    public void shown() {
    }

    public void setOptions() {
    		SpringLayout sl = (SpringLayout) this.getLayout();

    		
    		/*first line of question label is 90 + mainY and second line 35 pixels further down aka + 125
    		 * 225 pixels between buttons on the bottom*/
    		
		questionLabel1.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 30));
        sl.putConstraint(SpringLayout.WEST, questionLabel1, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, questionLabel1, this.mainY() + this.scaledY(90), SpringLayout.NORTH, this);
		
        backLabel.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 15));
        
        sl.putConstraint(SpringLayout.WEST, backLabel, this.mainX() + this.scaledX(13), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, backLabel, this.mainY() + this.scaledY(475), SpringLayout.NORTH, this);
        
        sl.putConstraint(SpringLayout.WEST, backLineButton, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, backLineButton, 0, SpringLayout.SOUTH, this);
        
		
		Image browseImg = backLineImage.getImage() ;  
		Image newBrowseImg = browseImg.getScaledInstance(this.scaledY(65), this.scaledY(50),  java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon browseIcon = new ImageIcon( newBrowseImg );
		backLineButton.setIcon(browseIcon);
		
    }

    public void PressedUp() {

    }

    public void PressedDown() {

    }

    public void PressedA() {
	    	//go to question screens
    		
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

    public void PressedB() {
    	
    }
}
