package Panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.font.TextAttribute;

import javax.swing.*;

import javafx.scene.chart.PieChart.Data;

public class MaybeDeletePanel extends Panel {
	
	JLabel questionLabel1;
	JLabel questionLabel2;
	JLabel deleteLabel;
	JLabel navigateLabel;
	JLabel submitLabel;
	JButton deleteLineButton;
	ImageIcon deleteLineImage;
	JButton navigateLineButton;
	ImageIcon navigateLineImage;
	JButton submitLineButton;
	ImageIcon submitLineImage;
	JButton stopButton;
	ImageIcon stopImage;
	
	/*JButton browseButton;
	ImageIcon browseImage;
	JButton navigateButton;
	ImageIcon navigateImage;
	JButton recordButton;
	ImageIcon recordImage;*/

	
    public MaybeDeletePanel(JPanel screens) {
        super(screens);
    }

    public void gui() {
    	
    		///// Make labels ///////
    		questionLabel1 = new JLabel("\"Are you sure you want to delete your"); 
		questionLabel2 = new JLabel("recording?\"");
		deleteLabel = new JLabel("DELETE");
		navigateLabel = new JLabel("NAVIGATE");
		submitLabel = new JLabel("SUBMIT");
    	
		/////// Make Buttons /////////
		
		//browse button
		deleteLineImage = new ImageIcon(this.getClass().getResource("/line_2.png"));
		deleteLineButton = new JButton();
		deleteLineButton.setBorder(BorderFactory.createEmptyBorder());
		
		//Navigate button
		navigateLineImage = new ImageIcon(this.getClass().getResource("/line_2.png"));
		navigateLineButton = new JButton();
		navigateLineButton.setBorder(BorderFactory.createEmptyBorder());
		
		//Record button 
		submitLineImage = new ImageIcon(this.getClass().getResource("/line_2.png"));
		submitLineButton = new JButton();
		submitLineButton.setBorder(BorderFactory.createEmptyBorder());
    	
		stopImage = new ImageIcon(this.getClass().getResource("/Stop_Button.png"));
		stopButton = new JButton();
		stopButton.setBorder(BorderFactory.createEmptyBorder());
		
        ////////Add Components to this//////////
		this.add(questionLabel1);
		this.add(questionLabel2);
		this.add(deleteLineButton);
		this.add(submitLabel);
		this.add(submitLineButton);
		//this.add(navigateLineButton);
		this.add(deleteLabel);
		//this.add(navigateLabel);
		this.add(stopButton);
		
		
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
		
		questionLabel2.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 30));
		
		sl.putConstraint(SpringLayout.WEST, questionLabel2, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, questionLabel2, this.mainY() + this.scaledY(125), SpringLayout.NORTH, this);
        
        
        deleteLabel.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 15));
        sl.putConstraint(SpringLayout.WEST, deleteLabel, this.mainX() + this.scaledX(8), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, deleteLabel, this.mainY() + this.scaledY(475), SpringLayout.NORTH, this);
        
        navigateLabel.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 15));
        sl.putConstraint(SpringLayout.WEST, navigateLabel, this.mainX() + this.scaledX(227), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, navigateLabel, this.mainY() + this.scaledY(475), SpringLayout.NORTH, this);
             
        submitLabel.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 15));
        sl.putConstraint(SpringLayout.WEST, submitLabel, this.mainX() + this.scaledX(455), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, submitLabel, this.mainY() + this.scaledY(475), SpringLayout.NORTH, this);
        
        
        //sl.putConstraint(SpringLayout.WEST, questionNumberButton, this.mainX(), SpringLayout.WEST, this);
       // sl.putConstraint(SpringLayout.NORTH, questionNumberButton, this.mainY(), SpringLayout.NORTH, this);
        
        sl.putConstraint(SpringLayout.WEST, deleteLineButton, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, deleteLineButton, 0, SpringLayout.SOUTH, this);
        
        sl.putConstraint(SpringLayout.WEST, navigateLineButton, this.mainX() + this.scaledX(225), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, navigateLineButton, 0, SpringLayout.SOUTH, this);
        
        sl.putConstraint(SpringLayout.WEST, submitLineButton, this.mainX() + this.scaledX(450), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, submitLineButton, 0, SpringLayout.SOUTH, this);
        
        sl.putConstraint(SpringLayout.WEST, stopButton,this.mainX() + this.scaledX(205), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, stopButton, this.mainY() + this.scaledY(190), SpringLayout.NORTH, this);
        
        
        Image recordImg = submitLineImage.getImage() ;  
		Image newRecordImg = recordImg.getScaledInstance(this.scaledY(65), this.scaledY(50),  java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon recordIcon = new ImageIcon( newRecordImg );
		submitLineButton.setIcon(recordIcon);
        
		Image browseImg = deleteLineImage.getImage() ;  
		Image newBrowseImg = browseImg.getScaledInstance(this.scaledY(65), this.scaledY(50),  java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon browseIcon = new ImageIcon( newBrowseImg );
		deleteLineButton.setIcon(browseIcon);
		
		Image navigateImg = navigateLineImage.getImage() ;  
		Image newNavigateImg = navigateImg.getScaledInstance(this.scaledY(65), this.scaledY(50), java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon navigateIcon = new ImageIcon( newNavigateImg);
		navigateLineButton.setIcon(navigateIcon);
		
		Image stopImg = stopImage.getImage() ;  
		Image newStopImg = stopImg.getScaledInstance(this.scaledY(100), this.scaledY(100),  java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon stopIcon = new ImageIcon( newStopImg );
		stopButton.setIcon(stopIcon);

    }

    public void PressedUp() {

    }

    public void PressedDown() {

    }

    public void PressedA() {
        showScreen(Panel.DELETED_PANEL);
    }

    public void PressedB() {
    	//go to prior stopped recording screen
	    
	     		showScreen(Panel.THANK_YOU_PANEL);
	     /* else if (Variables.questionNumber == 2) {
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
	     }*/
        
    }
}
