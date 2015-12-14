package Remote;
import DogDoor.DogDoor;
public class Remote {
	
   private DogDoor dogDoor;
   public Remote(DogDoor dogDoor) {
	this.dogDoor=dogDoor;
}
   public void pressButton(){
	   System.out.println("pression the button");
	   if(dogDoor.isOpen()){
		   dogDoor.CloseDoor();
	   }else {
		dogDoor.OpenDoor();
	}
   }
}
