package Panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.font.TextAttribute;

import javax.swing.*;

import javafx.scene.chart.PieChart.Data;

public class BrowseP1_3Panel extends Panel {
	
	JLabel questionLabel1;
	JLabel questionLabel2;
	JLabel question2Label1;
	JLabel question3Label1;
	JLabel question3Label2;
	JLabel headerQuestion1;
	JLabel headerQuestion2;
	JLabel q1Label;
	JLabel q2Label;
	JLabel q3Label;
	JLabel q1responsesLabel;
	JLabel q2responsesLabel;
	JLabel q3responsesLabel;
	JLabel homeLabel;
	JLabel navigateLabel;
	JLabel selectLabel;
	JButton downArrowButton;
	ImageIcon downArrowImage;
	JButton homeLineButton;
	ImageIcon homeLineImage;
	JButton navigateLineButton;
	ImageIcon navigateLineImage;
	JButton selectLineButton;
	ImageIcon selectLineImage;

	
    public BrowseP1_3Panel(JPanel screens) {
        super(screens);
    }

    public void gui() {
    	
    		///// Make labels ///////
    		questionLabel1 = new JLabel("\"What class do I need to take before I graduate within"); 
		questionLabel2 = new JLabel("the design major?\""); 
		question2Label1 = new JLabel("\"Who was your favorite professor and why?\"");
		question3Label1 = new JLabel("\"What was your favorite project you did within the");
		question3Label2 = new JLabel("design major?\"");
		q1Label = new JLabel("Q1");
		q2Label = new JLabel("Q2");
		q3Label = new JLabel("Q3");
		q1responsesLabel = new JLabel("2 responses");
		q2responsesLabel = new JLabel("2 responses");
		q3responsesLabel = new JLabel("2 responses");
		headerQuestion1 = new JLabel("P1");
		headerQuestion2 = new JLabel("OUT OF 4");
		homeLabel = new JLabel("HOME");
		navigateLabel = new JLabel("NAVIGATE");
		selectLabel = new JLabel("SELECT");
    	
		/////// Make Buttons /////////
		
		//down arrow button.
		downArrowImage = new ImageIcon(this.getClass().getResource("/Arrow_Down.png"));
		downArrowButton = new JButton();
		downArrowButton.setBorder(BorderFactory.createEmptyBorder());
		
		//browse button
		homeLineImage = new ImageIcon(this.getClass().getResource("/line_2.png"));
		homeLineButton = new JButton();
		homeLineButton.setBorder(BorderFactory.createEmptyBorder());
		
		//Navigate button
		navigateLineImage = new ImageIcon(this.getClass().getResource("/line_2.png"));
		navigateLineButton = new JButton();
		navigateLineButton.setBorder(BorderFactory.createEmptyBorder());
		
		//Record button 
		selectLineImage = new ImageIcon(this.getClass().getResource("/line_2.png"));
		selectLineButton = new JButton();
		selectLineButton.setBorder(BorderFactory.createEmptyBorder());
    	
		
        ////////Add Components to this//////////
		this.add(questionLabel1);
		this.add(questionLabel2);
		this.add(question2Label1);
		this.add(question3Label1);
		this.add(question3Label2);
		this.add(q1Label);
		this.add(q2Label);
		this.add(q3Label);
		this.add(q1responsesLabel);
		this.add(q2responsesLabel);
		this.add(q3responsesLabel);
		this.add(downArrowButton);
		this.add(homeLineButton);
		this.add(navigateLineButton);
		this.add(selectLineButton);
		this.add(headerQuestion1);
		this.add(headerQuestion2);
		this.add(homeLabel);
		this.add(selectLabel);
		this.add(navigateLabel);
		
		
		this.setOptions();
    }
    
    public void shown() {
		Variables.questionNumber = 1;
    }

    public void setOptions() {
    		SpringLayout sl = (SpringLayout) this.getLayout();

    		
    		/*first line of question label is 90 + mainY and second line 35 pixels further down aka + 125
    		 * 225 pixels between buttons on the bottom*/
    		
		questionLabel1.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 20));
		sl.putConstraint(SpringLayout.WEST, questionLabel1, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, questionLabel1, this.mainY() + this.scaledY(90), SpringLayout.NORTH, this);
		
		questionLabel2.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 20));
		sl.putConstraint(SpringLayout.WEST, questionLabel2, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, questionLabel2, this.mainY() + this.scaledY(115), SpringLayout.NORTH, this);
        
		question2Label1.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 20));
		sl.putConstraint(SpringLayout.WEST, question2Label1, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, question2Label1, this.mainY() + this.scaledY(180), SpringLayout.NORTH, this);
        
        question3Label1.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 20));
        question3Label1.setForeground(Color.WHITE);
        question3Label1.setBackground(Color.BLACK);
        question3Label1.setOpaque(true);
        sl.putConstraint(SpringLayout.WEST, question3Label1, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, question3Label1, this.mainY() + this.scaledY(270), SpringLayout.NORTH, this);
		
		question3Label2.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 20));
        question3Label2.setForeground(Color.WHITE);
        question3Label2.setBackground(Color.BLACK);
        question3Label2.setOpaque(true);
		sl.putConstraint(SpringLayout.WEST, question3Label2, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, question3Label2, this.mainY() + this.scaledY(295), SpringLayout.NORTH, this);
        
        q1Label.setFont(this.customFont(TextAttribute.WEIGHT_LIGHT, 30));
		sl.putConstraint(SpringLayout.WEST, q1Label, this.leftX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, q1Label, this.mainY() + this.scaledY(90), SpringLayout.NORTH, this);
		
        q2Label.setFont(this.customFont(TextAttribute.WEIGHT_LIGHT, 30));
		sl.putConstraint(SpringLayout.WEST, q2Label, this.leftX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, q2Label, this.mainY() + this.scaledY(180), SpringLayout.NORTH, this);
        
        q3Label.setFont(this.customFont(TextAttribute.WEIGHT_LIGHT, 30));
		sl.putConstraint(SpringLayout.WEST, q3Label, this.leftX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, q3Label, this.mainY() + this.scaledY(270), SpringLayout.NORTH, this);
        
        q1responsesLabel.setFont(this.customFont(TextAttribute.WEIGHT_REGULAR, 12));
		sl.putConstraint(SpringLayout.EAST, q1responsesLabel, this.scaledX(-60), SpringLayout.EAST, this);
        sl.putConstraint(SpringLayout.NORTH, q1responsesLabel, this.rightY() + this.scaledY(90), SpringLayout.NORTH, this);
       
        q2responsesLabel.setFont(this.customFont(TextAttribute.WEIGHT_REGULAR, 12));
		sl.putConstraint(SpringLayout.EAST, q2responsesLabel, this.scaledX(-60), SpringLayout.EAST, this);
        sl.putConstraint(SpringLayout.NORTH, q2responsesLabel, this.rightY() + this.scaledY(180), SpringLayout.NORTH, this);
       
        q3responsesLabel.setFont(this.customFont(TextAttribute.WEIGHT_REGULAR, 12));
		sl.putConstraint(SpringLayout.EAST, q3responsesLabel, this.scaledX(-60), SpringLayout.EAST, this);
        sl.putConstraint(SpringLayout.NORTH, q3responsesLabel, this.rightY() + this.scaledY(270), SpringLayout.NORTH, this);
       
        
        headerQuestion1.setFont(this.customFont(TextAttribute.WEIGHT_REGULAR, 25));
        sl.putConstraint(SpringLayout.WEST, headerQuestion1, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, headerQuestion1, this.mainY(), SpringLayout.NORTH, this);
        
        headerQuestion2.setFont(this.customFont(TextAttribute.WEIGHT_REGULAR, 12));
        sl.putConstraint(SpringLayout.WEST, headerQuestion2, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, headerQuestion2, this.mainY() + this.scaledY(28), SpringLayout.NORTH, this);
        
        homeLabel.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 15));
        sl.putConstraint(SpringLayout.WEST, homeLabel, this.mainX() + this.scaledX(10), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, homeLabel, this.mainY() + this.scaledY(475), SpringLayout.NORTH, this);
        
        navigateLabel.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 15));
        sl.putConstraint(SpringLayout.WEST, navigateLabel, this.mainX() + this.scaledX(227), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, navigateLabel, this.mainY() + this.scaledY(475), SpringLayout.NORTH, this);
        
        selectLabel.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 15));
        sl.putConstraint(SpringLayout.WEST, selectLabel, this.mainX() + this.scaledX(455), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, selectLabel, this.mainY() + this.scaledY(475), SpringLayout.NORTH, this);
        
        //sl.putConstraint(SpringLayout.WEST, questionNumberButton, this.mainX(), SpringLayout.WEST, this);
       // sl.putConstraint(SpringLayout.NORTH, questionNumberButton, this.mainY(), SpringLayout.NORTH, this);
		
        sl.putConstraint(SpringLayout.WEST, downArrowButton, this.leftX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, downArrowButton, this.leftY() + this.scaledY(400), SpringLayout.NORTH, this);
        
        sl.putConstraint(SpringLayout.WEST, homeLineButton, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, homeLineButton, 0, SpringLayout.SOUTH, this);
        
        sl.putConstraint(SpringLayout.WEST, navigateLineButton, this.mainX() + this.scaledX(225), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, navigateLineButton, 0, SpringLayout.SOUTH, this);
        
        sl.putConstraint(SpringLayout.WEST, selectLineButton, this.mainX() + this.scaledX(450), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, selectLineButton, 0, SpringLayout.SOUTH, this);
        
	
		Image downImg = downArrowImage.getImage() ;  
		Image newDownImg = downImg.getScaledInstance(this.scaledY(20), this.scaledY(50),  java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon downArrowIcon = new ImageIcon( newDownImg );
		downArrowButton.setIcon(downArrowIcon);
		
		Image browseImg = homeLineImage.getImage() ;  
		Image newBrowseImg = browseImg.getScaledInstance(this.scaledY(65), this.scaledY(50),  java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon browseIcon = new ImageIcon( newBrowseImg );
		homeLineButton.setIcon(browseIcon);
		
		Image navigateImg = navigateLineImage.getImage() ;  
		Image newNavigateImg = navigateImg.getScaledInstance(this.scaledY(65), this.scaledY(50), java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon navigateIcon = new ImageIcon( newNavigateImg);
		navigateLineButton.setIcon(navigateIcon);
		
		Image recordImg = selectLineImage.getImage() ;  
		Image newRecordImg = recordImg.getScaledInstance(this.scaledY(65), this.scaledY(50),  java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon recordIcon = new ImageIcon( newRecordImg );
		selectLineButton.setIcon(recordIcon);

    }

    public void PressedUp() {
    		showScreen(Panel.BROWSEP1_2PANEL);
    }
    

    public void PressedDown() {
        showScreen(Panel.BROWSEP2_1PANEL);
    }

    public void PressedA() {
        showScreen(Panel.WELCOME_PANEL);
    }

    public void PressedB() {
    		showScreen(Panel.LISTENQ3_PANEL);
        
    }
}
