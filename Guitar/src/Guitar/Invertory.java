package Guitar;
import java.util.ArrayList;

public class Invertory {
  ArrayList<Guitar> Guitarlist = new ArrayList<Guitar>();
  ArrayList<Guitar> MatchGuitar= new ArrayList<Guitar>();
  public void addGuitar(String number,double Price,GuitarSpec guitarSpec) {
	Guitar guitar=new Guitar(number, Price, guitarSpec);
	Guitarlist.add(guitar);
}
  public ArrayList<Guitar> search(GuitarSpec searchGuitar){
	  if(matchGuitar(searchGuitar))
	  {
		  return MatchGuitar;
	  }
	   else {
		      return null;
	        }
  }
  
  public Boolean matchGuitar(GuitarSpec searchGuitar){
	  for(Guitar guitar:Guitarlist){
		  GuitarSpec guitarSpec=guitar.guitarSpec;
		  {
		  if(guitarSpec.builder!=searchGuitar.builder)
			  continue;
		  if(guitarSpec.model!=searchGuitar.model)
			  continue;
		  if(guitarSpec.type!=searchGuitar.type)
			  continue;
		  if (guitarSpec.backWood!=guitarSpec.backWood) 
			 continue;
          if(guitarSpec.topWoodp!=guitarSpec.topWoodp)
        	  continue;
		  }
		  MatchGuitar.add(guitar);
		  return true;
	  }
	  return false;
  }
}
