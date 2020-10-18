// Java program to ReverseString using ByteArray.
import java.util.*;

// Class of ReverseString
class ReverseString {
	public static void main(String[] args)
	{
        
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
System.out.print("Enter a string: ");  
String input = sc.nextLine();   
sc.close();
		// getBytes() method to convert string
		// into bytes[].
		byte[] strAsByteArray = input.getBytes();

		byte[] result = new byte[strAsByteArray.length];

		// Store result in reverse order into the
		// result byte[]
		for (int i = 0; i < strAsByteArray.length; i++)
			result[i] = strAsByteArray[strAsByteArray.length - i - 1];

		System.out.println(new String(result));
	}
}
