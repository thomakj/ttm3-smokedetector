package no.ntnu.student.client;

import hydna.ntnu.student.api.HydnaApi;
import hydna.ntnu.student.listener.api.HydnaListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionController implements ActionListener {
	
	private HydnaListener listener;
	private HydnaApi hydnaSvC;
	public ActionController(final HydnaApi hydnaSvc) {
		this.hydnaSvC = hydnaSvc;
		this.listener = new HydnaListener() {
			
			@Override
			public void systemMessage(String msg) {
				System.out.println("got sysmsg: "+msg);
			}
			
			@Override
			public void signalRecieved(String msg) {
				System.out.println("got signal: "+msg);
			}
			
			@Override
			public void messageRecieved(String msg) {
				if (msg.equals("hei")) {
					
				System.out.println("got msg: "+msg);
				hydnaSvc.sendMessage("paa deg");
				}	
				else if(msg.equals("Fire controlled")){
					hydnaSvC.sendMessage("lol");
					System.out.println("lol");
					System.out.println(msg);
				}
			}
		};
		
		hydnaSvc.registerListener(this.listener);
		hydnaSvc.connectChannel("testdomain.hydna.net/room", "rwe");
		hydnaSvc.emitSignal("SINGALS CLIENT");
		hydnaSvc.sendMessage("hei");
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("Fire button")) {
			hydnaSvC.sendMessage("Fire controlled");
		}
		System.out.println("EVENT SKJEDDE");
		
	}

}
