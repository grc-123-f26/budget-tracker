import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class BudgetApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //BudgetCategory rent = new BudgetCategory("Rent", 2050.00, 2050.00);
        //System.out.print(rent);
        String finalStatement = "";
        List<BudgetCategory> sortedDifferenceofBudgets = new ArrayList<>();

         while(scan.hasNextLine()) {
            String category = scan.nextLine();

            double limit = scan.nextDouble();
            if(scan.hasNextLine())
            {
                scan.nextLine();
            }
            double spent = scan.nextDouble();
            if(scan.hasNextLine())
            {
                scan.nextLine();
            }

            BudgetCategory newCategory = new BudgetCategory(category, limit, spent);
            sortedDifferenceofBudgets.add(newCategory);
            finalStatement += (newCategory);
        }
        Collections.sort(sortedDifferenceofBudgets, Comparator.reverseOrder());
        
        // System.out.println(finalStatement);
       
        System.out.println(sortedDifferenceofBudgets);
        System.out.println(budgetDifference(sortedDifferenceofBudgets));
        System.out.println(overUnderAverage(sortedDifferenceofBudgets));
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
        double budgetSum = 0.0;
        double budgetSumTotal = 0.0;
        for (int i = 0; i < categories.size(); i++)
        {
            budgetSum += categories.get(i).getActualBudgetValue();
            budgetSumTotal += categories.get(i).getMaxBudgetValue();

        }

        return (int) Math.round(budgetSum - budgetSumTotal);
    }

    public static String overUnderAverage(List<BudgetCategory> categories)
    {
        double under = 0.0;
        double underCount = 0.0;
        double over = 0.0;
        double overCount = 0.0;
        for(int i = 0; i < categories.size(); i++)
        {
            if(categories.get(i).getActualBudgetValue() < categories.get(i).getMaxBudgetValue())
            {
                under += categories.get(i).getActualBudgetValue();
                underCount++;
            }
            else if(categories.get(i).getActualBudgetValue() == categories.get(i).getMaxBudgetValue())
            {
                continue;
            }
            else
            {
                over += categories.get(i).getActualBudgetValue();
                overCount++;
            }
        }

        return "Out of " + categories.size() + " Categories. " + "You have and under average of " + (under / underCount) + " and an over average of " + (over / overCount) + ".\n";
    }
}
