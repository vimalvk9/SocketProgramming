import java.net.*;
import java.io.*;

public class SocketServer {
		
		public static void main(String args[]){
			
			int port = 4912; //just a random port
			
			try {
				
				//create a server socket and bind it to the above port
				ServerSocket ss = new ServerSocket(port);
				System.out.println("Waiting for a client...");
				
				//make the server listen for a connection and let you know when its done
				Socket socket = ss.accept();
				System.out.println("Got a client...");
				System.out.println();
				
				//Get the input and output streams of the socket, so that you can receive
				//and send data to the client.
				InputStream sis = socket.getInputStream();
				OutputStream sout = socket.getOutputStream();
				BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
				//Coverting them to different streams so that string handling becomes easier
				DataInputStream in = new DataInputStream(sis);
				DataOutputStream out = new DataOutputStream(sout);
				
				String line = null;
				
				while(true) {
					
					line = in.readUTF();//wait for the client to send a line of text
					System.out.println("Client just sending the line : "+line);
					line = keyboard.readLine();
					System.out.println("I'm sending it..."+line);
					out.writeUTF(line);//send the same line back to the client
					System.out.println("Waiting for the next line...");
					System.out.println();
					ss.close();
				}
			} catch(Exception x){
				System.out.println("Exception caught "+x);
			}
		}
}