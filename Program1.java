//Shane Eire Byrne DAT305
package DAT305Assingments;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.List;

/**
 *   Resource: Ch. 3, "Testing and Debugging", of Data Structures: Abstraction and Design Using Java.
 *   Complete the Exercises for Section 3.2, Programming #1, in Ch. 3, "Testing and Debugging", of Data Structures:
 *   Abstraction and Design Using Java.
 *
 *   Write a search method with four parameters: the search array, the target, the start subscript,
 *   and the finish subscript. The last two parameters indicate the part of the array that should be searched.
 *   Your method should catch or throw exceptions where warranted.
 **/

public class Program1<T>
{
    private T[] type;

    public Program1(T[] type)
    {
        this.type = type;
    }

    public  Boolean search(T[] type, T target, int beginingIndex, int endIndex) throws NoSuchElementException,
                                                                                 ArithmeticException,
                                                                                 ArrayIndexOutOfBoundsException,
                                                                                 IllegalArgumentException,
                                                                                 NullPointerException,
                                                                                 Exception
    {
        List<T> list = Arrays.asList(type);
        Boolean present = false;
        int startIndex = 0;
        int finIndex = 0;
        startIndex = beginingIndex;
        finIndex = endIndex;
     for(startIndex = beginingIndex; startIndex > finIndex; startIndex ++)
        {
           present = list.contains(target);
        }

      return present;
    }

    public static void main(String[] args)
    {
        String[] ziel = { "Potato", "Apple", "Pear","Banana", "Strawberry"};

        Program1 test = new Program1(ziel);
        try
        {
            System.out.println(test.search(ziel, "Apple", 1, 6 ));
        }
        catch(NoSuchElementException e)
        {
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("No idea what the problem is, but you done gone and broke it!");
        }

     }
}
