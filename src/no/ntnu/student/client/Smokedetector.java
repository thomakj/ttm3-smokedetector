package no.ntnu.student.client;

import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.Activate;
import aQute.bnd.annotation.component.Reference;
import hydna.ntnu.student.api.HydnaApi;
import hydna.ntnu.student.listener.api.HydnaListener;

@Component
public class Smokedetector{
	
	private HydnaApi hydnaSvc;
	private HydnaListener listener;
	private FireButton panel;

	
	@Reference
	public void setHydnaApi(HydnaApi hydna) {
		System.out.println("SETTIsNG SERVICSE");
		this.hydnaSvc = hydna;
	}

//	@Override
//	public void testingServices() {
//		System.out.println("YOLOPARK");
//		
//	}
	
	
	@Activate
	public void activate() {
		ActionController acl = new ActionController(hydnaSvc);
		panel = new FireButton(acl);
		
		System.out.println("STARTED");

	}
}