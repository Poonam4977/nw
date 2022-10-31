package nwString.poonam;

public class MaxRep {
	public static void main(String[] args) {
		String p="poonam is very good person";
		p=p.replaceAll(" ", "");
		int a[]=new int[256];
		for(int i=0;i<p.length();i++)
		{
			a[p.charAt(i)]=a[p.charAt(i)]+1;
		}
			int max=-1;
			char ch=' ';
			for(int i=0;i<p.length();i++)
			{
				if(max<a[p.charAt(i)])
				{
					max=a[p.charAt(i)];
					ch=p.charAt(i);
				}
			}
			System.out.println(ch);
			System.out.println("tried and done finally");

	}
	
}
