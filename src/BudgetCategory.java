public class BudgetCategory implements Comparable<BudgetCategory>
{
    private String category;
    private double limit;
    private double spent;

    public BudgetCategory(String category, double limit, double spent)
    {
        this.category = category;
        this.limit = limit;
        this.spent = spent;
    }
    
    //For Category
    public String getCategory()
    {
        return category;
    }
    public void setCategory(String category)
    {
        this.category = category;
    }

    //For Limit
    public double getLimit()
    {
        return limit;
    }
    public void setLimit(int limit)
    {
        this.limit = limit;
    }

    //For spent
    public double getSpent()
    {
        return spent;
    }
    public void setSpent(int spent)
    {
        this.spent = spent;
    }
    
    //String
    public String toString()
    {
        return "Category: " + category + "; Limit: " + limit + "; Spent: " + spent;
    }

    //This one for compare:
    public int compareTo(BudgetCategory other)
    {
        //This Difference
       double myDifference;
       myDifference = this.spent - this.limit; 

       //Other Difference
       double OtherDifference;
       OtherDifference = other.spent - other.limit;
       
        // To coparing this to other
        if(myDifference < OtherDifference)
        {
            return -1;
        }
        if(myDifference == OtherDifference)
        {
            return 0;
        }
        return 1;
    }
}
