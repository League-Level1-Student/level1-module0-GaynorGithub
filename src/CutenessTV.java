import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	public static void main(String[] args) {
		CutenessTV cu = new CutenessTV();
		cu.showButtons();
	}
	
	void showButtons() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		button1.setFont(new Font("Arial", Font.PLAIN, 30));
		button1.setText("Ducks Video");
		button1.addActionListener(this);
		button2.setFont(new Font("Arial", Font.PLAIN, 30));
		button2.setText("Frogs Video");
		button2.addActionListener(this);
		button3.setFont(new Font("Arial", Font.PLAIN, 30));
		button3.setText("Unicorns Video");
		button3.addActionListener(this);
		frame.pack();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			showDucks();
		}
		else if(e.getSource()==button2) {
			showFrog();
		}
		else if(e.getSource()==button3) {
			showFluffyUnicorns();
		}
	}
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	
}

