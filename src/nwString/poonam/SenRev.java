package nwString.poonam;

public class SenRev {
	public static void main(String args[])
	{
		String s="My name is POONAM";
		String[] word=s.split(" ");
		String rev="";
		for(String w:word)
		{
			String revStri="";
			for(int i=w.length()-1;i>=0;i--)
			{
				revStri=revStri+w.charAt(i);
			}
			rev=rev+revStri+" ";
		}
		System.out.println(rev);
	}

}
