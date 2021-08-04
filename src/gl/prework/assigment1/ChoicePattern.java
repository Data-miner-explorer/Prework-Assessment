package gl.prework.assigment1;
import java.util.Scanner;

public class ChoicePattern {
	
Scanner sc = new Scanner(System.in);

	 

    //function to checkPalindrome

public void checkPalindrome()  {
	System.out.println("Enter number to test for Palindrome");
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	
    int reversedNum = 0, remainder;
    
    // store the number to originalNum
    int originalNum = num;
    
    // get the reverse of originalNum
    // store it in variable
    while (num != 0) {
      remainder = num % 10;
      reversedNum = reversedNum * 10 + remainder;
      num /= 10;
    }
    
    // check if reversedNum and originalNum are equal
    if (originalNum == reversedNum) {
      System.out.println(originalNum + " is Palindrome.");
    }
    else {
      System.out.println(originalNum + " is not Palindrome.");
    }

}



     //function to printPattern

public void printPattern() {
	 System.out.println("how many stars?");
	 Scanner scan = new Scanner(System.in);
	 int n = scan.nextInt();
	 
	 for(int i=0;i<n;i++)
     {
         for(int j=i;j<n;j++)
         {
             System.out.print("* ");
         }
         System.out.println();
     }

}



   //function to check no is prime or not

 public void checkPrimeNumber() {
	 System.out.println("Enter number to test for prime");
	 Scanner scan = new Scanner(System.in);
	 int num = scan.nextInt();
	 
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for composite number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");

	  }

 


  

   // function to print Fibonacci Series

   public void printFibonacciSeries() {

         //initialize the first and second value as 0,1 respectively.
	System.out.println("Enter number of terms of fibonacci");
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
    int i = 1,  firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    while (i <= n) {
      System.out.print(firstTerm + ", ");

      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;

      i++;
    }

   }



//main method which contains switch and do while loop

public static void main(String[] args) {

ChoicePattern obj = new ChoicePattern();

int choice;

Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();



choice = sc.nextInt();

switch (choice) {



case 0:

choice = 0;

break;



case 1: {

obj.checkPalindrome();

}

break;



case 2: {



obj.printPattern();

}

break;



case 3: {

obj.checkPrimeNumber();

}

break;



case 4: {



obj.printFibonacciSeries();

}

break;



default:

System.out.println("Invalid choice. Enter a valid no.\n");

}



} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();


}



}
