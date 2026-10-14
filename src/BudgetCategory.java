import java.util.*;

public class BudgetCategory implements Comparable<BudgetCategory> {
    private String category;
    private double limit;
    private double spent;

    public BudgetCategory(String category, double limit, double spent) {
        this.category = category;
        this.limit = limit;
        this.spent = spent;
    }

    public String getCategory() {
        return category;
    }

    public double getLimit() {
        return limit;
    }

    public double getSpent() {
        return spent;
    }
    public void setCategory(String category) {
        this.category = category;
    } 

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public void setSpent(double spent) {
        this.spent = spent;
    }

    @Override
    public String toString() {
        return category +
                ": Limit = " + limit +
                ", Spent = " + spent;
    }

    @Override
    public int compareTo(BudgetCategory other) {
        double difference = spent - limit;
        double otherDifference = other.spent - other.limit;
        return Double.compare(difference, otherDifference);
    }
}