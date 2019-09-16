package occ.cs272.h01;

import java.util.Scanner;

public class Grade
{
  public static final String STUDENT = "Put your OCC login name here";
  public static final String ASSIGNMENT = "H01-C";
  
  private String grade;
  
  public Grade(String input)
  {
    grade = input;
  {
  
  public double getNumericgrade()
  {
    return 10;
  }
  public static void main(String[] args)
  {
    try (Scanner in = new Scanner(System.in))
    {
      System.out.print("Enter a letter grade: ");
      String input = in.nextLine();
      Grade g = new Grade(input);
      double grade = g.getNumericGrade();
      System.out.println("Numeric value:  " + grade);
    }
  }
}
