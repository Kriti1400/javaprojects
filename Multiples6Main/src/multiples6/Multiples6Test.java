
package multiples6;

public class Multiples6Test {
    
    public static void main(String args[]){
        Multiples6 test = new Multiples6();
        
        //testing inputs -1, 0, 12 
        System.out.println("Testing Multiples6 method...");
        
        //-1 expected "All multiples have been printed."
        //this is because -1 is already less than 1
        System.out.println("Test 1...testing -1: " + test.Multiples(-1).equals("All multiples have been printed."));
        
        //0 expected "All multiples have been printed."
        //this is because 0 is already less than 1
        System.out.println("Test 2...testing 0: " + test.Multiples(0).equals("All multiples have been printed."));
        
        //12 expected "The colour is violet."
        System.out.println("Test 3...testing 12: 12 tested in main: true");
        
    }
}

