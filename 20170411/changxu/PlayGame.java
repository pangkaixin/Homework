import java.util.Scanner;
public class PlayGame
{
	public static void main(String[] args)
	{
		Scanner sc=null;
		int sets=5;
		double gt80Score=0;
		boolean isFull5Sets=true;
		for(int i=1;i<=sets;i++)
		{
			sc=new Scanner(System.in);		
			System.out.println("请输入第"+i+"次成绩:");						
			int score1=sc.nextInt();		
			if(score1>=80)
			{
				gt80Score++;
			}	
			if(i==5)
			{
				break;
			}			
			System.out.println("继续玩下一局?(yes/no)");			
			String isPlay=sc.next();
			if("no".equals(isPlay))
			{
				System.out.println("Game Over");
				isFull5Sets=false;
				break;					
			}					
		}
		if(isFull5Sets)
		{			
			if(gt80Score/sets>=0.8)
			{
				System.out.println("一级玩家");
			}else if(gt80Score/sets>=0.6)
			{
				System.out.println("二级玩家");
			}else
			{
				System.out.println("三级玩家");
			}
	   }else
	   {
	   	System.out.println("还不满五局!!!");
	   }				
	}
}