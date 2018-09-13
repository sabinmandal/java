import java.util.*;
public class Palindrome
{
	public static boolean palindrome(String s)
	{
		int i=0; 
		int j=s.length() - 1;
		int flag = 0;
		for( i=0 ; i <= j ; i++ )
		{
			if( s.charAt(i) != s.charAt(j) )
			{
				flag = 1;
				break;
			}
			j--;
		}
		if( flag == 0 )
		{
			return true;
		}			
		else
		{
			return false;
		}
	}
	
	public static void main(String[] x)
	{
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter String");
		String str; 
		str = ip.nextLine();
		System.out.println(palindrome(str));		
		ip.close();
	}
}

