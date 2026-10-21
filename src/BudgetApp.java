import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
// import java.util.Scanner;

public class BudgetApp {
    public static void main(String[] args) {

        // BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);
        // System.out.println(groceries);

        // System.out.println("Limit = " + groceries.getLimit());
        
        // Scanner scan = new Scanner(System.in);

        // while(scan.hasNextLine()) {
            // String category = scan.nextLine();

            // double limit = scan.nextDouble();
            // double spent = scan.nextDouble();

            // Consume \n after spent input 
            // if(scan.hasNextLine()) scan.nextLine();

           

            // String limitString = String.format("$%.2f", limit);
            // String spentString = String.format("$%.2f", spent);

            
            

        // }

        List<BudgetCategory> catagories = new ArrayList<>();

            BudgetCategory groceries = new BudgetCategory("Groceries", 500, 499);
            BudgetCategory entertainment = new BudgetCategory("entertainments", 10, 10);
            BudgetCategory pokemonCards = new BudgetCategory("pokemonCards", 100, 20);
            BudgetCategory paperclips = new BudgetCategory("paperclips", 2, 0);
        
            catagories.add(groceries);
            catagories.add(entertainment);
            catagories.add(pokemonCards);
            catagories.add(paperclips);

            catagories.sort(null);

            System.out.println(catagories);

            for (int i = 0; i <catagories.size(); i++) {
                System.out.println(catagories.get(i));
            }

            int overunder = budgetDifference(catagories);
            if(overunder > 0){
                System.out.println("You overspent by " + overunder + "$! Maybe cut back on the " + catagories.get(0).getName());
            } else if (overunder < 0){
                overunder = Math.abs(overunder);
                System.out.println("Looks like you have an extra " + overunder + "$ This month. Good job! Treat yourself by spending some extra on " + catagories.get(catagories.size()-1).getName());
            } else{
                System.out.println("Perfectly Balanced, as all things should be...");
            }

        
    }

    /**
     * Returns overall how much over/under budget a person is given a list of their
     * categories.
     * 
     * This should be the sum of how much over/under budget each individual category is.
     * 
     * If the person is under budget, the result will be negative. If they are over budget, the
     * result will be positive.
     * 
     * @param categories the budget categories with the spend
     * @return the total amount over/under budget
     */
    public static int budgetDifference(List<BudgetCategory> categories) {
        int difference = 0;
        for (int i = 0; i < categories.size(); i++) {
            int holder = categories.get(i).getSpent() - categories.get(i).getLimit();
            difference += holder;
            
        }
        return difference;
    }
}
