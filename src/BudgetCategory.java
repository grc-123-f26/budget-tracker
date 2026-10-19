public class BudgetCategory implements Comparable<BudgetCategory> {

    private String name;
    private double limit;
    private double spent;

    public BudgetCategory(String name, double limit, double spent){
        this.name = name;
        this.limit = limit;
        this.spent = spent;
    }

    public String toString(){
        return name+" Budget: $"+limit+" Spent: $"+spent;
    }

    public int compareTo(BudgetCategory other){
        double diff = limit-spent;
        double otherdiff = other.limit-other.spent;
        if(diff<otherdiff){
            return 1;
        }
        if(diff==otherdiff){
            return 0;
        }
        return -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getSpent() {
        return spent;
    }

    public void setSpent(double spent) {
        this.spent = spent;
    }
    
}