import java.util.Scanner;
public class IT24100786Lab5Q2  {
public static void main(String[] args)  {

  Scanner input = new Scanner(System.in);

  int newMem;

  System.out.print("Enter the number of members introduced : ");
  newMem = input.nextInt();


  //validate the input
   if (newMem < 0)
   {
    System.out.print("Input must be a 0 or greater");
     return;
   }

  //condition
 switch(newMem)
   {
    case 0 :System.out.print("No prize..");
             break;
    case 1 :System.out.print("The prize is a : pen");
              break;
    case 2 :System.out.print("The prize is an :Umbrella");
             break;
    case 3 :System.out.print("The prize is an : Bag");
             break;
    case 4 :System.out.print("The prize is a : Travelling Chair");
             break;
    default :System.out.print("The prize is a Headphone");
   
     }

   }
}

 
