
public class BudgetCategory {

    private String name;
    private double budget;
    private double spent;

    public BudgetCategory(String name, double budget, double spent) {
        this.name = name;
        this.budget = budget;
        this.spent = spent;
    }

    public String getName() {
        return name;
    }

    public double getBudget() {
        return budget;
    }

    public double getSpent() {
        return spent;
    }

    @Override
    public String toString() {
        return name + ": Budget = $" + budget
                + ", Spent = $" + spent;
    }
}
