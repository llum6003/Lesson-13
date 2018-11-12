package lesson13;

public class lesson13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Break Statement Example");
		int num =0;
		while(num<=100)
		{
			System.out.println("Value of variable is: "+num);
			if (num==2)
			{
				break;
			}
			num++;
		}
		System.out.println("Out of while-loop");


		System.out.println("\nBreak in For Loop");
		int var;
		for (var =100; var>=10; var --)
		{
			System.out.println("var: "+var);
			if (var==99)
			{
				break;
			}
		}
		System.out.println("Out of for-loop");


		System.out.println("\nBreak in Switch Case");
		num=2;

		switch (num)
		{
		case 1:
			System.out.println("Case 1 ");
			break;
		case 2:
			System.out.println("Case 2 ");
			break;
		case 3:
			System.out.println("Case 3 ");
			break;
		default:
			System.out.println("Default ");
		}		

	}

}
