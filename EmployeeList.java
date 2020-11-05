import java.util.*;

public class EmployeeList
{
	public static LinkedList<Employee> reverseOrder(LinkedList<Employee> employees)
	{
		LinkedList<Employee> temp = new LinkedList<Employee>();
		for(int counter = employees.size() - 1;counter >= 0;counter--)
		{
			temp.add(employees.get(counter));
		}	
		return temp;
	}
	
	public static void displayListContents(LinkedList<Employee> employees)
	{
    	System.out.println("\nLinked list size is: " + employees.size());	
    	for (int i = 0; i < employees.size(); i++)
		{
			System.out.println(employees.get(i).toString());
		}
		System.out.println();	// just to to make things look nice!
	}
	
	public static void removeEveryOther(LinkedList<Employee> employees)
	{
		for (int i = 0; i < employees.size(); i = i + 1)
		{
			employees.remove(i);			
		}
	}
	
	public static void displayYearlySalaries(LinkedList<Employee> employees)
	{
		double total = 0.0;
    	for (int i = 0; i < employees.size(); i++)
		{
			total = total + employees.get(i).getMonthlySalary();
		}
		
		total = total * 12;
		
    	for (int i = 0; i < employees.size(); i++)
		{
			total = total + employees.get(i).getBonusAmount();
		}
		
		System.out.println("Total Yearly Salaries plus Bonuses: " + total);
	}
	
	public static void draw(LinkedList<Employee> employees)
	{
		for(int counter = 0;counter < employees.size();counter++)
		{
			System.out.println("________________________________________");
			System.out.println(employees.get(counter));
			System.out.println("________________________________________");
			if(counter != employees.size() - 1)
			{
				System.out.println("			|");
				System.out.println("			|");
				System.out.println("			|");
				System.out.println("			V");
			}
		}
	}

}