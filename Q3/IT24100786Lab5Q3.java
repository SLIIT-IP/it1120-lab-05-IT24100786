import java.util.Scanner;
public class IT24100786Lab5Q3  {
public static void main(String[] args)  {

Scanner input = new Scanner(System.in);
 

  int stDate,enDate,dayRes;
  double totAmount;


  final double CHARGE = 48000;
  final int DAYS3_4 = 90;
  final int DAYS_5 = 80;


System.out.print("Enter start Date : ");
stDate = input.nextInt();

System.out.print("Enter the end Date : ");
enDate = input.nextInt();



  if (stDate < 1 || stDate > 31 || enDate < 1 || enDate > 31)
   {
     System.out.print("Days must be between 1 and 31");
     return;
   }
  

  if (stDate >= enDate)
   {
     System.out.print("Start date must be less than end Date");
     return;
   }



 dayRes = enDate - stDate;  
 



  if (dayRes < 3)
    {
      totAmount = CHARGE * dayRes;
    }
  else if (dayRes <= 4)
     {
       totAmount = CHARGE * dayRes * DAYS3_4 / 100;
     }
  else
    {
      totAmount = CHARGE * dayRes * DAYS_5 / 100;
    }
  
  
   System.out.print("\n");  

  
   System.out.println("Room Charge per Day is : " + "RS." + CHARGE);
   System.out.println("Number of Days Reserved : " + dayRes);
   System.out.print("Total Amount to be paid : " + totAmount);

  }
}
