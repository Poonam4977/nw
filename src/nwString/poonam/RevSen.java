package nwString.poonam;

public class RevSen {
	public static void main(String args[])
	{
		String s="My name is Poonam";
		String []s1=s.split(" ");
		String ss=" " ;
		for(int i=0;i<s1.length;i++)
		{
			System.out.print(s1[i]+" ");
			 
		}
		System.out.println();
		System.out.println();
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
			 
		}
	
	}

}
