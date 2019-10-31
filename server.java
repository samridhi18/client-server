package server;
import java.net.*;
import java.io.*; 

public class server1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket ss=new ServerSocket(1122);
			Socket s=ss.accept();
			DataInputStream dis=new DataInputStream(s.getInputStream());
			System.out.println(dis.readUTF());
			dis.close();
		}
		catch(Exception e) {
		}update it;
		
		
		

	}}


