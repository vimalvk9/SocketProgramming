
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	
	public static void main(String[] args) throws IOException {
		
		Socket sock = new Socket("127.0.0.1",3000); 
		
		//reading from keyboard(keyRead Object)
		BufferedReader keyRead = new BufferedReader (new InputStreamReader(System.in)); 
		
		//sending to client(pwrite object)
		OutputStream ostream = sock.getOutputStream();
		PrintWriter pwrite = new PrintWriter(ostream,true);
		
		//receiving from server(receiveRead object)
		InputStream istream = sock.getInputStream();
		BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
		
		System.out.println("Start the chit-chat, Type and Press Enter key");
		
		String receiveMessage, sendMessage;
		while(true) {
			
			//keyboard reading
			sendMessage = keyRead.readLine();
			
			//sending to server
			pwrite.println(sendMessage);
			
			//flush the data
			pwrite.flush();
			
			//receive from server
			if((receiveMessage = receiveRead.readLine()) != null) {
				
				//displaying the message
				System.out.println(receiveMessage);
			}
		}
		
	}
}