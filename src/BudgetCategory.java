public class BudgetCategory implements Comparable<BudgetCategory> {
    
    private String category = "";
    private double maxBudgetValue = 0;
    private double actualBudgetValue = 0;

    public BudgetCategory(String submittedCategory, double submittedMaxBudgetValue, double submittedActualBudgetValue)
    {
        this.category = submittedCategory;
        this.maxBudgetValue = submittedMaxBudgetValue;
        this.actualBudgetValue = submittedActualBudgetValue;
    }

    public String toString()
    {
        return category + " was: $" + maxBudgetValue + " but the actual spend was: $" + actualBudgetValue + "\n";
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getMaxBudgetValue() {
        return maxBudgetValue;
    }

    public void setMaxBudgetValue(double maxBudgetValue) {
        this.maxBudgetValue = maxBudgetValue;
    }

    public double getActualBudgetValue() {
        return actualBudgetValue;
    }

    public void setActualBudgetValue(double actualBudgetValue) {
        this.actualBudgetValue = actualBudgetValue;
    }
    
    public int compareTo(BudgetCategory other)
    {
        double firstCompare = this.actualBudgetValue - this.maxBudgetValue;
        double secondCompare = other.actualBudgetValue - other.maxBudgetValue;
        if (firstCompare < secondCompare)
        {
            return -1;
        }
        if (firstCompare == secondCompare)
        {
            return 0;
        }
        return 1;
    }


}