import java.net.*;

class InetDemo {
	
	public static void main(String args[]){
		
		try{
			
			InetAddress ia = InetAddress.getLocalHost();
			
			//local host ip
			System.out.println("The IP of localhost is : "+ia);
			
			//it returns the instance of localhost address ip by name
			ia = InetAddress.getByName(args[0]);
			System.out.println("The IP address of"+args[0]+"is : "+ia);
		}
		
		catch(UnknownHostException ue){
			System.out.println("There is an error "+ ue);
		}
	}
}