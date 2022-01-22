
package prisontest;

public class PrisonTest {

    public static void main(String[] args) {
        
        Prisoner bubba = new Prisoner();
        Prisoner twitch = bubba;
        
        bubba.name = "Bubba";
        bubba.height = 2.08;
        bubba.yearsSentenced = 4;
        
        twitch.name = "Twitch";
        twitch.height = 1.73;
        twitch.yearsSentenced = 3;
        
        twitch.name = "Bubba";
        twitch.height = 2.08;
        twitch.yearsSentenced = 4;
        
        System.out.println(bubba==twitch);
        System.out.println(bubba);
        System.out.println(twitch);
        
        String s1 = new String ("Bubba");
        String s2 = new String ("Bubba");
        System.out.println(s1==s2);
        
        String s3 = "Bubba";
        String s4 = "Bubba";
        System.out.println(s3==s4);
    }
    
}
