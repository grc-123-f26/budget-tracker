import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class BudgetApp {
    public static void main(String[] args) {

        // BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);
        // System.out.println(groceries.getName());
        // System.out.println(groceries.getLimit());
        // System.out.println(groceries.getSpent());
        // System.out.println(groceries);
   
   
        Scanner scan = new Scanner(System.in);
        List<BudgetCategory> categories = new ArrayList<>();

        while(scan.hasNextLine()) {
            String category = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            // Consume \n after spent input 
            if(scan.hasNextLine()) scan.nextLine();

            categories.add(new BudgetCategory(category, limit, spent));
        }

        System.out.println(categories);

        Collections.sort(categories, Collections.reverseOrder());

        System.out.println();
        System.out.println("Sorted from most overspent to least:");
        System.out.println(categories);

        int difference = budgetDifference(categories);
        System.out.println();
        System.out.println("Total over/under budget: " + difference);

        System.out.println();
        System.out.println("Spending chart (each * = $50):");
        printBarChart(categories);
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
        double total = 0;
        for (BudgetCategory category : categories) {
            total += category.getDifference();
        }
        return (int) Math.round(total);
    }

    public static void printBarChart(List<BudgetCategory> categories){
        int longestName = 0;
        for (BudgetCategory category : categories){
            longestName = Math.max(longestName, category.getName().length());
        }

        for (BudgetCategory category : categories) {
            int stars = (int) Math.round(category.getSpent() / 50);
            String label = String.format("%-" + (longestName + 1) + "s", category.getName() + ":");
            System.out.println(label + " | " + "*".repeat(stars));

      }
    }
}
