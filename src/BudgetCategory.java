public class BudgetCategory {
   // Instance variables as private
    private String name;
    private double limit;
    private double spent;

    // Constructors
    public BudgetCategory(String name, double limit, double spent){
      this.name = name;
      this.limit = limit;
      this.spent = spent;
    }
    // Getter
    public String getName(){
      return name;
    }
    public double getLimit(){
      return limit;
    }
    public double getSpent(){
      return spent;
    }

    // toString
    @Override 
    public String toString(){
      String limitString = String.format("$%.2f", limit);
      String spentString = String.format("$%.2f", spent);
      return name + " :limit " + limitString + ", spent " + spentString;
    }

}