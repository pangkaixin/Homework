import java.util.Scanner;

public class HomeWork041003
{
		public static void main(String[] args)
		{     
			    System.out.println("********************************************");    
				System.out.println("my shopping system");
				System.out.println("1.T桖   2.网球鞋  3.网球拍");
				System.out.println("********************************************\n");
				boolean isbuy=true;
				double total1=0;    //必须初始化 不然报错
				double total2=0;
				double total3=0;
				double total=0;

					while(isbuy)
					{
							Scanner sc=new Scanner(System.in);
							System.out.print("please input the goods id: ");
							int id=sc.nextInt();
							System.out.print("please input the nub of goods: ");
							int nub=sc.nextInt();
							
							
									switch(id)
									{
                                        case 1:
											double s1=250.0;
											total1=s1*nub;
											System.out.println("T恤￥"+s1+"\t"+"数量"+nub+"\t"+"合计￥"+total1);
											break;
											
										case 2:							
											double s2=350.0;
											total2=s2*nub;
											System.out.println("T恤￥"+s2+"\t"+"数量"+nub+"\t"+"合计￥"+total2);
											break;
									
										case 3:
											double s3=450.0;
											total3=s3*nub;
											System.out.println("T恤￥"+s3+"\t"+"数量"+nub+"\t"+"合计￥"+total3);
											break;
										  
										default:
											System.out.println("请输入正确编号");
									}    
									    
							
							    
									System.out.print("是否继续（y/n）\n");
									String choice=sc.next();	
					    
					    				if(!"y".equals(choice))
					    				{
					    					isbuy=false;
					    				}			
					}		
				double discount=0.8;
				total=total1+total2+total3;
				System.out.println("折扣： "+discount);
				System.out.println("应付金额："+total*discount);
				Scanner sc=new Scanner(System.in);   //必须添加不然找不到符号
                System.out.print("实付金额: ");
				double pay=sc.nextDouble();
                System.out.print("找零: "+(pay-total*discount));
				  
				System.out.println("谢谢再次光临！");
				  			
		}
}