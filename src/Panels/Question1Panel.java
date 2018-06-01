package Panels;

import java.awt.Font;
import java.awt.Image;

import javax.swing.*;

public class Question1Panel extends Panel {
	
	JLabel questionLabel1;
	JLabel questionLabel2;
	JLabel responsesLabel;
	JButton questionNumberButton;
	ImageIcon q1Image;
	JButton upArrowButton;
	ImageIcon upArrowImage;
	JButton downArrowButton;
	ImageIcon downArrowImage;
	JButton browseButton;
	ImageIcon browseImage;
	JButton navigateButton;
	ImageIcon navigateImage;
	JButton recordButton;
	ImageIcon recordImage;
	
    public Question1Panel(JPanel screens) {
        super(screens);
    }

    public void gui() {
    	
    		///// Make labels ///////
    		questionLabel1 = new JLabel("\"What class do I need to take before I "); 
		questionLabel2 = new JLabel("graduate within the design major?\"");
		responsesLabel = new JLabel("13 responses"); 

    	
		/////// Make Buttons /////////
		//question 1 image
		q1Image = new ImageIcon(this.getClass().getResource("/q1.png"));
		questionNumberButton = new JButton();
		questionNumberButton.setBorder(BorderFactory.createEmptyBorder());
		
		//up arrow button. CHANGE TO UP ARROW LATER
		upArrowImage = new ImageIcon(this.getClass().getResource("/Arrow_Down.png"));
		upArrowButton = new JButton();
		upArrowButton.setBorder(BorderFactory.createEmptyBorder());
		
		//down arrow button.
		downArrowImage = new ImageIcon(this.getClass().getResource("/Arrow_Down.png"));
		downArrowButton = new JButton();
		downArrowButton.setBorder(BorderFactory.createEmptyBorder());
		
		//browse button
		browseImage = new ImageIcon(this.getClass().getResource("/BROWSE.png"));
		browseButton = new JButton();
		browseButton.setBorder(BorderFactory.createEmptyBorder());
		
		//Navigate button
		navigateImage = new ImageIcon(this.getClass().getResource("/NAV.png"));
		navigateButton = new JButton();
		navigateButton.setBorder(BorderFactory.createEmptyBorder());
		
		//Record button CHANGE BUTTON TO RECORD LATER
		recordImage = new ImageIcon(this.getClass().getResource("/RECORD.png"));
		recordButton = new JButton();
		recordButton.setBorder(BorderFactory.createEmptyBorder());
    	
		
        ////////Add Components to this//////////
		this.add(questionLabel1);
		this.add(questionLabel2);
		this.add(responsesLabel);
		this.add(questionNumberButton);
		this.add(upArrowButton);
		this.add(downArrowButton);
		this.add(browseButton);
		this.add(navigateButton);
		this.add(recordButton);
    }

    public void setOptions() {
    		SpringLayout sl = (SpringLayout) this.getLayout();
    		
		questionLabel1.setFont(new Font("Helvetica Neue", Font.BOLD, this.fontSize(30)));
        sl.putConstraint(SpringLayout.WEST, questionLabel1, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, questionLabel1, this.mainY() + this.scaledY(50), SpringLayout.NORTH, this);
		
		questionLabel2.setFont(new Font("Helvetica Neue", Font.BOLD, this.fontSize(30)));
		sl.putConstraint(SpringLayout.WEST, questionLabel2, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, questionLabel2, this.mainY() + this.scaledY(100), SpringLayout.NORTH, this);
		
		responsesLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, this.fontSize(14)));
		sl.putConstraint(SpringLayout.WEST, responsesLabel, this.mainX(), SpringLayout.WEST, this);
        sl.putConstraint(SpringLayout.NORTH, responsesLabel, this.mainY() + this.scaledY(160), SpringLayout.NORTH, this);
        
        //questionNumberButton
		
		Image img = q1Image.getImage() ;  
		Image newimg = img.getScaledInstance(this.scaledX(150), this.scaledY(50),  java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon q1Image = new ImageIcon( newimg );
		questionNumberButton = new JButton(q1Image);
		
		Image upImg = upArrowImage.getImage() ;  
		Image newUpImg = upImg.getScaledInstance(this.scaledX(20), this.scaledY(50),  java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon upArrowIcon = new ImageIcon( newUpImg );
		upArrowButton = new JButton(upArrowIcon);
		
		Image downImg = downArrowImage.getImage() ;  
		Image newDownImg = downImg.getScaledInstance(this.scaledX(20), this.scaledY(50),  java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon downArrowIcon = new ImageIcon( newDownImg );
		downArrowButton = new JButton(downArrowIcon);
		
		Image browseImg = browseImage.getImage() ;  
		Image newBrowseImg = browseImg.getScaledInstance(this.scaledX(65), this.scaledY(50),  java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon browseIcon = new ImageIcon( newBrowseImg );
		browseButton = new JButton(browseIcon);
		
		Image navigateImg = navigateImage.getImage() ;  
		Image newNavigateImg = navigateImg.getScaledInstance(this.scaledX(65), this.scaledY(50), java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon navigateIcon = new ImageIcon( newNavigateImg);
		navigateButton = new JButton(navigateIcon);
		
		Image recordImg = recordImage.getImage() ;  
		Image newRecordImg = recordImg.getScaledInstance(this.scaledX(65), this.scaledY(50),  java.awt.Image.SCALE_SMOOTH ) ;  
		ImageIcon recordIcon = new ImageIcon( newRecordImg );
		recordButton = new JButton(recordIcon);

    }

    public void PressedUp() {
        System.out.println("Test: UP");
    }

    public void PressedDown() {
        System.out.println("Test: DOWN");
    }

    public void PressedA() {
        System.out.println("Test: A");
    }

    public void PressedB() {
        System.out.println("Test: B");
        showScreen(Panel.WELCOME_PANEL);
    }
}