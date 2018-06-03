package Panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.font.TextAttribute;

import javax.swing.*;

import javafx.scene.chart.PieChart.Data;

public class Q1RecordPanel extends Panel {
	
	JLabel questionLabel1;
	JLabel questionLabel2;
	JLabel responsesLabel;
	JLabel headerQuestion1;
	JLabel headerQuestion2;
	JLabel browseLabel;
	JLabel navigateLabel;
	JLabel recordLabel;
	JButton questionNumberButton;
	ImageIcon q1Image;
	JButton upArrowButton;
	ImageIcon upArrowImage;
	JButton downArrowButton;
	ImageIcon downArrowImage;
	JButton browseLineButton;
	ImageIcon browseLineImage;
	JButton navigateLineButton;
	ImageIcon navigateLineImage;
	JButton recordLineButton;
	ImageIcon recordLineImage;
	
	/*JButton browseButton;
	ImageIcon browseImage;
	JButton navigateButton;
	ImageIcon navigateImage;
	JButton recordButton;
	ImageIcon recordImage;*/

	
    public Q1RecordPanel(JPanel screens) {
        super(screens);
    }

    public void gui() {
    	
    		///// Make labels ///////
    		questionLabel1 = new JLabel("\"What class do I need to take before I "); 
		questionLabel2 = new JLabel("graduate within the design major?\"");
		responsesLabel = new JLabel("2 responses"); 
		headerQuestion1 = new JLabel("Q1");
		headerQuestion2 = new JLabel("OUT OF 10");
		browseLabel = new JLabel("BROWSE");
		navigateLabel = new JLabel("NAVIGATE");
		recordLabel = new JLabel("RECORD");
    	
		/////// Make Buttons /////////
		//question 1 image
		q1Image = new ImageIcon(this.getClass().getResource("/q1.png"));
		questionNumberButton = new JButton();
		questionNumberButton.setBorder(BorderFactory.createEmptyBorder());
		
		//up arrow button. CHANGE TO UP ARROW LATER
		upArrowImage = new ImageIcon(this.getClass().getResource("/Arrow_Up.png"));
		upArrowButton = new JButton();
		upArrowButton.setBorder(BorderFactory.createEmptyBorder());
		
		//down arrow button.
		downArrowImage = new ImageIcon(this.getClass().getResource("/Arrow_Down.png"));
		downArrowButton = new JButton();
		downArrowButton.setBorder(BorderFactory.createEmptyBorder());
		
		//browse button
		browseLineImage = new ImageIcon(this.getClass().getResource("/line_2.png"));
		browseLineButton = new JButton();
		browseLineButton.setBorder(BorderFactory.createEmptyBorder());
		
		//Navigate button
		navigateLineImage = new ImageIcon(this.getClass().getResource("/line_2.png"));
		navigateLineButton = new JButton();
		navigateLineButton.setBorder(BorderFactory.createEmptyBorder());
		
		//Record button 
		recordLineImage = new ImageIcon(this.getClass().getResource("/line_2.png"));
		recordLineButton = new JButton();
		recordLineButton.setBorder(BorderFactory.createEmptyBorder());
    	
		
        ////////Add Components to this//////////
		this.add(questionLabel1);
		this.add(questionLabel2);
		this.add(responsesLabel);
		this.add(upArrowButton);
		this.add(downArrowButton);
		this.add(browseLineButton);
		this.add(navigateLineButton);
		this.add(recordLineButton);
		this.add(headerQuestion1);
		this.add(headerQuestion2);
		this.add(browseLabel);
		this.add(recordLabel);
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
    		
		questionLabel1.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 30));
		questionLabel1.setForeground(new Color(0f, 0f, 0f, 0.2f));
        sl.putConstraint(SpringLayout.WEST, questionLabel1, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, questionLabel1, this.mainY() + this.scaledY(90), SpringLayout.NORTH, this);
		
		questionLabel2.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 30));
		questionLabel2.setForeground(new Color(0f, 0f, 0f, 0.2f));
		sl.putConstraint(SpringLayout.WEST, questionLabel2, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, questionLabel2, this.mainY() + this.scaledY(125), SpringLayout.NORTH, this);
		
		responsesLabel.setFont(this.customFont(TextAttribute.WEIGHT_REGULAR, 14));
		responsesLabel.setForeground(new Color(0f, 0f, 0f, 0.2f));
		sl.putConstraint(SpringLayout.WEST, responsesLabel, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, responsesLabel, this.mainY() + this.scaledY(180), SpringLayout.NORTH, this);
        
        headerQuestion1.setFont(this.customFont(TextAttribute.WEIGHT_REGULAR, 25));
        headerQuestion1.setForeground(new Color(0f, 0f, 0f, 0.2f));
        sl.putConstraint(SpringLayout.WEST, headerQuestion1, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, headerQuestion1, this.mainY(), SpringLayout.NORTH, this);
        
        headerQuestion2.setFont(this.customFont(TextAttribute.WEIGHT_REGULAR, 12));
        headerQuestion2.setForeground(new Color(0f, 0f, 0f, 0.2f));
        sl.putConstraint(SpringLayout.WEST, headerQuestion2, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, headerQuestion2, this.mainY() + this.scaledY(28), SpringLayout.NORTH, this);
        
        browseLabel.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 15));
        browseLabel.setForeground(new Color(0f, 0f, 0f, 0.2f));
        sl.putConstraint(SpringLayout.WEST, browseLabel, this.mainX() + this.scaledX(5), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, browseLabel, this.mainY() + this.scaledY(475), SpringLayout.NORTH, this);
        
        navigateLabel.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 15));
        sl.putConstraint(SpringLayout.WEST, navigateLabel, this.mainX() + this.scaledX(227), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, navigateLabel, this.mainY() + this.scaledY(475), SpringLayout.NORTH, this);
        
        recordLabel.setFont(this.customFont(TextAttribute.WEIGHT_BOLD, 15));
        sl.putConstraint(SpringLayout.WEST, recordLabel, this.mainX() + this.scaledX(455), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, recordLabel, this.mainY() + this.scaledY(475), SpringLayout.NORTH, this);
        
        //sl.putConstraint(SpringLayout.WEST, questionNumberButton, this.mainX(), SpringLayout.WEST, this);
       // sl.putConstraint(SpringLayout.NORTH, questionNumberButton, this.mainY(), SpringLayout.NORTH, this);
		
        sl.putConstraint(SpringLayout.WEST, upArrowButton, this.leftX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, upArrowButton, this.leftY(), SpringLayout.NORTH, this);
        
        sl.putConstraint(SpringLayout.WEST, downArrowButton, this.leftX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, downArrowButton, this.leftY() + this.scaledY(400), SpringLayout.NORTH, this);
        
        sl.putConstraint(SpringLayout.WEST, browseLineButton, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, browseLineButton, 0, SpringLayout.SOUTH, this);
        
        sl.putConstraint(SpringLayout.WEST, navigateLineButton, this.mainX() + this.scaledX(225), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, navigateLineButton, 0, SpringLayout.SOUTH, this);
        
        sl.putConstraint(SpringLayout.WEST, recordLineButton, this.mainX() + this.scaledX(450), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.SOUTH, recordLineButton, 0, SpringLayout.SOUTH, this);
        
		Image img = q1Image.getImage() ;  
		Image newimg = img.getScaledInstance(this.scaledY(150), this.scaledY(50),  java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon q1Image = new ImageIcon( newimg );
		questionNumberButton.setIcon(q1Image);
		
		Image upImg = upArrowImage.getImage() ;  
		Image newUpImg = upImg.getScaledInstance(this.scaledY(20), this.scaledY(50),  java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon upArrowIcon = new ImageIcon( newUpImg );
		upArrowButton.setIcon(upArrowIcon);
	
		Image downImg = downArrowImage.getImage() ;  
		Image newDownImg = downImg.getScaledInstance(this.scaledY(20), this.scaledY(50),  java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon downArrowIcon = new ImageIcon( newDownImg );
		downArrowButton.setIcon(downArrowIcon);
		
		Image browseImg = browseLineImage.getImage() ;  
		Image newBrowseImg = browseImg.getScaledInstance(this.scaledY(65), this.scaledY(50),  java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon browseIcon = new ImageIcon( newBrowseImg );
		browseLineButton.setIcon(browseIcon);
		
		Image navigateImg = navigateLineImage.getImage() ;  
		Image newNavigateImg = navigateImg.getScaledInstance(this.scaledY(65), this.scaledY(50), java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon navigateIcon = new ImageIcon( newNavigateImg);
		navigateLineButton.setIcon(navigateIcon);
		
		Image recordImg = recordLineImage.getImage() ;  
		Image newRecordImg = recordImg.getScaledInstance(this.scaledY(65), this.scaledY(50),  java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon recordIcon = new ImageIcon( newRecordImg );
		recordLineButton.setIcon(recordIcon);

    }

    public void PressedUp() {
    		showScreen(Panel.WELCOME_PANEL);
    }

    public void PressedDown() {
        showScreen(Panel.QUESTION2_PANEL);
    }

    public void PressedA() {
        //go to browse screen
    }

    public void PressedB() {
        showScreen(Panel.THANK_YOU_PANEL);
        
    }
}