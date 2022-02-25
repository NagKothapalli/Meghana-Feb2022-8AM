package coreConcepts;
//https://github.com/NagKothapalli/Meghana-Feb2022-8AM.git
//Signature : CLASS
 // Modifier   class  Name{ Body : Members -> variables / functions  }
 //Access Modifiers : private, default , protected , public
/*Non Access Modifiers : static , final
 Class Name should always start with UpperCase , No Spaces within the class , No special characters*/
public class BasicConcepts
{
  //Signature : variable
	//Modifier[opt]   DataType  name; - Declaration   ||  Modifier[opt]   DataType  name  = value ; - Assignment
	public static final String collegeName = "JNTU - HYD";
	public     int     stdNum   = 22;  // byte - 8 short - 16  int - long
	private  double    stdMarks = 54.67;  //1,2,3,4,5,6,77,777,45678,.......
	         char      stdGrade = 'A'; // abcdefg.....z
	         boolean   stdResult = true;
	//Modifier[opt]  ReturnType Name(arguments[opt]){ body }
	            // NO - void        //DataType arg1,DataType arg2, .......
	            // YES - int,String , char , boolean
	 //psvm
	 public static void main(String[] args) //class reader
	 {
		System.out.println("Welcome to Selenium Java"); 
		addition();
		subtraction();
		multiplication();
		division();
	 }
	 int empNum;
	 //int empNum;
	 public static void addition() //normal student
	 {
		 int sum = 10 + 20 ;//int+int=int / int+string | string+int | string+string = string
		 System.out.println("Sum of two numbers :"+sum); //syso  CTRL+SPACE
	 }
	 public static void subtraction()
	 {
		 int diff = 30-20;
		 System.out.println("Difference of two numbers :" + diff);
	 }
	 public static void multiplication()
	 {
		 int prod = 30 * 20; // int
		 System.out.println("Product of two numbers :" + prod);
	 }
	 public static void division()
	 {
		 int div = 30/20;
		 System.out.println("Division of two numbers :" + div);
	 }
	 public static void division_R()
	 {
		 int rem = 30%20;
		 System.out.println("Division of two numbers :" + rem);
	 }
	
	
}


//Signature : Method
	//Modifier[opt]  ReturnType  Name(arguments[opt]){ body }
	         
	         //[] - square bracket
	         //() - Parenthesis
	         //{ } - curly / flower 
	
	//openDoor()  - there is only single door
	//openDoor(5)  - there are 10 rooms - 1 , 2, 3 ,4 , 5 .......
	/*
	 * private void printCollegeName() { //System.out.println("JNTU - H");
	 * System.out.println(collegeName); }
	 */

class Yahoo   //Yahoo.java
{
	private void printCollegeName() {
		
		//System.out.println("JNTU - H");
		System.out.println(BasicConcepts.collegeName);
		//BasicConcepts.collegeName = "JNTU - HYDERABAD";

	}
}


class Amazon
{
private void printCollegeName() {		
		//System.out.println("JNTU - K");
		System.out.println(BasicConcepts.collegeName);
	}
}
