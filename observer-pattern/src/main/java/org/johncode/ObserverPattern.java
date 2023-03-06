package org.johncode;


import org.johncode.implementations.Creator;
import org.johncode.implementations.Viewer;

public class ObserverPattern {
	public static void main(String[] args) {
		Creator creator = new Creator();
		Viewer viewer1= new Viewer(creator,"John","Triantafyllakis");
		Viewer viewer2=new Viewer(creator,"Bob","Bobopoulos");
		Viewer viewer3=new Viewer(creator,"Alice","Alicandra");

		creator.setVideoTitle("New video is out 🔥 !1ST!");
		creator.setVideoTitle("Another video is now online! !2ND!");
		//John Triantafyllakis bored AF with the previous two videos..
		creator.unregister(viewer1);
		creator.setVideoTitle("Last video for this month! !3rd!");
	}
}