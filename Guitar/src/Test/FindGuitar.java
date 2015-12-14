package Test;

import java.util.ArrayList;

import Enum.Bulder;
import Enum.Model;
import Enum.Type;
import Enum.Wood;
import Guitar.Guitar;
import Guitar.GuitarSpec;
import Guitar.Invertory;

public class FindGuitar {
  public static void main(String agrs[]){
	  Invertory invertory =new Invertory();
	  GuitarSpec newGuitar=new GuitarSpec(Bulder.FENDER,Model.XUHUI,Type.ELECTRIC,Wood.COCOBOLO, Wood.CEDAR,"fdafaf");
	  invertory.addGuitar("fdfd", 12500, newGuitar);
	  GuitarSpec sGuitar =new GuitarSpec(Bulder.FENDER,Model.XUHUI,Type.ELECTRIC,Wood.COCOBOLO, Wood.CEDAR,"fdafaf");
	  ArrayList<Guitar> Endlist=invertory.search(sGuitar);
	  if(Endlist!=null){
		  System.out.println(Endlist);
	  }
	  
	  else {
		System.out.println("Ã»ÓÐÆ¥ÅäµÄ");
	}
  }
}
