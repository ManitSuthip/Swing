package mavenProject.Swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Simple2{
	JFrame f = new JFrame();
	Simple2(){
	 JButton b = new JButton("Click");
	 b.setBounds(10, 20, 200, 50);
	 f.add(b);
	 f.setSize(400, 500);
	 f.setLayout(null);
	 f.setVisible(true);
	}
	public static void main(String[] args) {
		new Simple2();
	}

}

