import java.util.Scanner;
public class QingNiaoGame
{
	public static void main(String[] args)
	{
		System.out.println("欢迎进去青鸟迷你游戏平台");
		System.out.println(" ");
		System.out.println("请选择您喜爱的游戏:");
		System.out.println("***************************************************************");		
		System.out.println("1:斗地主\n2:斗牛\n3:泡泡龙\n4:连连看");
		System.out.println("请选择,输入游戏编号: ");	
		Scanner sc=new Scanner(System.in);
		int ganmeNo=sc.nextInt();
		switch(ganmeNo)
		{
			case 1:
			{
				System.out.println("您已进入斗地主房间");
				break;	
			}
			case 2:
			{
				System.out.println("您已进入斗牛房间");
				break;	
			}	
			case 3:
			{
				System.out.println("您已进入泡泡龙房间");
				break;	
			}	
			case 4:
			{
				System.out.println("您已进入连连看房间");
				break;	
			}		
		}		
		System.out.println("***************************************************************");
	}
}