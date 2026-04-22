package OOP;

public class MotorCycle extends  Vehicle{

    public int handle;
    public String suspension;

    MotorCycle(String name, String model, int noOfTyres, int handle, String suspension){
        super(name, model, noOfTyres);
        this.handle = handle;
        this.suspension = suspension;
    }

    public void wheelie(){
        System.out.println("MoterCycle is doing Wheieeeeeeeeeeee!"+ name);
    }
}