//-----------------------------------------------------
// Title: Insertion Sort of Integer Array
// Author: Sevdi Merve Eroglu
// ID: 12505108686
// Section: 1
// Assignment: 2
// Description: This class tests the insertion sort for integer array
//-----------------------------------------------------

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Insertionsort_integer {
	public static void insertionsort (int[] a)
	{ 
	/* Summary: Sorting integer array that is given according to insertion sort.
	   Precondition: a is integer array.
	   Postcondition: Elements of array sorted ascending.
	*/   	
	int N = a.length;
	for (int i = 1; i < N; i++)
	{ 
	//Check a[i] is bigger than a[i-1],a[i-2],.. and then 
	//insert a[i] among other element that is smaller than a[i].
	for (int j = i; j > 0 && less(a[j], a[j-1]); j--)
	exch(a, j, j-1);   // Exchange a[j] and a[j-1].
	}
	}
	private static void exch(int [] a, int j, int i) 
	{
	/* Summary: Exchanging elements of array.
	   Precondition: a is integer array, j and i are integer.
	   Postcondition: Elements of array(a[i],a[j]) exchanged.
	*/ 
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	private static boolean less(int a, int a2) 
	{
	// Checking condition of variables,if a<a2,then retun. 
		return a<a2;
	}
	public static void print(int []a)
	{
	// Printing elments of integer array. 
		for (int i = 0; i < a.length; i++) 
		{
			
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) throws FileNotFoundException 
	{
	// Scanning text file. Declaring length of array(N) is first line , 
	// and other lines are elements of array.
	
		Scanner scanner	=	new Scanner(new File("tall.txt"));
		int	N	=	scanner.nextInt();
		int []	arr	=	new int [N];
		for	(int	i	=	0;	i	<	N;	i++)
		arr[i]	=	scanner.nextInt();
	// Calling insertion and print method for sorting and print arr.
		insertionsort(arr);
		print (arr);

	}


}
