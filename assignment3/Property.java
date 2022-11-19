package assignment3;

public class Property {

  private String address;
  private int ZoneCode;
  private int NoOfBedrooms;
  private int YearOfConstruction;
  private double RiskFactor;
  private int Type;

  public void Initialize(){
    address = "";
    ZoneCode = 0;
    NoOfBedrooms = 0;
    YearOfConstruction = 0000;
    RiskFactor = 0.0;
    Type = 1;
  }

  public void SetAttributes(String newAddress, int newZoneCode, int newNoOfBedrooms, int newYearOfConstruction, double newRiskFactor, int newType){
    address = newAddress;
    ZoneCode = newZoneCode;
    NoOfBedrooms = newNoOfBedrooms;
    YearOfConstruction = newYearOfConstruction;
    RiskFactor = newRiskFactor;
    Type = newType;
  }

  public double getRiskFactor(){
    return RiskFactor;
  }

  public void setRiskFactor(double newRiskFactor){
    this.RiskFactor = newRiskFactor;
  }

  public int getZoneCode(){
    return ZoneCode;
  }

  public void setZoneCode(int newZoneCode){
    this.ZoneCode = newZoneCode;
  }

  public int getType(){
    return Type;
  }

  public void setType(int newType){
    this.Type = newType;
  }

  public String toString(){
    System.out.println("Address: " + address);
    System.out.println("Zone Code: " + ZoneCode);
    System.out.println("No. of Bedrooms: " + NoOfBedrooms);
    System.out.println("Year of Construction: " + YearOfConstruction);
    System.out.println("Risk Factor: " + RiskFactor);
    System.out.println("Type: " + ((Type == 1) ? "Condo" : "SF Home"));
  }
    
}
