import java.awt.*;

import javax.swing.*;

public class Clock {

	public static void main(String[] args) {
		//Creating a JFrame object to see a frame on screen
		JFrame frame = new JFrame();
		frame.setTitle("Clock");
		frame.setVisible(true);
		frame.setSize(400,500);//400- width and 500-height
		frame.setLocationRelativeTo(null); 
		
		//bringing the title to center
        int spaceCount = 30;
        String title = frame.getTitle();
        String pad = "";
        pad = String.format("%" + spaceCount + "s", pad);
        frame.setTitle(pad + title);
	}

}
