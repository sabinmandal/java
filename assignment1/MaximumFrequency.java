import java.util.*;
public class MaximumFrequency
{
	public static int findFreq(String str)
	{
		int f[] = new int[str.length()];
		
		for(int i=0 ; i<str.length() ; i++ ) 
		{
			f[i] = 0;
		}
		
		for(int i=0 ; i<str.length() ; i++)
		{
			for(int j=i+1 ; j<str.length() ; j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					f[i]++;
				}
			}
		}
		
		int m = 0;
		for(int i=0 ; i<str.length() ; i++)
		{
			m =  f[i] > f[m] ? i : m;
		}
		return m;
	}
	public static void main(String[] args) 
	{
		Scanner ip = new Scanner(System.in);
		String str;
		System.out.println("Enter string");
		str = ip.nextLine();
		int i = findFreq(str);
		System.out.println("The max frequency is " + str.charAt(i));
		ip.close();
	}

}
