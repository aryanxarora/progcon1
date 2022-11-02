package lab9;

public class Fraction {
    
    private int num;
    private int den;
    private double quo;
    
    public void setFraction(int newNum, int newDen){
        num = newNum;
        den = newDen;
        System.out.println("Fraction: " + newNum + " / " + newDen);
    }
    
    public void Divide(){
        quo = (int)this.num/this.den;
        System.out.println("Quotient: " + quo);
    }
    
    public void lowestTerm(){
        int gcd = getGCD(num, den);
        System.out.println("Lowest Term: " + num/gcd + " / " + den/gcd);
    }
    
    public int getGCD(int a, int b){
        if(b == 0){
            return a;
        }
        return getGCD(b, a % b);
    }
    
}
