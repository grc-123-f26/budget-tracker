public class BudgetCategory {
    
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
        return category + "was : $" + maxBudgetValue + " but thge actual spend was $" + actualBudgetValue + "\n";
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
    

}