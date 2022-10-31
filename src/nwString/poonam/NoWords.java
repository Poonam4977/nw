package nwString.poonam;

public class NoWords {
	public static void main(String args[])
	{
		String s="My name is poonam";
		String []s1=s.split(" ");
		System.out.println(s1.length);
		int count=1;
		String rr="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
			
		}
		System.out.println(count);
			
	}

}
