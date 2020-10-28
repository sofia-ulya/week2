import java.util.Scanner;

public class week2
{
	public static void main (String [] args)
	{
		/*double y = 31/6;
		System.out.println(31/6);
		System.out.print(31.0/6);
		System.out.println(31/6f);	
		System.out.println(y);
		y = 31/6.0;
		System.out.print(y);
		System.out.print((float)((float)31/6f));*/

		/*byte value1 = 127;
		short value2 = 128;
		System.out.println(	(byte)value2	); //type casting over max value-->overflow

		byte value3 = 127;
		value3 +=1;
		System.out.println(value3);
		value3 +=1;
		System.out.println(value3);*/

		//String no = "100";

		//int var = Integer.parseInt(no);		//Integer wrapper class, utk string

		//int var = (int)no;					//tak boleh guna cast utk string

		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer number:");
		int x = sc.nextInt();
		System.out.println("Enter Double number:");
		double y = sc.nextDouble();
		System.out.println("Enter String:");
		String z = sc.next();

		System.out.println("Integer number is "+x);
		System.out.println("Double number is "+y);
		System.out.println("String is "+z);

		sc.close();*/

		String s1 = "Hello "+3+2+1;
		String s2 = 8+8+"";

		System.out.println(s1);
		System.out.println(s2);
	}
}