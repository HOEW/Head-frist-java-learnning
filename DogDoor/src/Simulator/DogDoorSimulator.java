package Simulator;

import Bark.Bark;
import DogDoor.DogDoor;
import Remote.BarkRecognizer;
//import Remote.Remote;

public class DogDoorSimulator {
  @SuppressWarnings("static-access")
public static void main(String []args ){
	  Bark bark1=new Bark("wangwang");
	  Bark bark2=new Bark("wangwang1");
	  Bark openBarks=new Bark("wangwang");
	  DogDoor door= new DogDoor();
	  door.addAllowedBark(bark1);
	  door.addAllowedBark(bark2);
	 // Remote remote=new Remote(door);
	  BarkRecognizer barkRecognizer=new BarkRecognizer(door);
	  System.out.println("wangwang");
	  barkRecognizer.recognoise(openBarks);
	  System.out.println("the dog has been inside");
	  try {
		   Thread.currentThread().sleep(10000);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("The dog has not go insise");
	}
	  System.out.println("dog brak to go outside");
	  barkRecognizer.recognoise(openBarks);
  }
}
