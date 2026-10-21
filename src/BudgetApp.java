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

            BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);
            BudgetCategory entertainment = new BudgetCategory("entertainments", 10, 5);
            BudgetCategory pokemonCards = new BudgetCategory("pokemonCards", 100, 600);
            BudgetCategory paperclips = new BudgetCategory("paperclips", 2, 10000);
        
            catagories.add(groceries);
            catagories.add(entertainment);
            catagories.add(pokemonCards);
            catagories.add(paperclips);

            catagories.sort(null);

            System.out.println(catagories);

            for (int i = 0; i <catagories.size(); i++) {
                System.out.println(catagories.get(i));
            }

            System.out.println(budgetDifference(catagories));

        
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
