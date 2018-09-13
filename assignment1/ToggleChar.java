import java.util.*;
public class ToggleChar 
{
	public static String toggling(String s1)
	{
		StringBuilder s = new StringBuilder(s1);
		for(int i=0 ; i<s.length() ; i++)
		{
			if( s.charAt(i) >= 'a' && s.charAt(i) <= 'z' )
			{
				s.setCharAt(i , (char) (s.charAt(i) - 32)); 
			}
			else if( s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' )
			{
				s.setCharAt(i,(char) (s.charAt(i) + 32) );
			}
		}
		
		return s.toString();
	}
	public static void main(String[] args) 
	{ 
		Scanner ip = new Scanner(System.in);
		String str;
		System.out.println("Enter String");
		str = ip.nextLine();
		str = toggling(str);
		System.out.println("The toggled string is : " + str);		
		ip.close();
	}

}
