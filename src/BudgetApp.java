
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BudgetApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<BudgetCategory> categories = new ArrayList<>();

        while (scan.hasNextLine()) {
            String category = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            if (scan.hasNextLine()) {
                scan.nextLine();
            }

            BudgetCategory budgetCategory =
                    new BudgetCategory(category, limit, spent);

            categories.add(budgetCategory);
        }

        // Sort from most overspent to least overspent
        Collections.sort(categories, Collections.reverseOrder());

        System.out.println("Categories from most overspent to least:");

        for (BudgetCategory category : categories) {
            System.out.println(category);
        }

        // Calculate total budget difference
        int difference = budgetDifference(categories);

        
System.out.println("Total budget difference: $" + difference);

// Wave 5: Calculate average budget difference
double average = averageBudgetDifference(categories);

System.out.printf("Average budget difference: $%.2f%n", average);

scan.close();

    }

    /**
     * Returns the total amount over or under budget.
     * Negative means under budget.
     * Positive means over budget.
     */
    public static int budgetDifference(List<BudgetCategory> categories) {
        double total = 0;

        for (BudgetCategory category : categories) {
            total += category.getSpent() - category.getBudget();
        }

        return (int) Math.round(total);
    }
    
public static double averageBudgetDifference(List<BudgetCategory> categories) {
    if (categories.isEmpty()) {
        return 0;
    }

    double total = 0;

    for (BudgetCategory category : categories) {
        total += category.getSpent() - category.getBudget();
    }

    return total / categories.size();
    }

}
