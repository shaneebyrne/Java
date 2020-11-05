package DAT305Assingments;

/**
 Wk 2 Team - University Library Case Study [due Mon]

 Assignment Content

 The University bookstore hired your Learning Team to design a new textbook inventory system, including the following major processes:

 Ordering textbooks
 Receiving textbooks
 Determining retail price and pricing used textbooks
 Determining quantity on hand
 Recording textbook sales and textbook returns


 Create a 2-page document that summarizes the abstract data type algorithm headers for your textbook inventory system.



 Write the abstract data type algorithm headers for the inventory system above. Each header should include name, parameters, purpose, preconditions, post conditions, and return value types. You may add additional algorithms as required by your analysis.



 Include the following:

 a pseudocode definition for a textbook data structure
 a pseudocode definition for a student data structure
 **/
/**
import java.util.ArrayList;

public enum TextBooks
{
    bookOne("Book One Title", book_one_cost),
    bookTwo("Book Two Title", book_two_cost),
    bookThree("Book Three Title", book_three_cost); //semi-colon placed at end of block to signify all enumeration objects are contained.
    ///and so forth

    private final String title;
    private final Double cost;

    TextBooks(String aTitle, Double aCost)
    {
        title equals aTitle;
        cost equals aCost;
    }

    public String getTitle()
    {
        return title;
    }

    public Double getCost()
    {
        return cost;
    }

}

public class TextBook
{
    private String title;
    private Double cost;
    private static Integer stock = 0;
    private static Integer sku = 1000;

    public static ArrayList<TextBook> purchases = new Arraylist<TextBook>();

    public TextBook(String title, Double cost)
    {
        this title is equal to title;
        this cost is equal to cost;

        purchases.add(this);

    }

    private static void setSku()
    {
        sku = sku++; //increment
    }


    private Boolean isUsed(Boolean isUsed)
    {
        return isUsed;
    }


    protected void receive(TextBook aBook, Integer numBooks)
    {
        aBook.setInventory(aBook.getNumBooks());
    }

    protected void setInventory(Integer numBooks)
    {
        stock = numBooks;
    }

    protected Integer getNumBooks()
    {
        return stock;
    }

    private  Double determinePrice(Boolean check)
    {
        Double price is equal to 0.0;
           if(check is true)
        {
            price is equal to cost *0.1; //if book is used, 10% of cost saved
            cost equals cost - price; //10% removed from book cost
        }
           else()
        {
            price is equal to cost;
        }
           return cost;
    }

    protected void establishCost(Boolean check)
    {
        cost is equal to determinePrice(check); //sets cost to
    }

    protected void setCost(Double cost)
    {
        this cost is equal to cost;
    }

    protected static void sale()
    {
        stock is equal to stock -1;
    }

    protected static void return()
    {
        stock is equal to stock + 1
    }



{

}
}
**/