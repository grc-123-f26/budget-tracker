import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BudgetApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);
       List<BudgetCategory> categories = new ArrayList<BudgetCategory>();
    
        
        while(scan.hasNextLine()) {
            String category = scan.nextLine();
         
            int limit = scan.nextInt();
            int spent = scan.nextInt();
            BudgetCategory budgetCategory = new BudgetCategory(category, limit, spent);
            categories.add(budgetCategory);

            // Consume \n after spent input 
            if(scan.hasNextLine()) scan.nextLine();

            // String limitString = String.format("$%.2f", limit);
            // String spentString = String.format("$%.2f", spent);
            // System.out.println("The budget limit for " + category + " was: " + limitString + 
            //                    " but the actual spend was " + spentString);
        }
        // System.out.println(groceries.toString());
        Collections.sort(categories, Collections.reverseOrder());
        System.out.println(categories.toString());
        System.out.println("Total budget difference: $" + budgetDifference(categories));

    if (!categories.isEmpty()) {
         System.out.printf("Average budget difference: $%.2f%n",
         ( double )budgetDifference( categories) / categories.size());
} else {
    System.out.println("Average budget difference: $0.00");
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
       int totalDifference = 0;
        for (int i = 0; i < categories.size(); i++) {
            BudgetCategory category = categories.get(i);
           totalDifference += (category.getSpent() - category.getLimit());
        }
        return totalDifference;
    }
}
