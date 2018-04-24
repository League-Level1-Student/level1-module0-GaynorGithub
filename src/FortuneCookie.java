import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		FortuneCookie cook = new FortuneCookie();
		cook.showButton();
	}
	
	void showButton() {
		System.out.println("Button");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton();
		frame.add(button);
		button.addActionListener(this);
		button.setFont(new Font("Arial", Font.PLAIN, 40));
		button.setText("Open a fortune cookie?");
		
		frame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Woohoo");
		int rand = new Random().nextInt(5);
		if(rand == 0) {
			JOptionPane.showMessageDialog(null, "Fish Tacos lie in your future");
		}
		else if(rand == 1) {
			JOptionPane.showMessageDialog(null, "Cheeseburgers will cause great change in your life");
		}
		else if(rand == 2) {
			JOptionPane.showMessageDialog(null, "Pizza will cause great sadness for you");
		}
		else if(rand == 3) {
			JOptionPane.showMessageDialog(null, "Avoid Spahgetti for a while as you may die");
		}
		else if(rand == 4) {
			JOptionPane.showMessageDialog(null, "After eating Chicken you will buy a winning lottery ticket");
		}
		
		
	}
}
