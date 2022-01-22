
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        int K = in.nextInt();
        
        ArrayList<Integer> R = new ArrayList<>();   
        ArrayList<Integer> C = new ArrayList<>();
        
        for(int i = 1; i <=K; i++) {
            String place = in.next();
            if (place == "R"){
                R.add(in.nextInt());
            }
            else {
                C.add(in.nextInt());
            }
            //R.add(i);
            //C.add(i);
            //System.out.println(place);
        }
        
        System.out.println(R);
        System.out.println(C);
        
        /*Thinking for solution to question:
            after having sorted all input, the R and C would be
            compared and if they are equal, they would 
            not be counted. The resulted sum would
            be the ones that were not repeated,thus the gold ones*/
    }
}
