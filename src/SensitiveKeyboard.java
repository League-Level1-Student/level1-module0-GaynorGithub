import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class SensitiveKeyboard implements KeyListener {
	public static void main(String[] args) {
		SensitiveKeyboard key = new SensitiveKeyboard();
		key.keyboard();
	}
	
	void keyboard() {
		JFrame frame = new JFrame();
		frame.addKeyListener(this);
		frame.setVisible(true);
		frame.pack();
	}
	
	static void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	          }
	     }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e);
		speak("Ouch");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	}

