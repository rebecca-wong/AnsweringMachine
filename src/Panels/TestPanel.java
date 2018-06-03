package Panels;

import javax.swing.*;

public class TestPanel extends Panel {
    public TestPanel(JPanel screens) {
        super(screens);
    }

    public void gui() {
        this.add(new JButton("Button 1"));
        this.add(new JButton("Button 2"));
        this.add(new JButton("Button 3"));
    }

    public void setOptions() {

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

	@Override
	public void shown() {
		// TODO Auto-generated method stub
		
	}
}
