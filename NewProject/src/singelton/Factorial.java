package singelton;

import java.math.BigInteger;

public class Factorial {
	
	private static BigInteger fact(long n) {
	    BigInteger result = BigInteger.ONE;
	    for (long i = 2; i <= n; i++)
	        result = result.multiply(BigInteger.valueOf(i));
	    return result;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 BigInteger fact = fact(2);
		    System.out.println("fact(100) = " + fact);
		    /*System.out.println("fact(100).longValue() = " + fact.longValue());
		    System.out.println("fact(100).intValue() = " + fact.intValue());
		    int powerOfTwoCount = 0;
		    BigInteger two = BigInteger.valueOf(2);
		    while (fact.compareTo(BigInteger.ZERO) > 0 && fact.mod(two).equals(BigInteger.ZERO)) {
		        powerOfTwoCount++;
		        fact = fact.divide(two);
		    }
		    System.out.println("fact(100) powers of two = " + powerOfTwoCount);
		*/
	}

}
