import java.util.Scanner;

public class HomeWork041002    //根据输入数字显示对应的英文星期名称缩写。
{
		public static void main(String[] args)
		{			
        boolean hasput=true;
          
        while(hasput)
        {
        		Scanner sc=new Scanner(System.in);
				System.out.print("please input the number(1-7):");
			    int nub=sc.nextInt(); 
				
          	    switch(nub)
				{
						case 1:
								System.out.println("today is MON");
								break;
						case 2:
								System.out.println("today is TUE");
		                        break;
						case 3:
								System.out.println("today is WED");	
								break;
                        case 4:
								System.out.println("today is THU");
								break;
						case 5:
								System.out.println("today is FRI");
		                        break;
						case 6:
								System.out.println("today is SAT");	
								break;
						case 7:
								System.out.println("today is SUN");	
								break;
						default:
								System.out.println("Please input the right number(1-7)!");
				}
          
        }          
	
		}
}