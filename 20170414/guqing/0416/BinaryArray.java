package homework;

import java.math.BigInteger;

public class BinaryArray {

	public static void main(String[] args) {
		String a="asd";
		byte[] bytes = a.getBytes(); 
		System.out.println("2½øÖÆ£º"   + binary(bytes, 2));
	}

	private static String binary(byte[] bytes, int i) {
		
		return new BigInteger(1, bytes).toString(i);
	}
 
}
