import java.util.Scanner;
public class HomeWork2			
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("华氏度为 : ");
		double tF = input.nextInt();     
		double t=(tF-32)/1.8;
    System.out.println("摄氏度为Ç : "+t);
		
	}
}	
