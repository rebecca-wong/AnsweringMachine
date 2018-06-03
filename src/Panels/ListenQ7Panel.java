package Panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.font.TextAttribute;

import javax.swing.*;

import javafx.scene.chart.PieChart.Data;

public class ListenQ7Panel extends Panel {
	
	JLabel questionLabel1;
	JLabel questionLabel2;
	JLabel answer1Label;
	JLabel answer2Label;
	JLabel answer3Label;
	JLabel qNumLabel;
	JLabel a1Label;
	JLabel a2Label;
	JLabel a3Label;
	JLabel backLabel;
	JLabel navigateLabel;
	JLabel playLabel;
	JLabel stopLabel;
	JButton downArrowButton;
	ImageIcon downArrowImage;
	JButton backLineButton;
	ImageIcon backLineImage;
	JButton navigateLineButton;
	ImageIcon navigateLineImage;
	JButton playLineButton;
	ImageIcon playLineImage;
	JButton playButton;
	ImageIcon playImage;
	int ansNum;
	boolean bPressed;

	
    public ListenQ7Panel(JPanel screens) {
        super(screens);
    }

    public void gui() {
    	
    		///// Make labels ///////
    		questionLabel1 = new JLabel("\"What design clubs/RSOs should I join"); 
		questionLabel2 = new JLabel("if any and why?\""); 
		answer1Label = new JLabel("May 14th, 2018                                                              5:04 pm");
		answer2Label = new JLabel("May 26th, 2018                                                              3:29 pm");
		answer3Label = new JLabel("");
		qNumLabel = new JLabel("Q7");
		a1Label = new JLabel("A1");
		a2Label = new JLabel("A2");
		a3Label = new JLabel("A3");
		backLabel = new JLabel("BACK");
		navigateLabel = new JLabel("NAVIGATE");
		playLabel = new JLabel("PLAY");
		stopLabel = new JLabel("STOP");
		ansNum = 1;
		bPressed = false;
    	
		/////// Make Buttons /////////
		
		//down arrow button.
		downArrowImage = new ImageIcon(this.getClass().getResource("/Arrow_Down.png"));
		downArrowButton = new JButton();
		downArrowButton.setBorder(BorderFactory.createEmptyBorder());
		
		//browse button
		backLineImage = new ImageIcon(this.getClass().getResource("/line_2.png"));
		backLineButton = new JButton();
		backLineButton.setBorder(BorderFactory.createEmptyBorder());
		
		//Navigate button
		navigateLineImage = new ImageIcon(this.getClass().getResource("/line_2.png"));
		navigateLineButton = new JButton();
		navigateLineButton.setBorder(BorderFactory.createEmptyBorder());
		
		//Record button 
		playLineImage = new ImageIcon(this.getClass().getResource("/line_2.png"));
		playLineButton = new JButton();
		playLineButton.setBorder(BorderFactory.createEmptyBorder());
		
		playImage = new ImageIcon(this.getClass().getResource("/Play_Button.png"));
		playButton = new JButton();
		playButton.setBorder(BorderFactory.createEmptyBorder());
		playButton.setVisible(false);
    	
		
        ////////Add Components to this//////////
		this.add(questionLabel1);
		this.add(questionLabel2);
		this.add(answer1Label);
		this.add(answer2Label);
		this.add(answer3Label);
		this.add(qNumLabel);
		this.add(a1Label);
		this.add(a2Label);
		this.add(backLineButton);
		this.add(navigateLineButton);
		this.add(playLineButton);
		this.add(playButton);
		this.add(backLabel);
		this.add(playLabel);
		this.add(stopLabel);
		this.add(navigateLabel);
		
		
		this.setOptions();
    }
    
    public void shown() {
		Variables.questionNumber = 1;
		System.out.println(Variables.questionNumber);
    }

    public void setOptions() {
    		SpringLayout sl = (SpringLayout) this.getLayout();

    		
    		/*first line of question label is 90 + mainY and second line 35 pixels further down aka + 125
    		 * 225 pixels between buttons on the bottom*/
    		
		questionLabel1.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 30));
		sl.putConstraint(SpringLayout.WEST, questionLabel1, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, questionLabel1, this.mainY() + this.scaledX(50), SpringLayout.NORTH, this);
		
		questionLabel2.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 30));
		sl.putConstraint(SpringLayout.WEST, questionLabel2, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, questionLabel2, this.mainY() + this.scaledY(80), SpringLayout.NORTH, this);
        
		answer1Label.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 17));
		answer1Label.setForeground(Color.WHITE);
		answer1Label.setBackground(Color.BLACK);
		answer1Label.setOpaque(true);
		sl.putConstraint(SpringLayout.WEST, answer1Label, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, answer1Label, this.mainY() + this.scaledY(180), SpringLayout.NORTH, this);
        
        answer2Label.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 17));
		sl.putConstraint(SpringLayout.WEST, answer2Label, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, answer2Label, this.mainY() + this.scaledY(250), SpringLayout.NORTH, this);
		
		answer3Label.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 17));
		sl.putConstraint(SpringLayout.WEST, answer3Label, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, answer3Label, this.mainY() + this.scaledY(295), SpringLayout.NORTH, this);
        
        qNumLabel.setFont(this.customFont(TextAttribute.WEIGHT_LIGHT, 30));
		sl.putConstraint(SpringLayout.WEST, qNumLabel, this.leftX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, qNumLabel, this.mainY() + this.scaledY(50), SpringLayout.NORTH, this);
		
        
        a1Label.setFont(this.customFont(TextAttribute.WEIGHT_LIGHT, 30));
		sl.putConstraint(SpringLayout.WEST, a1Label, this.leftX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, a1Label, this.mainY() + this.scaledY(180), SpringLayout.NORTH, this);
		
        a2Label.setFont(this.customFont(TextAttribute.WEIGHT_LIGHT, 30));
		sl.putConstraint(SpringLayout.WEST, a2Label, this.leftX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, a2Label, this.mainY() + this.scaledY(250), SpringLayout.NORTH, this);
        
        a3Label.setFont(this.customFont(TextAttribute.WEIGHT_LIGHT, 30));
		sl.putConstraint(SpringLayout.WEST, a3Label, this.leftX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, a3Label, this.mainY() + this.scaledY(270), SpringLayout.NORTH, this);
        
        backLabel.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 15));
        sl.putConstraint(SpringLayout.WEST, backLabel, this.mainX() + this.scaledX(13), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, backLabel, this.mainY() + this.scaledY(475), SpringLayout.NORTH, this);
        
        navigateLabel.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 15));
        sl.putConstraint(SpringLayout.WEST, navigateLabel, this.mainX() + this.scaledX(227), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, navigateLabel, this.mainY() + this.scaledY(475), SpringLayout.NORTH, this);
        
        playLabel.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 15));
        sl.putConstraint(SpringLayout.WEST, playLabel, this.mainX() + this.scaledX(465), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, playLabel, this.mainY() + this.scaledY(475), SpringLayout.NORTH, this);
        
        stopLabel.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 15));
        stopLabel.setVisible(false);
        sl.putConstraint(SpringLayout.WEST, stopLabel, this.mainX() + this.scaledX(465), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, stopLabel, this.mainY() + this.scaledY(475), SpringLayout.NORTH, this);
        
        
        //sl.putConstraint(SpringLayout.WEST, questionNumberButton, this.mainX(), SpringLayout.WEST, this);
       // sl.putConstraint(SpringLayout.NORTH, questionNumberButton, this.mainY(), SpringLayout.NORTH, this);
		
        sl.putConstraint(SpringLayout.WEST, downArrowButton, this.leftX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, downArrowButton, this.leftY() + this.scaledY(400), SpringLayout.NORTH, this);
        
        sl.putConstraint(SpringLayout.WEST, backLineButton, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, backLineButton, 0, SpringLayout.SOUTH, this);
        
        sl.putConstraint(SpringLayout.WEST, navigateLineButton, this.mainX() + this.scaledX(225), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, navigateLineButton, 0, SpringLayout.SOUTH, this);
        
        sl.putConstraint(SpringLayout.WEST, playLineButton, this.mainX() + this.scaledX(450), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, playLineButton, 0, SpringLayout.SOUTH, this);
        
        sl.putConstraint(SpringLayout.WEST, playButton,this.mainX() + this.scaledX(205), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, playButton, this.mainY() + this.scaledY(190), SpringLayout.NORTH, this);
        
		Image downImg = downArrowImage.getImage() ;  
		Image newDownImg = downImg.getScaledInstance(this.scaledY(20), this.scaledY(50),  java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon downArrowIcon = new ImageIcon( newDownImg );
		downArrowButton.setIcon(downArrowIcon);
		
		Image browseImg = backLineImage.getImage() ;  
		Image newBrowseImg = browseImg.getScaledInstance(this.scaledY(65), this.scaledY(50),  java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon browseIcon = new ImageIcon( newBrowseImg );
		backLineButton.setIcon(browseIcon);
		
		Image navigateImg = navigateLineImage.getImage() ;  
		Image newNavigateImg = navigateImg.getScaledInstance(this.scaledY(65), this.scaledY(50), java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon navigateIcon = new ImageIcon( newNavigateImg);
		navigateLineButton.setIcon(navigateIcon);
		
		Image recordImg = playLineImage.getImage() ;  
		Image newRecordImg = recordImg.getScaledInstance(this.scaledY(65), this.scaledY(50),  java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon recordIcon = new ImageIcon( newRecordImg );
		playLineButton.setIcon(recordIcon);
		
		Image playImg = playImage.getImage() ;  
		Image newPlayImg = playImg.getScaledInstance(this.scaledY(100), this.scaledY(100),  java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon playIcon = new ImageIcon( newPlayImg );
		playButton.setIcon(playIcon);

    }

    public void PressedUp() {
    		if(!bPressed) {
    			ansNum = 1;
        		answer1Label.setForeground(Color.WHITE);
        		answer1Label.setBackground(Color.BLACK);
        		answer1Label.setOpaque(true);
        		answer2Label.setForeground(Color.BLACK);
        		answer2Label.setBackground(Color.BLACK);
        		answer2Label.setOpaque(false);
    		}
    		
    }

    public void PressedDown() {
    		if(!bPressed) {
    			ansNum = 2;
    			answer1Label.setForeground(Color.BLACK);
    			answer1Label.setOpaque(false);
    			answer2Label.setForeground(Color.WHITE);
    			answer2Label.setBackground(Color.BLACK);
    			answer2Label.setOpaque(true);
    	        //showScreen(Panel.LISTENQ1_2PANEL);
    		} 
    }

    public void PressedA() {
    		if(!bPressed) {
    			showScreen(Panel.BROWSEP3_1PANEL);
    		}
    }

    public void PressedB() {
    		//first time b is pressed
    		if (!bPressed) {
    			bPressed = true;
        		questionLabel1.setForeground(new Color(0f, 0f, 0f, 0.2f));
        		questionLabel2.setForeground(new Color(0f, 0f, 0f, 0.2f));
        		answer1Label.setForeground(new Color(0f, 0f, 0f, 0.2f));
        		answer1Label.setOpaque(false);
        		answer2Label.setOpaque(false);
        		answer2Label.setForeground(new Color(0f, 0f, 0f, 0.2f));
        		qNumLabel.setForeground(new Color(0f, 0f, 0f, 0.2f));
        		a1Label.setForeground(new Color(0f, 0f, 0f, 0.2f));
        		a2Label.setForeground(new Color(0f, 0f, 0f, 0.2f));
        		
        		playButton.setVisible(true);
        		backLineButton.setVisible(false);
        		navigateLineButton.setVisible(false);
        		backLabel.setVisible(false);
        		navigateLabel.setVisible(false);
        		playLabel.setVisible(false);
        		stopLabel.setVisible(true);
        		
    		} else if (bPressed && ansNum == 1){
    			bPressed = false;
    			questionLabel1.setForeground(new Color(0f, 0f, 0f, 1f));
        		questionLabel2.setForeground(new Color(0f, 0f, 0f, 1f));
        		answer1Label.setForeground(new Color(0f, 0f, 0f, 1f));

        		answer2Label.setForeground(new Color(0f, 0f, 0f, 1f));
        		qNumLabel.setForeground(new Color(0f, 0f, 0f, 1f));
        		a1Label.setForeground(new Color(0f, 0f, 0f, 1f));
        		a2Label.setForeground(new Color(0f, 0f, 0f, 1f));
        		
        		playButton.setVisible(false);
        		backLineButton.setVisible(true);
        		navigateLineButton.setVisible(true);
        		backLabel.setVisible(true);
        		navigateLabel.setVisible(true);
        		playLabel.setVisible(true);
        		stopLabel.setVisible(false);
        		
        		answer1Label.setForeground(Color.WHITE);
        		answer1Label.setBackground(Color.BLACK);
        		answer1Label.setOpaque(true);
        		answer2Label.setForeground(Color.BLACK);
        		answer2Label.setBackground(Color.BLACK);
        		answer2Label.setOpaque(false);
        		
    		} else if (bPressed && ansNum == 2){
    			bPressed = false;
    			questionLabel1.setForeground(new Color(0f, 0f, 0f, 1f));
        		questionLabel2.setForeground(new Color(0f, 0f, 0f, 1f));
        		answer1Label.setForeground(new Color(0f, 0f, 0f, 1f));
        		answer2Label.setForeground(new Color(0f, 0f, 0f, 1f));
        		qNumLabel.setForeground(new Color(0f, 0f, 0f, 1f));
        		a1Label.setForeground(new Color(0f, 0f, 0f, 1f));
        		a2Label.setForeground(new Color(0f, 0f, 0f, 1f));
        		
        		playButton.setVisible(false);
        		backLineButton.setVisible(true);
        		navigateLineButton.setVisible(true);
        		backLabel.setVisible(true);
        		navigateLabel.setVisible(true);
        		playLabel.setVisible(true);
        		stopLabel.setVisible(false);
        		
        		answer1Label.setForeground(Color.BLACK);
    			answer1Label.setOpaque(false);
    			answer2Label.setForeground(Color.WHITE);
    			answer2Label.setBackground(Color.BLACK);
    			answer2Label.setOpaque(true);
    		} 
    		
    		
    	//question's listening screen
        //showScreen();
        
    }
}
