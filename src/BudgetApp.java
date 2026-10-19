import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BudgetApp {
    public static void main(String[] args) {
        ArrayList<BudgetCategory> categories = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        //BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);
        //System.out.println(groceries.getName() + " " + groceries.getLimit() + " " + groceries.getSpent());
        //System.out.println(groceries);

        while (scan.hasNextLine()) {
            String category = scan.nextLine();
            double limit = scan.nextDouble();
            double spent = scan.nextDouble();
            if (scan.hasNextLine()) scan.nextLine();
            categories.add(new BudgetCategory(category, limit, spent));
            }
        System.out.println(categories);
        Collections.sort(categories, Collections.reverseOrder());
        System.out.println(categories);
        System.out.println(budgetDifference(categories));

        double average = budgetDifference(categories) / categories.size();
        System.out.println("Average over/under: " + String.format("$%.2f", average));
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

    public static double budgetDifference(List<BudgetCategory> categories) {
        double total = 0;
        for (BudgetCategory c : categories) {
        total += c.getSpent() - c.getLimit();
        }
        return total;
    }
}
