public class BudgetCategory implements Comparable<BudgetCategory> {
    private String category;
    private double limit;
    private double spending;

    public BudgetCategory(String category, double limit, double spending) {
        this.category = category;
        this.limit = limit;
        this.spending = spending;
    }

    public String getCategory() {
        return category;
    }

    public double getlimit() {
        return limit;
    }

    public double getSpending() {
        return spending;
    }

    // NOTE: partner's toString method varies slightly
    public String toString() {
        return category.toUpperCase() + "\nLimit: " + getlimit() + "\nSpending: " + getSpending() + "\n";
    }

    // NOTE: logic in compareTo method varies from partner slightly
    public int compareTo(BudgetCategory otherCategory) {
        if (limit - spending > otherCategory.limit - otherCategory.spending) {
            return -1;
        } else if (limit - spending == otherCategory.limit - otherCategory.spending) {
            return 0;
        }
    
        return 1;
    }
}