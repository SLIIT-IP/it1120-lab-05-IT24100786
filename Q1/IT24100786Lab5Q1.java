import java.util.Scanner;
     
      public class IT24100786Lab5Q1{

      public static void main(String args[])
{      

      Scanner input=new Scanner(System.in);
      
      int num1,num2,num3,max,min;

      System.out.print("Enter the first integer:");
      num1=input.nextInt();

      System.out.print("Enter the second integer:");
      num2=input.nextInt();

      System.out.print("Enter the second integer:");
      num3=input.nextInt();

  if (num1 > num2 && num3 < num1)
     {
      max=num1;
       
      }

      else if (num2 > num1 && num2 > num3)
      {
      max=num2;
    
      
      }

      else
      {
      max=num3;
      
      }
      
 if(num1<num2 && num1 < num3)
      {
      min=num1; 
      }
     else if(num2<num1 && num2<num3)
     {
      min=num2;
     }
     else
     {
      min=num3;
    }

      
      
      
      System.out.println("\n");

      System.out.println("User entered numbers are:" + num1+" "+ num2+" "+ num3);
      System.out.println("The Samllest number is:" +min);
      System.out.println("The Largest number is:" +max);
     
      
      
}


}
  



