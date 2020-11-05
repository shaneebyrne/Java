package DAT305Assingments;

import java.util.Random;
import java.util.Stack;
import java.util.Date;

/**public class Student
{
    private String name;
    private Random random = new Random(2000);
    private final Integer IDNUM = random.nextInt(); //random generated number based off seed value.
    private  Stack<TextBook> list = new Stack<TextBook>();
    private String address;
    private Integer phoneNum;
    private Random transaction = new Random(1000000);
    private Long creditCard = random.nextLong();
    private Double cost;
    private Date orderDate;



    public Student(String name)
    {
        this name equals name;
    }

    public  void addBook(TextBook book)
    {
        list.push(book); //pushes textbook on top of stack.
    }


    public Integer getIdNum()
    {
        return IDNUM;
    }

    public  String getBillingInfo()
    {
        String billing;
        billing is equal to name + "/m" + IDNUM + "/n" + phoneNum + "/n" + address;
        return billing;
    }

    public void setBilling(Integer phoneNum, String address)
    {
        this phoneNum is equal to phoneNum;
        this address is equal to address;
    }

   public void payment(Arraylist<TextBook> list)
   {
       Double holder is equal to 0.0;
       Boolean purchase is false;
       for (Integer counter = 0; counter is less than list.size(); counter increments)
       {
           holder = list[counter.getPrice() + holder;
       }
       cost is equal to holder;
       if(ordered is true)
       {
           purchase is true;
       }
       else
       {
           purchase = false;
       }
       orderDate is equal to  getDate(purchase);
   }

   private Boolean ordered()
   {
       Boolean tracker = false;
       if(cost is greater then 0.0)
       {
           tracker is true;
       }
       else
       {
           tracker is false;
       }
       return tracker;

   }

   private Date getDate(Boolean check)
   {
       Date aDate;
       if(check is false)
       {
         aDate = null;
       }
       else
       {
           aDate = new Date(2019,12,1);
       }

       return aDate;
   }








}
**/