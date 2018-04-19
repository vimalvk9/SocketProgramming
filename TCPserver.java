import java.net.*;
import java.io.*;

public class TCPserver {
	
	public static void main(String args[]){
		
		//one exception can be generated while assigning the port number that is already been assigned by other application
		
		try {
			
			ServerSocket server = new ServerSocket(3501);
			
			//start the server
			Socket sock = server.accept();
			System.out.println("Connected!!!");
			
			//for sending any type of data, we use DataStream and getOutputStream() is for byte stream which is converted into stream by DataOutputStream
			DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
			
			//message is being sent by server program to client machine
			dos.writeUTF("This message is sent by server program by Baibhab");
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
	}
}