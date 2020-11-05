import java.util.Scanner;
public class Employee
{
	/**** INSTANCE VAR ******/
	
	private double monthlySalary;
	private double bonusAmount;
	private int    yearsWorked;
	private String name;
	private int    age;
	
	/**** CONSTRUCTORS *****/
	
	public Employee()
	{
	}
	
	public Employee(double monthlySalary, double bonusAmount, int yearsWorked,
					String name, int age)
	{
		this.setMonthlySalary(monthlySalary);
		this.setBonusAmount(bonusAmount);
		this.setYearsWorked(yearsWorked);
		this.setName(name);
		this.setAge(age);
	}
	
	/**** MUTATORS METHODS ****/
	
	public void setMonthlySalary(double monthlySalary)
	{
		this.monthlySalary = monthlySalary;
	}
	
	public void setBonusAmount(double bonusAmount)
	{
		this.bonusAmount = bonusAmount;
	}
	
	public void setYearsWorked(int yearsWorked)
	{
		this.yearsWorked = yearsWorked;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	/**** ACESSOR METHODS ****/
	
	public double getMonthlySalary()
	{
		return this.monthlySalary;
	}
	
	public double getBonusAmount()
	{
		return this.bonusAmount;
	}
	
	public int getYearsWorked()
	{
		return this.yearsWorked;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	/**** OTHER REQUIRED ****/
	
	public String toString()
	{
		return "|Employee Name: " + this.getName() + "\n|Age: " + this.getAge() +
			   "\n|Salary: " + this.getMonthlySalary() + "\n|Bonus Amount " + 
			   this.getBonusAmount() + "\n|has worked here for " + this.getAge() +
			   " years.";
	}
	
	
	public boolean equals(Object other)
	{
		Employee otherEmployee;
		
		otherEmployee = (Employee) other;
		
		if(other == null)
		{
			return false;
		}
		else if( other instanceof Employee)
		{
			return false;
		}
		else
		{
			return this.name.equals(otherEmployee.name) &&
			this.age == otherEmployee.age &&
			this.monthlySalary == otherEmployee.monthlySalary && 
			this.bonusAmount == otherEmployee.bonusAmount &&
			this.yearsWorked == otherEmployee.yearsWorked;
		}
	}
	
	public static Employee createEmployee (Scanner keyboard)
	{
		String name;
		String temp;
		int    age;
		double monthlySalary;
		double bonusAmount;
		int    yearsWorked;
		
		System.out.println("What is employee's name?");
		name = keyboard.nextLine();
		
		System.out.println("What is employee's age?");
		temp = keyboard.nextLine();
		age  = Integer.parseInt(temp);
		
		System.out.println("What is employee's monthly salary?");
		temp = keyboard.nextLine();
		monthlySalary  = Double.parseDouble(temp);
		
		System.out.println("What is employee's bonus amount?");
		temp = keyboard.nextLine();
		bonusAmount  = Double.parseDouble(temp);
		
		System.out.println("How many years has employee worked here?");
		temp = keyboard.nextLine();
		yearsWorked  = Integer.parseInt(temp);
		
	/*	this.setMonthlySalary(monthlySalary);
		this.setBonusAmount(bonusAmount);
		this.setYearsWorked(yearsWorked);
		this.setName(name);
		this.setAge(age);*/
		
		return new Employee(monthlySalary,bonusAmount,yearsWorked,name,age);
		
	}
}





