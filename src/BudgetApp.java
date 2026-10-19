import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

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

            for (int i = 0; i <catagories.size(); i++) {
                System.out.println(catagories.get(i));
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
        // TODO: You will implement this method in Wave 4
        // Note that this method SHOULD NOT have a print statement.
        // It should instead return the value.
        return -1;
    }
}
