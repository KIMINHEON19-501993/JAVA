package step_04_udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDPClient {
	
	public static void main(String[] args) {
		final int PORT = 7500;
		PrintStream ps = new PrintStream(System.out);
		
		String server_IP,msg;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		try {
			
			DatagramSocket ds = new DatagramSocket();
			ps.print("접속할 server IP : ");	server_IP = br.readLine();
			InetAddress ip =  InetAddress.getByName(server_IP);
			ps.print("\n전송할 메시지 입력 : "); msg = br.readLine();
			
			byte[] buf = msg.getBytes();
//													데이터 데이터 길이  주소 포트번호
			DatagramPacket dp =  new DatagramPacket(buf, buf.length, ip, PORT);
			ds.send(dp); //데이터 전송
			ps.print(server_IP + "에 메시지 전송 성공");
			
		
		} catch (IOException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}finally {
			
			try {
				br.close();
				ps.close();
			} catch (IOException e) {
				// TODO: handle exception
			}
		
		}
		
	}

}
