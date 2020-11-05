public class EnumDemo
{
	enum WorkDay {MONDAY, TUESDAY, WEDNESDAY, THRSDAY, FRIDAY};
	
	public static void main(String[] args)
	{
		//WorkDay is a type
		//WorkDay can only be assinged to the given names; WorkDate is limited to fixed values.
		//Enumeration is the third type that variables can have.
		WorkDay startDay = WorkDay.MONDAY;
		WorkDay endDay = WorkDay.FRIDAY;
		
		System.out.println("Work starts on " + startDay);
		System.out.println("Work ends on " + endDay);
	}
}
