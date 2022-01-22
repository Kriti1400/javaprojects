
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        ArrayList<Integer> h = new ArrayList<>();   
        ArrayList<Integer> w = new ArrayList<>();
        
        for(int i = 1; i <= N+1; i++) {
            h.add(in.nextInt());
        }
        
        for(int i = 1; i <= N; i++) {
            w.add(in.nextInt());
        }
        
        double areaTotal = 0;
        double b1;
        double b2;
        double w1;
        
        for (int i=0; i<=N; i++){
            b1 = h.get(i);
            if (i==N){
                w1 = 0;
                b2 = 1;
            }
            else{
                w1 = w.get(i);
                b2 = h.get(i+1);
            }
            double area = ((b1+b2)*w1)/2;
            areaTotal = areaTotal + area;
        }
    
        System.out.println(areaTotal);
    }
}