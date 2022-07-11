import java.util.Scanner;
class Login 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("==Welcome to java==");
		System.out.println("fill the registation form");
		System.out.println("Enter your name");
		String a=sc.nextLine();
		System.out.println("Enter your mail-id");
	    String b=sc.nextLine();
		System.out.println("Enter your User name");
		String OUN=sc.next();
		System.out.println("Enter your Password");
	    int PSW=sc.nextInt();
        System.out.println("Thank you for your registation");
		System.out.println("====================================================");
		System.out.println("Enter 1 for Login");
		System.out.println("Enter 2 for Exit");
		int n=sc.nextInt();
		if (n==1)
		{
        System.out.println("Enter your User name");
		String CUN=sc.next();
		System.out.println("Enter your Password");
	    int PSWD=sc.nextInt();
		if(OUN.equals(CUN)&&PSW==PSWD)
		{
        System.out.println("Enter the First value");
		int i=sc.nextInt();
		System.out.println("Enter the second value");
		int j=sc.nextInt();
		System.out.println("enter 1 for addition..!");
		System.out.println("enter 2 for Substraction..!");
		System.out.println("enter 3 for multiplication..!");
		System.out.println("enter 4 for division..!");
		int k=sc.nextInt();
		switch(k)
			{
			case 1:System.out.println("the summation of"+i+"and "+j+"is :"+(i+j));break;
			case 2:System.out.println("the subtraction of"+i+"and "+j+"is :"+(i-j));break;
			case 3:System.out.println("the mutlipalication of"+i+"and "+j+"is :"+(i*j));break;
			case 4:System.out.println("the division of"+i+"and "+j+"is :"+(i/j));break;
			default:System.out.println("Invalid input..!!");
			}
		}
		else
		{
			System.out.println("Incorrect user name and password..!!");
		}
		}
		else if(n==2)
		{
			System.out.println("thank you for visiting our web site ...!!");
		}
		else 
		{
			System.out.println("Invalid input ...better luck next timee....!!");
		}
	}
}
