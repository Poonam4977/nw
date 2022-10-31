package nwString.poonam;

public class OccPerChar {
	public static void main(String[] args) {
		String s="I am poonam mother of aarohi jadhav";
		int count=s.length();
		int count1=s.replaceAll("a","").length();
		int diff=count-count1;
		System.out.println(diff+"is accurrence of a");
	}

}
