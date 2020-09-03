//-----------------------------------------------------
// Title: Quick Sort Ascending of Student objects
// Author: Sevdi Merve Eroglu
// ID: 12505108686
// Section: 1
// Assignment: 2
// Description: This class tests the quick sort for student objects
//-----------------------------------------------------
public class Student_ascending implements Comparable<Student_ascending>
{
// Creating new variables.	
 String name;
 String surname;
 long id;
 
 public Student_ascending(String newname, String newsurname,long newid)
 {
 // Constructing name,surname, and id variables.
	 name=newname;
	 surname=newsurname;
	 id=newid;
 }
 public int compareTo( Student_ascending  that)
 {
 // Comparing id of objects. 	
 if (this.id > that.id ) return +1;
 if (this.id < that.id ) return -1;
 return 0;
 }
 public static void quicksort(Comparable [] a)
 {
 // Sort ascending elements of array with quick sort
 quicksort(a, 0, a.length - 1);
 }
 private static void quicksort(Comparable [] a, int lo, int hi)
 {
 if (hi <= lo) return;
 // Partition this array
 int j = partition(a, lo, hi); 
// Sort left part a[lo] .. a[j-1].
 quicksort(a, lo, j-1); 
// Sort right part a[j+1] .. a[hi].	
 quicksort(a, j+1, hi); 
 
}
 private static int partition(Comparable [] a, int lo, int hi)
 { 
 // Partition into a[lo]..a[i-1], a[i], a[i+1]..[hi].
 int i = lo, j = hi+1; 
 Comparable v = a[lo]; 
 while (true)
 { // Scan right and left,then exchanging
	 while (less(a[++i], v)) if (i == hi) break;
	 while (less(v, a[--j])) if (j == lo) break;
	 if (i >= j) break;
	 exch(a, i, j);
 }
	 exch(a, lo, j);
	 return j;// with a[lo..j-1] <= a[j] <= a[j+1..hi].
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
private static boolean less(Comparable l, Comparable v) 
{
	// Checking condition of variables,if l<v(with compareTo method),then retun. 
	return l.compareTo(v)<0;
}
public String toString()
{
//Printing name,surname,and id.
	return name + "/" + surname + "/" + id; 
}
public static void main(String[] args) {

	// Create 10 student objects and each objects have different attributes.

	Student_ascending a = new Student_ascending("Dan", "Brown", 244312670);
	Student_ascending b = new Student_ascending("Stephen", "King", 123483869);
	Student_ascending c = new Student_ascending("John", "Verdon", 967682446);
	Student_ascending d = new Student_ascending("Adam", "Fawer", 634595231);
	Student_ascending e = new Student_ascending("Nicolas", "Sparks", 123865685);
	Student_ascending f = new Student_ascending("Tim", "Moore", 475445295);
	Student_ascending g = new Student_ascending("Pat", "Barker", 756145712);
	Student_ascending h= new Student_ascending("Belinda", "Jones", 316579339);
	Student_ascending i = new Student_ascending("David", "Eagleman", 812496815);
	Student_ascending j = new Student_ascending("Georges", "Ifrah", 401275937);
	//Creating new array, size of array is 10.
	Student_ascending [] s1 = new Student_ascending[10]; 
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
	System.out.println("Ascending of QuickSort : ");
	System.out.println();
	for (int k = 0; k < s1.length; k++) 
	{
		System.out.println(s1[k] + " "); 
	}

}
}
