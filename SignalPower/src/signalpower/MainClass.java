//Navid Derakhshandeh
package signalpower;

import java.util.Scanner;

public class MainClass 
{

	public static void main(String[] args) 
	{
		System.out.println("please choose your option");
		System.out.println("a.signal power at radar receiver");
		System.out.println("b.it's test option");
		Scanner reader1 = new Scanner(System.in);
		char choice = reader1.next().charAt(0);
		do
		{
			switch(choice) 
			{
			case 'a':
				Info action = new Info();
				action.enroll();
				action.FormulaInfo();
				action.calculation();
				break;
				
			}
		}while(choice != 'b');
	}
}
