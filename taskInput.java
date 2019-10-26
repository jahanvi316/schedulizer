package schedulizer;

import javax.swing.*;

public class taskInput {
	public static void main(String args[]){
		JFrame frame = new JFrame("Task");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,300);
		JButton button = new JButton("Submit");
		frame.getContentPane().add(button);
		frame.setVisibible(true);
	}
}
