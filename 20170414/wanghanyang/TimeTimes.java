package wanghanyang;

import java.util.*;
public class TimeTimes{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("����������Ҫ��ѯ���ַ���");
		String str=sc.next();
		System.out.println("������һ��������ѯ���ַ���");
		char c=sc.next().charAt(0);
 
    char[] cs = str.toCharArray();//ת��Ϊchar����
    int count = 0;//������
    //��0��ʼ�����ַ�����
    for (int i = 0; i < cs.length; i++) {
        if (cs[i] == c) {//�����ǰ�ַ�����Ŀ���ַ�
            count++;//��������1
        }
    }
    System.out.println("��������ѯ���ַ�������Ҫ��ѯ���ַ����г��ֵĴ�����:"+count);//��ӡ���
  }
}