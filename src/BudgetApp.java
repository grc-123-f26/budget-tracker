import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BudgetApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<BudgetCategory> categories = new ArrayList<>();
        int idx = 0;
        
        while (scanner.hasNextLine()) {
            String categoryStr = scanner.nextLine();
            double limit = scanner.nextDouble();
            double spent = scanner.nextDouble();
            BudgetCategory category = new BudgetCategory(categoryStr, limit, spent);
            
            if (scanner.hasNextLine()) scanner.nextLine();
            
            // add category to categories ArrayList
            categories.add(idx, category);
            
            // print individual categories
            System.out.println(categories.get(idx));
            
            // increase idx each iteration
            idx++;
        }
        
        // sort the categories ArrayList in reverse order
        Collections.sort(categories, Collections.reverseOrder());
        
        // print categories in reverse order based on how much over or under a budget is a for a particular category
        System.out.println("*** How much over or under the budget is for a particular category - REVERSE ORDER ***");
        for (BudgetCategory category : categories) {
            System.out.println(category);
        }
        
        // print the sum of each budget difference for each category
        System.out.println("Budget difference: "+ budgetDifference(categories) + "\n");

        // calculate and print the budget used for each category as a percentage
        budgetUtilizationPercentage(categories);
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
        int sum = 0;

        for (BudgetCategory category : categories) {
            sum += category.getlimit() - category.getSpending();
        }
        return sum;
    }


    /**
     * Calculates the budget used for each category individually as a percentage and prints values to console.
     * 
     * For example, if the spending for a particular category was 50.0 and the budget was 100.0, 
     * then the percent of the budget for that particular category used is 50.0%.
     * 
     * This method does not calculate the overall budget percentage used across all categories together nor
     * does it calculate the percentage over or under budget a particular category is.
     * 
     * NOTE: this method was implemented differently by partner and is implemented in their BudgetCategory.java class instead of this class
     * 
     * @param categories the list of budget categories
     */
    public static void budgetUtilizationPercentage(List<BudgetCategory> categories) {
        double fractionalBudgetUsed = 0.0;
        double percentageBudgetUsed = 0.0;

        System.out.println("*** Overall % Budget Used for Each Category ***");
        for (BudgetCategory category : categories) {
            fractionalBudgetUsed = category.getSpending() / category.getlimit();
            percentageBudgetUsed = fractionalBudgetUsed * 100.0;
            
            
            System.out.println(category.getCategory().toUpperCase() + ": " + String.format("%.2f", percentageBudgetUsed) + "%");
        }
        System.out.println("");
    }
}
