package step_03_tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

//tcp : 연결 지향
public class TCPServer {
	final static int PORT = 7000;
	
	
	public static void main(String[] args) {
		try {
			ServerSocket ss =new  ServerSocket(PORT);
			System.out.println("접속 대기중....");
			
			while(true) {
				Socket sock = ss.accept();//접속 요청 수락
				
				//네트워크에서 넘어온 데이터를 읽어 들이기
				InputStream is = sock.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
				//콘솔로 출력
				PrintStream ps = new PrintStream(System.out);
				
				//상대방 정보 출력
				ps.print(sock.getInetAddress().getHostName());
				ps.print("에서 수신된 메시지 : " + br.readLine() + "\n");
				
			}
			
			
			
		} catch (IOException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
	}

}
