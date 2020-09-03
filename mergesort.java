//-----------------------------------------------------
// Title: Merge Sort of Integer Array
// Author: Sevdi Merve Eroglu
// Description: This class tests the merge sort for integer array
//-----------------------------------------------------

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class mergesort {
	private static int [] aux; // Creating new array
	public static void sort(int [] a)
	{
	//Constructing aux; and sorting with sort method.
	aux = new int [a.length]; 
	sort(a, 0, a.length - 1);
	}
	private static void sort(int [] a, int lo, int hi)
	{
	// Halve array and Sort a[lo..hi].
	if (hi <= lo) return;
	int mid = lo + (hi - lo)/2;
	// Sort left half
	sort(a, lo, mid); 
	// Sort right half.
	sort(a, mid+1, hi);
	// Merge the array 
	merge(a, lo, mid, hi);
	}
	public static void merge(int [] a, int lo, int mid, int hi)
	{
	// Merge a[lo]..a[mid] with a[mid+1]..a[hi]. 
	int i = lo, j = mid+1;
	// Copy a into aux
	for (int k = lo; k <= hi; k++) 
	aux[k] = a[k];
	// Merge back to a[lo]..a[hi].
	for (int k = lo; k <= hi; k++)
	if (i > mid) a[k] = aux[j++];
	else if (j > hi ) a[k] = aux[i++];
	else if (less(aux[j], aux[i])) a[k] = aux[j++];
	else a[k] = aux[i++];
	}
	private static boolean less(int i, int j) 
	{
	// Checking condition of variables,if i<j,then retun. 
		return i<j;
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
	// Scannig text file. Declaring length of array(N) is first line , 
	// and other lines are elements of array.

		Scanner scanner	=new Scanner(new File("tall.txt"));
		int N=scanner.nextInt();
		int []	arr=new int [N];
		for(int	i=0; i<	N; i++)
		arr[i]	=scanner.nextInt();
	// Calling insertion and print method for sorting and print arr.
		sort(arr);
		print(arr);
	}


}
