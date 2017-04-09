import java.util.Scanner;
public class HomeWork040707
{
		public static void main(String[] args)
		{
				Scanner sc=new Scanner(System.in);
				System.out.print("the first number:");
				double nub1=sc.nextDouble();
		    System.out.print("the second number:");
				double nub2=sc.nextDouble();
				System.out.print("operation(+,-,*,/)is:");
				String operation=sc.next();
		    
		    switch(operation)
		    {
		    		case "+":
		    			   System.out.print("the resultis: " +(nub1+nub2));
		    			   break;
		    			   
		    	  case "-":
		    			   System.out.print("the resultis: " +(nub1-nub2) );
		    			   break;
		    			   
		    		case "*":
		    			   System.out.print("the resultis: " + nub1*nub2);	 
		    			   break;
		    			     
		    		case "/":
		    		     if(nub2==0)
		    		     {
                 System.out.print("error,divisor cannot be zero" );
		    		     }
		    		     else
		    		     {
		    			   System.out.print("the resultis: " + nub1/nub2 );
		    			   }
		    			   break;
		    			   
		    		default:
		    		     System.out.print("please enter the right operation,thank you!" );	   
		    			   	   
		    }
		}


}