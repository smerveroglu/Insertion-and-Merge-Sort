//-----------------------------------------------------
// Title: Quick Sort Descending of Student objects
// Author: Sevdi Merve Eroglu
// ID: 12505108686
// Section: 1
// Assignment: 2
// Description: This class tests the quick sort for student objects
//-----------------------------------------------------
public class Student_descending implements Comparable<Student_descending>
{	
// Creating new variables.	
 String name;
 String surname;
 long id;
 
 public Student_descending(String newname, String newsurname,long newid)
 {
// Constructing name,surname, and id variables.
	 name=newname;
	 surname=newsurname;
	 id=newid;
 }
 public int compareTo( Student_descending  that)
 {
// Comparing id of objects.
		if (this.id > that.id)
			return +1;
		if (this.id < that.id)
			return -1;
		return 0;
 }
	 public static void sort(Comparable[] a) 
	{
	// Sort descending elements of array with quick sort
		quicksort(a, 0, a.length - 1); 
	}

	private static void quicksort(Comparable[] a, int lo, int hi) {
		if (lo >= hi)
			return;
 	// Partition this array
		int p = partition(a, lo, hi); 
	// Sort left part a[lo] .. a[p-1].
		quicksort(a, lo, p - 1);
	// Sort right part a[p+1] .. a[hi].
		quicksort(a, p + 1, hi);
	}

	private static int partition(Comparable[] a, int lo, int hi) 
	{
	// Partition into a[hi]..a[i-1], a[i], a[i+1]..[lo].
		Comparable x = a[lo];
		int i = lo;
		int j = hi;
	// Scan right and left,then exchanging
		while (true) {

			while (a[i].compareTo(x) > 0) {
				i++;
			}
			while (a[j].compareTo(x) < 0) {
				j--;
			}
			if (i < j) {
				exch(a,i,j);
			} 
			else 
			{
				return j;
			}
		}
	}
private static void exch(Comparable[] a, int i, int j)
 {
	/* Summary: Exchanging elements of array.
	   Precondition: a is integer array, j and i are integer.
	   Postcondition: Elements of array(a[i],a[j]) exchanged.
	*/ 
	Comparable temp=a[i];
	a[i]=a[j];
	a[j]=temp;
}
private static boolean less(Comparable l, Comparable  v)
 {
// Checking condition of variables,if l>v(with compareTo method),then retun. 
	return l.compareTo(v)>0;
}
public String toString()
 {
	//Printing name,surname,and id.
	return name + "/" + surname + "/" + id; // Print the students.
}

public static void main(String[] args) 
	{

	// Create 10 student objects and each objects have different attributes.

	Student_descending a = new Student_descending("Dan", "Brown", 244312670);
	Student_descending b = new Student_descending("Stephen", "King", 123483869);
	Student_descending c = new Student_descending("John", "Verdon", 967682446);
	Student_descending d = new Student_descending("Adam", "Fawer", 634595231);
	Student_descending e = new Student_descending("Nicolas", "Sparks", 123865685);
	Student_descending f = new Student_descending("Tim", "Moore", 475445295);
	Student_descending g = new Student_descending("Pat", "Barker", 756145712);
	Student_descending h= new Student_descending("Belinda", "Jones", 316579339);
	Student_descending i = new Student_descending("David", "Eagleman", 812496815);
	Student_descending j = new Student_descending("Georges", "Ifrah", 401275937);
	//Creating new array, size of array is 10.
	Student_descending [] s1 = new Student_descending[10]; 
	//Constructing elements of array with srudent objects.
	s1[0] = a; 
	s1[1] = b;
	s1[2] = c;
	s1[3] = d;
	s1[4] = e;
	s1[5] = f;
	s1[6] = g;
	s1[7] = h;
	s1[8] = i;
	s1[9] = j;
	//Sorting array with quuicksort method , and printing sorted array.
	quicksort(s1, 0, 9);
	System.out.println("Descending of QuickSort : ");
	System.out.println();
	for (int k = 0; k < s1.length; k++) {
		System.out.println(s1[k] + " "); 
	}

}
}
