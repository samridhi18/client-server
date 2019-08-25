package client;
import java.net.*;
import java.io.*; 


public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket s= new Socket("localhost",1122);
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			dos.writeUTF("Hello");
			dos.close();
		}
		catch(Exception e){}
		}
}