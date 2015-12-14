package DogDoor;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import Bark.Bark;

public class DogDoor {
	private boolean Open;
	private Bark bark;
  ArrayList<Bark> Barklist=new ArrayList<>();
	public DogDoor(){
		Open=false;
	}
    public void CloseDoor(){
   	 System.out.println("狗门关上");
   	 Open=false;
    }
     public void OpenDoor(){
    	 System.out.println("狗门打开");
    	 Open=true;
    	 final Timer timer=new Timer();
 		TimerTask timerTask01=new TimerTask() {
 			@Override
 			public void run() {
 				// TODO Auto-generated method stub
 				System.out.println("The door will close soon");
 				CloseDoor();
 				timer.cancel();
 			}
 		};
 		timer.schedule(timerTask01, 5000);
     }
     public  boolean isOpen() {
		return Open;
	}
     public void addAllowedBark(Bark Bark){
    	 Barklist.add(bark);
     }
    public ArrayList<Bark> getAllowedBarks(){
		if(Barklist!=null){
		return  Barklist;
		}else 
			return null;	
	}
}
