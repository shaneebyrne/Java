/**CS-111 LECTURE NOTES; 04/20/2016

AN ARRAY COLLECTS A SEQUENCE OF VALUES OF THE SAME TYPE.

CREATE AN ARRAY THAT CAN HOLD TEN VALUE OF TYPE DOUBLE:
new double[10]

THE NUMBER OF ELEMENTS IS THE LENGTH OF THE ARRAW
THE NEW OPERATOR CONSTRUCTS THE ARRAY


ACCESS AN ARRAY USING THE "[ ]" OPERATOR; SPECIFY THE SLOT YOU DESIRE TO USE.

MAXIMUM SIZE VS ACTUAL SIZE

OPERATOR []: value[4] = 35;

(4 DENOTES 5TH LOCATION WITH IN THE ARRY. START FROM 0.)

TO PASS AN ARRAY TO A METHOD, YOU PASS THE REFRENCE (ESTABLISHED VARIABLE FOR THE ARRAY).

PASSING ARRAY CAN LEAD TO A PRIVACY LEAK.

TO CONSTRUCT AN ARRAY: new typeName[length];
TO ACCESS AN ELEMENT: arrayRefrence[index];

CONTENTS OF ARRAY ARE IDENTIFIED BY THEIR INDEX LOCATION.

int[] numbers = new int[10]; //an array of ten integers. All elements are initialized with zero.

final int LENGTH =10;
int[]  numbers = new int[LENGTH]; ..good idea to use a name constant instead of a "magic number"

int length = in.nextINt();
double[] data = new double[length];   //non constant length

int[] squares = {   };			// an array of 5 integers

String[] friends = {   };		//an array of 5 strings


int[] scores = {   };
int[] values = scores;//copying array refrence

array can be modified through either of the variables

values = scores refrences the same thing.

array can occur as method arguments and return values.

an array as a method argument 

public void addScores(int[] values)
{
	for(int i = 0; 0 < values.length; i++)
	{
		totalScore = totalScore + values[i];
	}
}


To call this method.
int[score] = [ ];
fred.addScores(scores);

a method with an array return value
public int[] getScores() //returns a refrence; could be null.




PARTUALLY FILLED ARRAYS

array length = maximum number of elements in array; usually array is partually filled.

define an array larger then you need.


ex:

int currentSize = 0;
Scanner in = new Scanner(System.in);
while(in.hasNextDouble())
{
	if(currentSize < values.length)
	{
		values[currentSize] = in.nextDouble();
		currentSize++;	
	}
}


at the of the loop, current size contines the actual elements use within the array.

to process the gathered array elements, use the companion variable, not the array length.

to get last item in aray ex:

values[0] = 10;
values[9] = 10;
values[values.length-1] = 10;


Parallel array into array of objects

do not do this:

int[] accountNumbers;
double[] balances;

Make parallel arrays into arrays of objects

avoid using parallel arrays by changes them into arrays of objects;

BankAccount[] accounts; //BankAccounts(object) accountNumber(parameter of object), balance (parameter of object)

example:

BankAccount[] ba = new BankAccount[20];

for(int i = 0; i<20; i++)
	{
		accounts[i] = new BankAccount();
	}


Enhaned for loop

an enhanced for loop can be used to visit all elements of an array.

double[] values =  . . .;
double total = 0;
for(double element: values)
{
	total = total + element;
}

loop body is executes for each element in the array values.

read loop as "for each element in values"

tradtional alternative:

for(int i = 0; i < values.length; i++)
{
	double element = values[i];
	total = total + element;

}


using a basid for loop

for (int i = 0; i < values.length; i++)
{
	values[i] 0;
}




int counter = 0

for(double element: values) 
{
	if(element == 0) {values++} // counts values within an array
}


double average = o; 
if(values.length > 0 [ average = total/ values.length;}



LAB: PROBLEM 5; PAGE 420


Two methods needed.

main  to test method
*/










   */
	public class StandardDeviaton
	
{
	
	public static double standardDeviation(double[] array)
	{
		
		return 0;
	}
	
	public static double findStandardDeviation(double[] testArray )
	{
		return 0;
	}
	
	public static void main(String[] args)
	{
		
		
		double[] array = { 0 , 1 , 2, 3, 4, 5};
		double total = 0;
		
		
		for (double element : array)
		{
			total = total + element;
		}
		
		
		double std = standardDeviation(array);
		System.out.println(std);
		
		
	}
	

}
