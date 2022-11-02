package lab9;

public class Lab9Driver {

    public static void main(String[] args) {
        // FRACTION
        Fraction fraction = new Fraction();
        fraction.setFraction(60, 20);
        fraction.Divide();
        fraction.lowestTerm();
        
        //ODOMETER
        Odometer odometer = new Odometer();
        odometer.reset();
        odometer.setFuelEfficiency(10);
        odometer.addMiles(50);
        odometer.getFuelConsumption();
    }
    
}
