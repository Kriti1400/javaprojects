public class TestClass {
    
    public static void main(String args[]){
     
        ComputeMethods comp = new ComputeMethods();
        
        //Runs the code from ComputeMethods
        System.out.println("Temp in celsius is " + comp.fToC(100.4));
        System.out.println("Hypotenuse is " + comp.hypotenuse(3, 4));
        System.out.println("The sum of the dice values is " + comp.roll());
        
    }
}
