package DAT305Assingments;
/**
public class Libary<T>
{
   private TextBook book;
   private Stack<TextBook> biblioteca;
   private Stack<TextBook> found;

   public Libary(Stack<TextBook> biblioteca)
   {
          this biblioteca) is equal to biblioteca; //sets TextBook Stack data type for Libary class
   }

       // Recursive Method to insert an item x in sorted way 
    static void sortedInsert(Stack<Integer> shelf, Book aBook) 
    { 
        // Base case: Either stack is empty or newly inserted 
        // item is greater than top (more than all existing) 
        if (shelf is empty or  a book is greater then shelf's top of stack))  //isEmpty(), and peek() methods of Stack can be used to accomplish this
        { 
            shelf push book; //puts inserted book at top of stack
            return; 
        } 
       
        // If top is greater, remove the top item and recur 
        book temp = shelf pop book();  //pops book at to of stack off
        sortedInsert(shelf, book); //Shelf and book are inserted, comparison takes place again. 
       
        // Put back the top item removed earlier 
        self push(temp); //pushes temp back on stack using Stack's push() method 
    } 
       
    // Method to sort stack 
    static void sortStack(Stack<TextBook> shelf) 
    { 
        // If stack is not empty 
        if (shelf is empty) //isEmpty() method of Stack can be used to check 
        { 
            // Remove the top item 
            TextBook aBook = shelf pop; //top book "popped" off stack; pop() method of Stack used 
       
            // Sort remaining stack 
            sortStack(shelf); 
       
            // Push the top item back in sorted stack 
            sortedInsert(shelf, aBook); 
        } 
    } 
      
    // Utility Method to print contents of stack 
    static void printStack(Stack<TextBook> shelf) 
    { 
       ListIterator<TextBook> iterator = shelf listIterator();  //listIterator() method of ListIterator used 
         
       // forwarding 
       while(iterator hasNext()) //hasNext() method of ListIterator looks for next element of list 
           iterator next(); //next() pulls next element of list 
         
       // printing from top to bottom 
       while(iterator hasPrevious()) //pulls previous elements of list 
           System.out.print( iterator previous()+" ");  //ListIterator previous() method pulls prior element
    } 

    public boolean contains(Textbook findMe) //checks to even see if book is in the stack
    {
    for (int i is equal to 0; i is less then biblioteca size(); i++) (iterates through stack of textbooks looking for title.
    {
        if (bibloteca[TextBook at index] is equal to(findMe)) //iteration through stack. Textbook object's toString() method used to compair to target string. 
    {
            return true; //if found true, true is returned.
        }
        return false;
      }

      public Stack<TextBook> searchByTitle(String title) 
    {
       Integer numBooks is equal to 0;
       found= new Stack<TextBook>
       for (integer i is equal to 0; i is less then biblioteca size(); i++) //for loop iterates through stack object looking for book title
       {
       if (biblioteca[TextBook at index .getTitle()].titleContains(title)) //check if stack has title being searched for
       {
          found[TextBook index] push(biblioteca [TextBook index]; //found book pushed onto search stack
           numBooks++;
       }
    }

       Integer bookCounter = 0;

    for (int i = 0; i < found size(); i++)
        {
        if (found[ TextBook at index].titleContains(title))
       {
            selection[bookCounter] = found[TextBook at index]; //counts off number of books found
            bookCounter++;
        }
    }
    return found;
}

 public Stack<TextBook> searchByAuthor(String author)
{
       Integer numBooks is equal to 0;
       found= new Stack<TextBook>
       for (integer i is equal to 0; i is less then biblioteca size(); i++) //for loop iterates through stack object looking for book title
       {
       if (biblioteca[TextBook at index .getAuthor()].titleContains(title)) //check if stack has author being searched for
       {
          found[TextBook index] push(biblioteca [TextBook index]; //found book pushed onto search stack
           numBooks++;
       }
    }

       Integer bookCounter = 0;

    for (int i = 0; i < found size(); i++)
        {
        if (found[ TextBook at index].titleContains(title))
       {
            selection[bookCounter] = found[TextBook at index]; //counts off number of books found
            bookCounter++;
        }
    }
    return found;

    public Stack<TextBook> searchByAuthor(String any) //takes any string argument and iterates through stack looking for it.
{
       Integer numBooks is equal to 0;
       found= new Stack<TextBook>
       for (integer i is equal to 0; i is less then biblioteca size(); i++) //for loop iterates through stack object looking for book title
       {
       if (biblioteca[TextBook at index .getTitle()].titleContains(title)) //check if stack has author being searched for
       {
          found[TextBook index] push(biblioteca [TextBook index]; //found book pushed onto search stack
           numBooks++;
       }
       else(biblioteca[TextBook at index .getAuthor()].titleContains(author)) //check if stack has author being searched for
       {
          found[TextBook index] push(biblioteca [TextBook index]; //found book pushed onto search stack
           numBooks++;
       }

       else(found[TextBook index] push(biblioteca [TextBook index]; //found book pushed onto search stack
           numBooks++;

    }

       Integer bookCounter = 0;

    for (int i = 0; i < found size(); i++)
        {
        if (found[ TextBook at index].titleContains(title))
       {
            selection[bookCounter] = found[TextBook at index]; //counts off number of books found
            bookCounter++;
        }
    }
    return found;

   public T divideAndConquer(Stack<TextBook> biblioteca, Integer left, Integer right, T target) 
    { 
        if (r >= l) { 
            Integer mid = l + (right- l) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (biblioteca[object at middle index] is equal to target) 
                return mid; //index of middle point returned 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (biblioteca[object at index] is equal to target) 
                return divideAndConquer(biblioteca, mid decrement one, target); 
  
            // Else the element can only be present 
            // in right subarray 
            return divideAndConquer(biblioteca, mid increment one, right, target); 
        } 
  
        // We reach here when element is not present 
        // in stack
        return negative one;  //negative one indicates no data in stack 
    } 
}
**/