import java.util.Scanner;

public class findlargeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		
		System.out.println("Enter the Number:");
		Scanner sc=new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b&&a>c)
		{
			System.out.println("Largest Number:"+a);
		}
	    else if(b>c)
		{	
			System.out.println("Largest Number:"+b);
		}
	    else
	    {
	    	System.out.println("Largest Number:"+c);
	    }
		
	}

}
