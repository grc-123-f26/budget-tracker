public class BudgetCategory implements Comparable<BudgetCategory> {
    private String name;
    private double limit;
    private double spent;

    public BudgetCategory( String name, double limit, double spent){
        this.name = name;
        this.limit = limit;
        this.spent = spent;
    }

     public String getname(){
        return name;
     }
     public double getLimit(){
        return limit;
     }
     public double getSpent(){
        return spent;
     }
     public double getDifference(){
        return spent - limit;
     }
     public int compareTo(BudgetCategory other){
       double thisDiff = getDifference();
       double thatDiff = other.getDifference();
       if(thisDiff > thatDiff){
        return 1;
       } if (thisDiff == thatDiff){
        return 0;}
        return -1;
    }
     public String toString(){
      return "for: " + name + "the budget was: " + limit + " , the amount spent was " + spent;
     }

}