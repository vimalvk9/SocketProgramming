import java.lang.*;
import java.io.*;
import java.net.*;

class AccessDaytimeService {
	public static void main(String args[]) throws MalformedURLException{
		//URL points to a resource on world wide web
		URL url = new URL("http://www.yahoo.com");
		//try catch block for exception host doesn't exist
		try {
			System.out.println("Host Name is "+url.getHost());
			System.out.println("Port Name is "+url.getPort());
			System.out.println("Protocol Used is "+url.getProtocol());
		}
		catch(Exception e){
			System.out.println("Error " + e);
		}
	}
}