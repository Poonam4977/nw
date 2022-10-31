package nwString.poonam;

public class RemoveDup {
	public static void main(String args[])
	{
		String s="POONAM";
		String remdup="";
		for(int i =0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(remdup.indexOf(ch)==-1)
			{
				remdup=remdup+ch;
			}
		}
		System.out.println(remdup);
		
	}

}
