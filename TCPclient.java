import java.net.*;
import java.io.*;

public class TCPclient {
	
	public static void main(String args[]){
		
		try {
			
			Socket sock = new Socket("127.0.0.1",3501);
			DataInputStream dis = new DataInputStream(sock.getInputStream());
			String msg = dis.readUTF();
			System.out.println(msg);



			ServerSocket server = new ServerSocket(3501);			
			Socket socket = server.accept();
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			dos.writeUTF(s);
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
	}
}