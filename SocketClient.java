import java.net.*;
import java.util.*;
import java.io.*;

public class SocketClient {
	
	public static void main(String args[]) {
		
		try {
			
			Socket socket = new Socket ("127.0.0.1", 4912);//create a socket with the server's IP and port
			System.out.println("Yes! i just got hold of the program");
			
			//Get the input and output streams of the socket, so that you can receive and send data to client
			InputStream sin = socket.getInputStream();
			OutputStream sout = socket.getOutputStream();
			
			//Coverting them to different streams so that string handling becomes easier
			DataInputStream in = new DataInputStream(sin);
			DataOutputStream out = new DataOutputStream(sout);
			
			//create a stream to read from the keyboard
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			System.out.println("Type in something and press enter. Will send it to the server and tell you what it thinks");
			System.out.println();
			while(true) {
				line = keyboard.readLine();//wait for the user to type in something and press enter
				System.out.println("Sending this line to the server...");
				out.writeUTF(line); //send the above line to the server
				out.flush();//flush the stream to ensure that the data reaches the other end
				line = in.readUTF();//wait for the server to send a line of text
				System.out.println("The server was very polite. It sent me this : "+line);
				System.out.println("Looks like the server is pleased with us. Go ahead and enter more lines");
				System.out.println();
				} 
			} catch(Exception x) {
				System.out.println("Exception Caught "+ x);
		}
	}
}