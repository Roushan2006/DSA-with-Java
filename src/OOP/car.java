package OOP;

public class car  extends Vehicle{
   public int noOfDoors;
   public String transmissionType;


   car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType){
       this.noOfDoors = noOfDoors;
       this.transmissionType = transmissionType;
       super(name, model, noOfTyres);
   }

   public void startAc(){
       System.out.println("Ac started of " + name);
   }
}