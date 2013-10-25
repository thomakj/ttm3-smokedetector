package no.ntnu.student.client;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.xml.bind.Marshaller.Listener;

public class FireButton extends JFrame{
	
	
	private ActionController client;

	public FireButton(ActionController client){
		this.client = client;
		
        JFrame frame1 = new JFrame("Fire");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JButton button = new JButton("Fire button");
        //Add action listener to button
        button.addActionListener(client);
        
		
        frame1.getContentPane().add(button);
        frame1.pack();
        frame1.setVisible(true);
	}
	
	 public void actionPerformed(ActionEvent e)
     {
         //Execute when button is pressed
     	
         System.out.println("You clicked the button");
     }
	
//	public void firePanel()  {
//		
//        JFrame frame1 = new JFrame("Fire");
//        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 
//        JButton button = new JButton("Fire button");
//        //Add action listener to button
//        button.addActionListener((ActionListener) client);
//        button.addActionListener(new ActionListener() {
// 
//            public void actionPerformed(ActionEvent e)
//            {
//                //Execute when button is pressed
//            	
//                System.out.println("You clicked the button");
//            }
//        });      
// 
//        frame1.getContentPane().add(button);
//        frame1.pack();
//        frame1.setVisible(true);
//    }
 
 
//    public static void main(String[] args) {
//        javax.swing.SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                firePanel();
//            }
//        });
//    }

}
