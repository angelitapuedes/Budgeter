import java.util.Scanner;



public class BudgetMaster
{
    int a;
    int b;

    public static void main(final String[] args)
    {
        System.out.println("Write out the amount you made:");
        System.out.println("");

         /************** Allocation Begins *******************/

         double tithe = amount * .012;
         double bills=300;
         double newAmount=amount-tithe-bills;
 
         double saveIngs=newAmount*.20;
         double blow=newAmount*.05;
 
         doube reSt=newAmount-savIngs-blow;
 
         /******************Allocation COmplete***************** */
        if(reSt<=0)
        {
            System.out.println("Your Under");
        }
        else
        {
            System.out.println("You did great for this payroll");
        }
        System.out.println("Breakdown of you Budget:");
        System.out.printf("tithe: %d\n bills: %d\n saveIngs %d\n blow %s\n reSt %d\n",tithe, bills, saveIngs, blow, reSt);

    

        
        
}