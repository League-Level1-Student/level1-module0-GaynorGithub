import java.applet.AudioClip;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	public static void main(String[] args) {
		SoundEffects se = new SoundEffects();
		se.buttons();
		
		
	}
	
	void buttons() {		
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		button1.setFont(new Font("Arial", Font.PLAIN, 30));
		button1.setText("Sawing Wood Sound Effect");
		button1.addActionListener(this);
		button2.setFont(new Font("Arial", Font.PLAIN, 30));
		button2.setText("Hom-rur Simsun Wahoo");
		button2.addActionListener(this);
		button3.setFont(new Font("Arial", Font.PLAIN, 30));
		button3.setText("Club Air Horn");
		button3.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
	}
	
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			playSound("sawing-wood-daniel_simon.wav");
		}
		else if(e.getSource()==button2) {
			playSound("homer-woohoo.wav");
		}
		else if(e.getSource()==button3) {
			playSound("414208__jacksonacademyashmore__airhorn.wav");
		}
		
	}

}
