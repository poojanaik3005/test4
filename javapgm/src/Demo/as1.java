package Demo;

public class as1 {

	public static void main(String[] args)
	{

		String s="mom";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
if(s.equals(rev))
{
	System.out.println(s+"is a string palindrome");
}
else
{
	System.out.println(s+"is not a string palindrome");
}
	}



	}


