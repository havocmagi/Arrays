
public class ArrayOps 
{
	private int [] data;
	
	public ArrayOps(int [] d)
	{
		data=d;
	}
	
	public String toString()
	{
		String a="";
		for(int i=0; i<data.length; i++)
		{
			a+=data[i]+" ";
		}
		return a;
	}
	
	public void reverse()
	{
		for(int i=0; i<data.length/2; i++)
		{
			int tmp = data[i];
			data[i] = data[data.length-1-i];
			data[data.length-1-i] = tmp;
		}
	}
	
	public int findMin()
	{
		int mindex=0;
		for(int i=1; i<data.length; i++)
		{
			if(data[i]<data[mindex])
				mindex=i;
		}
		return mindex;
	}
	
	public static void main( String [] args )
	{
	int [] input = { 0, 1, -2, -3, 4, 5, -6, -7, 8, 9 };
	ArrayOps testObj = new ArrayOps( input ); // constructor
	System.out.println("Object's index for the smallest value is: " + testObj.findMin());
	// 1. Reference the toString-method and print the array.
	System.out.println(testObj.toString());
	// 2. Reference the reverse-method to the array order.
	testObj.reverse();
	// 3. Reference the toString-method to display the reversed array.
	System.out.println(testObj.toString());
	// 4. Reference the findMin-method to return the index of the smallest value stored in the reversed array:
	int mindex = testObj.findMin();
	System.out.println("Object's index for the smallest value after reverse is : " + mindex );
	}
}
