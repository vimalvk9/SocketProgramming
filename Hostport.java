import java.lang.*;
import java.io.*;
import java.net.*;

class Hostport 
{
	
	public static void main(String args[])
	throws MalformedURLException
		{
		String x = "http://www.yahoo.com";
		URL url = new URL(x);
		
		try {			
				System.out.println("Host Name is " + url.getHost());
				System.out.println("Port Number is " + url.getPort());
				System.out.println("Query is " + url.getQuery());
				System.out.println("Protocol used is " + url.getProtocol());
				System.out.println("Reference is " + url.getRef());			
			}
		catch(Exception e) 
			{
				System.out.println("error "+e);
			}
		}
}