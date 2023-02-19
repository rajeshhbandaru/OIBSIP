import java.util.*;
class Estimate
{
	public void ready()
	{
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		int val=r.nextInt(101);
		System.out.println("Random Number is generated");
		System.out.println("Enter the number of guesses you want to try.**less than 7**");
		int c=sc.nextInt();
		while(c>7)
		{
			System.out.println("Your chances exceeds. Please Enter number less than 7");
			c=sc.nextInt();
		}
		System.out.println("You have"+c+"Chances");
		int marks=100;
		int i=0;
		for(i=0;i<c;i++)
		{

			System.out.println("Enter the number you guessed.Chance no"+(i+1));
			int num=sc.nextInt();
			if(num==val)
			{
				System.out.println("You won the Game");
				System.out.println("Your score is "+marks);
				break;
			}
			else if(num>val)
			{
				System.out.println("Your number is greater Than original number");
			}
			else
			{
				System.out.println("Your number is less than original number");
			}
			marks-=10;
		} 
		if(i>=c)
		{
			System.out.println("The number is "+val);
			System.out.println("You Lost the game");
			System.out.println("Your score is 0");
		}
	}
}
class NumberGame
{
public static void main(String args[])
{
	System.out.println("This is Task-2");
	Scanner sc=new Scanner(System.in);
	Estimate g=new Estimate();
	System.out.println("Start the game : Yes/No");
	String s=sc.nextLine();
	while(s.equalsIgnoreCase("Yes")||s.equalsIgnoreCase("y"))
	{
		g.ready();
		System.out.println("DO you want to continue Yes/No");
		s=sc.nextLine();
	}

}
} 

