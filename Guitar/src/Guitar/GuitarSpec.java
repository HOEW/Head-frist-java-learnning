package Guitar;

import Enum.Bulder; 

import Enum.Model;
import Enum.Type;
import Enum.Wood;

public class GuitarSpec {
  Bulder builder;
  Model model;
  Type type;
  Wood backWood;
  Wood topWoodp;
  private String serialNumber;
  public GuitarSpec(Bulder builder, Model model,Type type,Wood backWood,Wood topWood,String serialNumber) {
	// TODO Auto-generated constructor stub
	  this.builder=builder ;
	  this.model=model;
	  this.type=type;
	  this.backWood=backWood;
	  this.topWoodp=topWood;
	  this.serialNumber=serialNumber;
}
  public String getserialNumber(){
	  return serialNumber;
  }
}
