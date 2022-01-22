package problemset03;
 //* @author kap14
import javax.swing.JOptionPane;

public class ProblemSet03 {

    public static void main(String[] args) {
        //Introduction
        JOptionPane.showMessageDialog(null,"Welcome! Please answer a few "
                + "questions to get your meal.");
        
        //Name, age, and items user wants
        String inputName = JOptionPane.showInputDialog((String)"Enter your name:");
        int inputAge = Integer.parseInt(JOptionPane.showInputDialog((String)"Enter your age:"));
        String inputMeal = JOptionPane.showInputDialog((String)"Hello " + inputName
        + ", what would you like to eat?");
        String inputDrink = JOptionPane.showInputDialog((String)"What would you like to drink?");
        
        //Choose diet with options
        String[] acceptableValues = {"meat", "vegetarian", "vegan"};
        String inputDiet = (String)JOptionPane.showInputDialog(null,
                "Choose the option that best suits you.",
                "Diet Analysis",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
        
        //Number of servings,drinks, and tip
        int inputServings1 = Integer.parseInt(JOptionPane.showInputDialog((String)
                "How many " + "serving of food would you like?"));
        int inputServings2 = Integer.parseInt(JOptionPane.showInputDialog((String)
                "How many " + "drinks do you want?"));
        double inputTip = Double.parseDouble(JOptionPane.showInputDialog((String)
                "Enter the amount you " + "would like to tip:"));
        
        //Unchangeabe variables
        final double FOOD = 10.0;
        final double DRINK = 5.0;
        final double TAX = 1.13;
        
        //Calculations
        double Price = (((FOOD*inputServings1)+(DRINK*inputServings2))*TAX);
        double finalPrice = (Price + inputTip);
        
        //Ending questions
        String inputOrder = JOptionPane.showInputDialog((String)"Would you like to "
                + "dine in or take out?");
        String[] acceptableValues2 = {"cash", "debit", "credit"};
        String inputPayment = (String)JOptionPane.showInputDialog(null,
                "How will you be paying?",
                "Payment",
                2,
                null,
                acceptableValues2,
                acceptableValues2[1]);
        String inputService = JOptionPane.showInputDialog((String)"Please rate your service "
                + "from 1-10");
        JOptionPane.showMessageDialog(null,"Congratulations! Your receipt is ready! "
                + "Click ok to view it.");
        
        //Conclusion
        JOptionPane.showMessageDialog(null,inputName + " has ordered " + inputServings1 
                + " servings of " + inputDiet + " " + inputMeal + ".\n" +
                "The " + inputAge + " year old has ordered " + inputServings2 +
                " servings of " + inputDrink + ".\n" + "The total is $" + finalPrice +
                " and will be paid using " + inputPayment + ".\n" + "This is a " +
                inputOrder + " order and the service rating is " + inputService + ".\n" +
                "Have a great day and please come again!");
    }
    
}

