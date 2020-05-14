package javaworkouts;

public class NoOfOccurances {
	
	public static void main(String args[]) {
		
		String x = "You have no choice other than following me!";
		
		System.out.println(x);
				
		System.out.println(x.length());
		
		char[] charArray = x.toCharArray();
		
		int count=0;
		
		for (int i = 0; i <charArray.length; i++) {

		if (charArray[i]=='o') {

				count =count+1;
			}

		}
		System.out.println("The occurances of char 0 is: "+count);
	}

}
