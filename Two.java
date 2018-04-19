import java.io.*;
import java.lang.*;
import java.net.*;

public class Two
{
	public static void main(String args[])
	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numbers");

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

		System.out.println("Sum of two numbers is " + (a + b)); 
	}
}