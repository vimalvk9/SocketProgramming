import java.io.*;
import java.lang.*;
import java.net.*;

public class Name
{
	public static void main(String args[])
	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String name = br.readLine();

		System.out.println("Your name is " + name);
	}
}