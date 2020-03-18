import java.util.Scanner;



public class BudgetMaster
{
    int a;
    int b;

    public static void main(final String[] args)
    {
        System.out.println("Write out the amount you made:");
        System.out.println("");



        float amount = Float.parseFloat(System.console().readLine());


        /************** Allocation Begins *******************/

        float tithe = amount * 0.012f;
        float bills=300.0f;
        float newAmount=amount-tithe-bills;

        float saveIngs=newAmount*0.20f;
        float blow=newAmount*0.05f;

        float reSt=newAmount-saveIngs-blow;

        if(reSt<=0){
            System.out.println("Your Under");
        }
        else{
            System.out.println("You did great for this payroll");
        }
        System.out.println("Breakdown of you Budget:");
        System.out.printf("tithe: %f\n bills: %f\n saveIngs %f\n blow %f\n reSt %f\n",tithe, bills, saveIngs, blow, reSt);

    }

    public static double pi()
    {
        return 3.14;
    }
}