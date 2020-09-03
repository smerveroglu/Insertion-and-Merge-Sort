//-----------------------------------------------------
// Title: Insertion Sort of Double Array
// Author: Sevdi Merve Eroglu
// Description: This class tests the insertion sort for double array
//-----------------------------------------------------

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Insertionsort_double {
	public static void insertionsort (Double[] a)
	/* Summary: Sorting double array that is given according to insertion sort.
	   Precondition: a is double array.
	   Postcondition: Elements of array sorted ascending.
	*/   	
	{ 
	int N = a.length;
	for (int i = 1; i < N; i++)
	{ 
	//Check a[i] is bigger than a[i-1],a[i-2],.. and then 
	//insert a[i] among other element that is smaller than a[i].
	for (int j = i; j > 0 && less(a[j], a[j-1]); j--)  
	exch(a, j, j-1);         // Exchange a[j] and a[j-1].
	}
	}
	private static void exch(Double[] a, int j, int i) 
	{
	/* Summary: Exchanging elements of array.
	   Precondition: a is double array, j and i are integer.
	   Postcondition: Elements of array(a[i],a[j]) exchanged.
	*/ 
		double temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	private static boolean less(double a, double a2) 
	{
	// Checking condition of variables,if a<a2,then retun. 
		return a<a2;
	}
	public static void print(Double[] a)
	{
	// Printing elments of double array. 
		for (int i = 0; i < a.length; i++)
	        {
			
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) throws FileNotFoundException
	 {
	// Scannig text file. Declaring length of array(N) is first line , 
	// and other lines are elements of array.

		Scanner scanner	=new Scanner(new File("dtall.txt"));
		int	N	=scanner.nextInt();
		Double[] arr	=new Double [N];
		for	(int i=	0; i<N ; i++)
		arr[i]	= scanner.nextDouble();
	// Calling insertion and print method for sorting and print arr.
		insertionsort(arr);
		print(arr);
	}


}
