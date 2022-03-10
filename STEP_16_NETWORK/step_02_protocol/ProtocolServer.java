package step_02_protocol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ProtocolServer {
	ServerSocket ss = null;
	Socket sock = null;
	BufferedReader br = null;
	BufferedWriter bw = null;
	public ProtocolServer() throws IOException {
		ss= new ServerSocket(7000);
		System.out.println("접속 대기중.....");
		sock = ss.accept(); //응답
		
		br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
		bw = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
		
		while(true) {
			String buf = br.readLine(); 
			String[] words = buf.split(":");
			
			if(words[0].equals(Protocol.ENTER)) {//입장
				enter(words);
			}else if(words[0].equals(Protocol.EXIT)) {
				exit(words);
			}else if(words[0].equals(Protocol.SEND_MESSAGE)) {
				sendMessage(words);
			}else if(words[0].equals(Protocol.SECRET_MESSAGE)) {
				secretMessage(words);
			}else {//클라이언트 에서 읽어 와서 출력
				bw.write("잘못된 요청 입니다.");
				System.exit(0);
			}
			
		}
	}
	private void secretMessage(String[] words) {//400 : 아이디1:아이디2:메시지(귓말)
		System.out.println("["+words[1] +"] 님이 ["+words[2] +"]님에게 귓속말 보냄");
		System.out.println("[" + words[1] + "] : " + words[3]);
	}
	private void sendMessage(String[] words) {//300 : 아이디:메시지(대화)
		System.out.println("[" + words[1]+ "] : " + words[2] + "\n");
	}
	private void exit(String[] words) {//200: 아이디(퇴장)
		System.out.println("[" + words[1]+ "]님이 퇴장하셨습니다.");
	}
	private void enter(String[] words) { //100 : 아이디(입장)
		System.out.println("[" + words[1]+ "]님이 입장하셨습니다.");
		
	}
	public static void main(String[] args) throws IOException {
		new ProtocolServer();
	}

}
