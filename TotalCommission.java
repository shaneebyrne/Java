/*
 * Shane Eire Byrne
 * Dat210
 * Week 3 assingment  
 */

package assingments;

/**
 *
 * @author SEB
 */
public class TotalCommission 
{
    private Double[] sales = new Double[100];
    private final Double SALARY = 30000.00; //Fixed salary variable
    private Double compensation = 0.0;
   
    
       
    public TotalCommission(Double[] sales, Double compensation)
    {
        this.sales = sales;
        this.compensation = compensation;
    }
    
    public Double getCompensation()
    {
        return compensation;
    }
    
    public TotalCommission(Double compensation)
    {
        this.compensation = compensation;
    }
    
    public void setSales(Double[] sales)
    {
        this.sales = sales; 
    }
    
    public void setCompensation(Double compensation)
    {
        this.compensation = compensation;
    }
    
    protected Double calcTotalCompensation()
    {
        this.compensation = this.totalSales(sales) * 1.07;
        Double salary = this.getSalary();
        this.compensation = compensation + salary;
        return compensation;
    }
    
    public double getTotalCommission()
    {
       Double pay =  totalSales(sales) ;
       return pay;
    }
    
        
     protected Double totalSales(Double[] sales) //Adds up one dimentional 
             // Double array toproduce a sum of the contents.
        {
           Double result = 0.0;
           for(Double number: sales)
           {
               result += number;
           }
           
           return result;
        }
                
        protected Double getSalary() //getter for SALARY variable
        {
            return SALARY; 
        }
               
        public String toString() //converts variables to a String.
        {
            return ("Salary: $" + SALARY + "Compensation for Sales: " + 
                     compensation);
        }
    
    //public Double calcCommission() 
    //{
       // Double wage = totalSales(this.sales) * 0.07; //7%
     //   return wage;
    //}
        
    private static int findSum(int source[], int  incrementer)  //to recursively 
            // increment array.
    { 
        if (incrementer <= 0) 
            return 0; 
        return (findSum(source, incrementer- 1) + source[incrementer - 1]); 
    } 
            
    
    
}


/**
 *                                                                 References
 * 
 * Liguori, R., & Liguori, P. (2014). Java 8 pocket Guide: Instant Help for Java Programmers . Sebastopol, CA: O'Reilly Media, Inc..
 * 
 * Koffman, E., & Wolfgang, P. (2010). Data Structures: Abstraction and Design using Java (2nd ed.). Hoboken, NJ: John Wiley & Sons, Inc..
 * 
 * Baesens, B., Backiel, A., & Vanden Broucke, S. (2015). Beginning Java Programming: The Object-Orientated Approach . Indianapolis, In: John Wiley & Sons, Inc.
 * 
 * Savitch, W. (2013). Absolute Java (5th ed.). Upper Saddle River, NJ: Pearson Education, Inc..
 * 
 * Schildt, H. (2014). Java: A Beginner's Guide (6th ed.). New York, NY: McGraw-Hill.
 * 
 * Griffith, A. (1998). Java Master Reference . Foster City, CA: IDG Books Worldwide, Inc..
 * 
 * Oracle Corporation. (2018). Java Platform, Standard Edition 7 API Specification. Retrieved from https://docs.oracle.com/javase/7/docs/api/overview-summary.html
 * 
 */