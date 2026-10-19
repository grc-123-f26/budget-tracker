public class BudgetCategory implements Comparable<BudgetCategory> {
    private String name;
    private double limit;
    private double spent;
 
    public BudgetCategory(String name, double limit, double spent) {
        this.name = name;
        this.limit = limit;
        this.spent = spent;
    }
 
    public String getName() {
        return name;
    }
 
    public double getLimit() {
        return limit;
    }
 
    public double getSpent() {
        return spent;
    }
 
    /*
     Returns how much over/under budget this category is.
     Positive means over budget, negative means under budget.
     */
    public double getDifference() {
        return spent - limit;
    }
 
    public int compareTo(BudgetCategory other) {
        return Double.compare(this.getDifference(), other.getDifference());
    }
 
    public String toString() {
        return String.format("%s: limit $%.2f, spent $%.2f (%s$%.2f)",
                name, limit, spent, getDifference() >= 0 ? "+" : "-", Math.abs(getDifference()));
    }
}
 