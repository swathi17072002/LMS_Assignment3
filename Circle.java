//JFM1T3_Assignment1: 
/* Write a program to calculate the circumference of a circle and print the result in whole number. 
  Allow user to input the cirlce radius from terminal. 

  Sample Input:
    radius of the circle=6

  Expected Output:
   Circumference of the circle=38
   

*/ 
import java.lang.Math;
//import statement for java program to read inputs using Scanner class 
import java.util.Scanner;

public class Circle { 
//Define main method
public static void main(String[] args){
//Declare the variables
int radius;
double c;
//float circumference;

//Use the scanner class to provide radius at execution time

/*
Scanner scanner = new Scanner(System.in);
System.out.println("Enter radius as a positive integer");
radius= scanner.nextInt();
*/
Scanner sc = new Scanner(System.in);
System.out.println("Enter radius as a positive integer");
radius= sc.nextInt();
//Caluculate the circumference of the circle
c = 2*3.14*radius;
//Casting the floating-point value to int  
int circumference =(int) Math.round(c);
//Print the Result
  System.out.println("circumference of the circle is "+circumference);
}
} 