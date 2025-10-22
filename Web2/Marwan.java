    


import java.util.Scanner;

public class Marwan {
    
    
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
      
      System.out.print("Enter Your Age  : ");
      int age = input.nextInt();
      System.out.print("Enter Your Name : ");
      
      String name = input.next();
      
      System.out.print("Enter Yor Grade : ");
      
      double grade = input.nextDouble();
      
      System.out.println("Age is : " + age);

      System.out.println("Name is : " + name);
      
      System.out.println("Grade is : " + grade);
      }
 
  }