package javaworkouts;

public class Polyndrome {

	public static void main(String args[])
	{
		String x ="malayalam";
		String y ="testleaf";

		String res="";
		String res1="";

		int xlen = x.length();
		int ylen = y.length();

		for (int i = xlen-1; i >= 0; i--) {

			res= res+x.charAt(i);
		}
		System.out.println(res);

		if(res.equals(x))
			System.out.println("It is a polyndrome");
		else
			System.out.println("It is not a polyndrome");

		for (int j = ylen-1; j >= 0; j--) {

			res1= res1+y.charAt(j);
		}
		System.out.println(res1);

		if(res1.equals(y))
			System.out.println("It is a polyndrome");
		else
			System.out.println("It is not a polyndrome");
	}

}
