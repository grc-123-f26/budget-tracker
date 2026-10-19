public class BudgetCategory implements Comparable<BudgetCategory>{
    private String cat;
    private double budget;
    private double spent;

    public BudgetCategory(String cat, double budget, double spent) {
        this.cat = cat;
        this.budget = budget;
        this.spent = spent;
    }

    public String getCat() {
        return cat;
    }

    public double getBudget() {
        return budget;
    }

    public double getSpent() {
        return spent;
    }

    public String toString() {
        String catStyle = "\n=====================\n" + cat.toUpperCase() + "\n---------------------";
        String budgetStyle = "Budget: $" + budget;
        String actualStyle = "Actual: $" + spent; 
        String budgetPercent = "Budget Used: " + String.format("%.2f", budgetUtilizationPercentage()) + "%";
        String report = catStyle + "\n" + budgetStyle + "\n" + actualStyle + "\n" + budgetPercent;
        return report;
    }

    public int compareTo(BudgetCategory other) {
        if((this.spent - this.budget) < (other.spent - other.budget)) {
            return -1;
        } else if ((this.spent - this.budget) > (other.spent - other.budget)) {
            return 1;
        } else {
            return 0;
        }
        //partner did else statement differently and returns outside the ifs
    }
    public double budgetUtilizationPercentage() {
        return spent/budget * 100;
    }

}