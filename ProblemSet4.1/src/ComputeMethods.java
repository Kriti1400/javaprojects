import java.util.Random;

public class ComputeMethods {
    
    //This finds the temp in celsius
    public double fToC (double degreesF){
        double degreesC = (((degreesF-32)*5)/9);
        return (degreesC);
    }
    
    //This finds the hypotenuse
    public double hypotenuse (int a, int b){
        double c = Math.sqrt((a*a)+(b*b));
        return (c);
    }
    
    //This rolls two dice and finds their sum
    public int roll(){
       Random rand = new Random();
       int num1 = rand.nextInt(6)+1;
       int num2 = rand.nextInt(6)+1;
       return(num1+num2);
        
    }
}
