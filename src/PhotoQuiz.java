/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame frame = new Frame();
		frame.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
		String url = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2010/4/26/0/FNM_060110-Weeknight-001_s4x3.jpg.rend.hgtvcom.616.462.suffix/1371591159264.jpeg";
		// 2. create a variable of type "Component" that will hold your image
		Component comp;
		// 3. use the "createImage()" method below to initialize your Component
		comp = createImage(url);
		// 4. add the image to the quiz window
		frame.add(comp);
		// 5. call the pack() method on the quiz window
		frame.pack();
		// 6. ask a question that relates to the image
		String ans = JOptionPane.showInputDialog("Are fish tacos amazing?");
		// 7. print "CORRECT" if the user gave the right answer
		// 8. print "INCORRECT" if the answer is wrong
		if(ans.equalsIgnoreCase("yes")) {
			System.out.println("CORRECT");
		}
		else if(ans.equalsIgnoreCase("no")) {
			System.out.println("INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		frame.remove(comp);
		// 10. find another image and create it (might take more than one line of code)
		String url2 = "https://www.redrobin.com/content/dam/web/menu/2015-june/gourmet-cheeseburger-1100.jpg";
		Component comp2;
		comp2 = createImage(url2);
		// 11. add the second image to the quiz window
		frame.add(comp2);
		// 12. pack the quiz window
		frame.pack();
		// 13. ask another question
		String ans2 = JOptionPane.showInputDialog("Are burgers amazing?");
		// 14+ check answer, say if correct or incorrect, etc.
		if(ans2.equalsIgnoreCase("yes")) {
			System.out.println("CORRECT");
		}
		else if(ans2.equalsIgnoreCase("no")) {
			System.out.println("INCORRECT");
		}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





