public class BudgetCategory implements Comparable<BudgetCategory>{
    private String name;
    private int limit;
    private int spent;

    public BudgetCategory(String name, int limit, int spent){
        this.name = name;
        this.limit = limit;
        this.spent = spent;
    }

    public String getName() {
        return name;
    }

    public int getLimit() {
        return limit;
    }

    public int getSpent() {
        return spent;
    }

    public String toString(){
        return "The budget limit for " + name + " was: $" + limit + " but the actual spend was $" + spent;
    }

    public int compareTo(BudgetCategory other){
        int cat1 = this.getLimit() - this.getSpent();
        int cat2 = other.getLimit() - other.getSpent();
        return Integer.compare(cat1, cat2);

    }
    

    
}