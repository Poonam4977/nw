package nwString.poonam;

public class reverse {
	public static void main (String args[])
	{
		String s="AArohi";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
