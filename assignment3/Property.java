// -------------------------------------------------------
// Assignment 3
// Written by: Jolson Eric Cruz - 221 9359
// For “Programming Concepts I” Section 87411 and 01211 – Fall 2022
// Submitted on: November 15, 2022
// --------------------------------------------------------

package hw3;

public class Property {    
    private String address;
    private int ZoneCode, NoOfBedrooms, YearOfConstruction, Type;
    private float RiskFactor;
    
    // Constructor 1 (initialization through default values)
    public Property(){
        this.address = "";
        this.ZoneCode = 0;
        this.NoOfBedrooms = 0;
        this.YearOfConstruction = 0;
        this.Type = 0;
        this.RiskFactor = 0;
    }
    
    // Constructor 2 (initialization through passed variables)
    public Property(String address, int ZoneCode, int NoOfBedrooms, int YearOfConstruction, int Type, float RiskFactor){
        this.address = address;
        this.ZoneCode = ZoneCode;
        this.NoOfBedrooms = NoOfBedrooms;
        this.YearOfConstruction = YearOfConstruction;
        this.Type = Type;
        this.RiskFactor = RiskFactor;
    }
    
    // Getter Methods
    public String getAddress() {
        return address;
    }

    public int getZoneCode() {
        return ZoneCode;
    }

    public int getNoOfBedrooms() {
        return NoOfBedrooms;
    }

    public int getYearOfConstruction() {
        return YearOfConstruction;
    }

    public int getType() {
        return Type;
    }

    public float getRiskFactor() {
        return RiskFactor;
    }
    
    // Setter Methods
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setZoneCode(int ZoneCode) {
        if(ZoneCode < 1 || ZoneCode > 3){
            System.out.print("Invalid ZoneCode! Exitting program...");
            System.exit(0);
        }
        else
            this.ZoneCode = ZoneCode;
    }

    public void setNoOfBedrooms(int NoOfBedrooms) {
        this.NoOfBedrooms = NoOfBedrooms;
    }
    
    public void setYearOfConstruction(int YearOfConstruction) {
        this.YearOfConstruction = YearOfConstruction;
    }
    
    public void setType(int Type) {
        if(Type != 1 && Type != 2){
            System.out.print("Invalid Type! Exitting program...");
            System.exit(0);
        }
        else
            this.Type = Type;
    }
    
    public void setRiskFactor(float RiskFactor) {
        if(RiskFactor < 0.0 || RiskFactor > 1.0){
            System.out.print("Invalid RiskFactor! Exitting program...");
            System.exit(0);
        }
        else
            this.RiskFactor = RiskFactor;
    }
    
    // ToString Method
    @Override
    public String toString(){
        String stringType;
        
        if (this.Type == 1)
            stringType = "Condo";
        else
            stringType = "SFHome";
        
        return "Type: " + stringType + 
               "\nAddress: " + this.address + 
               "\nZone: " + this.ZoneCode + 
               "\nNumber of Bedrooms: " + this.NoOfBedrooms +
               "\nYear of Construction: " + this.YearOfConstruction +
               "\nR Factor: " + this.RiskFactor; 
    }
    
    // Equal Method
    public boolean equals(Property propertyObject){
        return ((this.address.equals(propertyObject.address)) && 
                (this.ZoneCode == propertyObject.ZoneCode) && 
                (this.NoOfBedrooms == propertyObject.NoOfBedrooms) && 
                (this.YearOfConstruction == propertyObject.YearOfConstruction) &&
                (this.Type == propertyObject.Type) &&
                (this.RiskFactor == propertyObject.RiskFactor));
    }
    
    // AnalyzeInvestment Method
    public double AnalyzeInvestment(){
        return this.RiskFactor * 50;
    }
    
    // EvaluatePrice Method
    public double EvaluatePrice(){
        int BasePrice;
        
        if(this.Type == 1){
            BasePrice = switch (this.ZoneCode) {
                case 1 -> 300000;
                case 2 -> 200000;
                default -> 100000;
            };
        }
        else{
            BasePrice = switch (this.ZoneCode) {
                case 1 -> 500000;
                case 2 -> 400000;
                default -> 300000;
            };
        }
        
        return BasePrice + (0.05 * BasePrice * this.NoOfBedrooms) + (this.YearOfConstruction * 100) / 2;
    }
}
