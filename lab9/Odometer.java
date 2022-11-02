package lab9;

public class Odometer {
    
    private int miles;
    private int fuelEfficiency;
    private int gallons;
    
    public void reset(){
        miles = 0;
        gallons = 0;
        System.out.println("Odometer Reseted...");
    }
    
    public void setFuelEfficiency(int newFuelEfficiency){
        fuelEfficiency = newFuelEfficiency;
        System.out.println("Vehicle Efficiency: " + newFuelEfficiency + " miles/gallon");
    }
    
    public void addMiles(int newMiles){
        miles += newMiles;
        gallons += newMiles/fuelEfficiency;
        System.out.println(newMiles + " miles added to the odometer");
    }
    
    public void getFuelConsumption(){
        System.out.println(gallons + " gallons of fuel consumed");
    }
    
}
