/*
 * Shane Eire Byrne
 * Dat210
 * Week 3 assingment  
 */


/*
* You work for a software company has just created a new incentive for 
* salespeople to earn a commission on each sale. 
* The current program only allows for a fixed salary. The Chief Information
* Officer (CIO) has asked you to create a 
* new program that allows the functionality for a fixed salary and commission. 

* Write a Java® application, using NetBeans IDE, that calculates the total 
* annual compensation of a salesperson. 

* Consider the following:

* A salesperson will earn a fixed salary of $30,000.
* A salesperson will also receive a commission as a sales incentive. 
* Commission is a percentage of the 
* salesperson's annual sales. The current commission is 7% of total sales.
* The total annual compensation is the fixed salary plus the commission earned. 
* The Java® application should meet the following technical requirements:

* The application should have at least one class, in addition to the 
* application's controlling class. 
* (A controlling class is where the main function resides).
* A file needs to be created to contain the output.
* There should be proper documentation in the source code.
* The application should ask the user to enter annual sales, and it
* should display the total annual compensation. 
* Compile your Java® application files into a ZIP folder. 
 */

package assingments;
//possibly build a GUI if time permits
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
//end GUI imports
import java.awt.event.ActionListener; //grab users input
import java.io.BufferedReader;
//File import and outport handeling
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//end file and import handeling
import java.text.*; //For formatting output text to read as currency
import java.util.*;

//Might need for calculations and conversion of ArrayList
import java.util.Collection;
import java.util.Iterator;
// end storage

//exception flags
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
//end exception flags
 

/**
 *
 * @author SEB
 */
public class Assingments 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
     System.out.println("Total Annual Compensation Calculator ");   
     //Gui aGui = new Gui();
     Assingments anAssingment = new Assingments();    
     ArrayList<Double> list = new ArrayList<Double>(); //Arraylist to pass sales to,
                    //generic parmeter so list will only take data type double.
     
     DecimalFormat df = new DecimalFormat(); 
     
     df.applyPattern("$###,###,###.##"); //Pattern for calculation to be set to.
                  
     //System.out.println("Enter a double: ");
     //Double input = scan.nextDouble();
     //System.out.println(input);
     
     Double[] totalSales;
     
     Boolean check = false;
     
     Scanner input = new Scanner(System.in); //scanner is created, System.in 
                           //takes user  entered information from the console.
     String choice;   
     ArrayList stringList = new ArrayList();
     while (!check)  //Check acts as key for while loop, if check remains false
                   //the user remains in the loop
      {
        
         System.out.print("Enter sales figures, enter Q to quit when done: ");
         choice = input.next(); //console takes next String the user enters
         if (choice.equalsIgnoreCase("Q")) 
//If user enters Q into the console the program sets check to true to terminate
//the loop.
         {
            check = true; //sets check to true, loop is exited.
            input.close(); //Closes the scanner.
         }
         else
         {
            Double temp = Double.parseDouble(choice); //number entered is parsed
                                                      //back into a Double.
            list.add(temp); //number entered is added to the arraylist.
            String sale = df.format(temp); //places formatted prices in 
                                     //seperate Array list to send to textfile.
            stringList.add(sale);
         }
     } 
     
      
   //  System.out.println("Calculatted Commission: ");
    
    Double sum = 0.0;
   
   // for(Double d : list)
   // {
 //  //     sum = d + sum;
    //}
    //System.out.println(sum);
               
     totalSales = list.toArray(new Double[list.size()]);  
//Array List cast to Double Array.
     
    //for(int i = 0; i>totalSales.length;i++)
    //{
    //    System.out.println("Sale: " + totalSales[i]);
   // }
     
     
     TotalCommission aCommission = new TotalCommission(totalSales, sum); 
//Double array provided as argument for TotalCommission
     //System.out.println(aCommission.totalSales(totalSales));
     //System.out.println( aCommission.getCompensation());
              
     Double totSales = 0.0;
            totSales = aCommission.totalSales(totalSales);
     //System.out.println(totSales);
     
     sum = aCommission.totalSales(totalSales);
     
     System.out.println(sum);
     
     //aCommission.setCompensation(sum);
     aCommission.setSales(totalSales);
     
     //System.out.println(aCommission.calcCommission(totalSales));
     //System.out.println(aCommission.getTotalCommission());
     //System.out.println(aCommission.totalSales(totalSales));
     
     
     System.out.println("Total commission from sales: " +
                        df.format(totSales));
     
     try
     {    
       anAssingment.createFile(stringList);

     } 
     catch (IndexOutOfBoundsException e)
     {
       System.err.println("IndexOutOfBoundsException: " + e.getMessage());
     }
        catch (IOException e) 
     {
       System.err.println("Caught IOException: " + e.getMessage());
     }
     
     System.out.println("Here are your entries: ");
     ArrayList<String> saved;  //To store entries in text file.
     saved = anAssingment.readFile();
     for(String recording : saved)
         //enhanced for loop to print data loaded into the arraylist.
     {
         System.out.println(recording);
     }
     
     System.out.println("Your total compensation is:");
     
    
    //System.out.println(aCommission.getTotalCommission());
    //System.out.println(aCommission.getSalary());
    //System.out.println(list.toString());
   // for(int i = 0; i > totalSales.length;i++)
    //{
    //    System.out.println(totalSales[i]);
   // }
     
     Double totalCompensation = aCommission.calcTotalCompensation();
     
     //Double verify = aCommission.getCompensation() + aCommission.getSalary();
     
     //System.out.println(verify);
     
     System.out.println(df.format(totalCompensation));
     
   
   } 
     private void createFile(ArrayList arrData) throws IOException
     {
        FileWriter writer = new FileWriter("Sales Records.txt");
        int size = arrData.size();
        for (int i=0;i<size;i++)
        {
            String load = arrData.get(i).toString();
            writer.write(load);
            if(i < size-1)
                //This prevent creating a blank like at the end of the file**
               writer.write("\n");
        }
        writer.close();
     }
     
     public ArrayList<String> readFile()  //method to 
     {
         
       ArrayList<String> record = new ArrayList<String>();
        try 
        {
            BufferedReader buffer = new BufferedReader(new FileReader
                                    ("Sales Records.txt"));
        
            String currentLine;

            while ((currentLine = buffer.readLine()) != null) 
            {
                record.add(currentLine);
            }

        } 
        catch (IOException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
        
        return record;
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