package step_02_protocol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Protocolclient {
	Socket sock = null;
	BufferedWriter bw = null;// 서바와 통신
	BufferedReader br = null;// 서버와 통신

	BufferedReader keyboard = null; // 클라이언트 쪽의 키보드 입력

	public Protocolclient() {
		try {
			sock = new Socket("127.0.0.1", 7000);
		} catch (UnknownHostException e) {
			System.out.println("서버를 찾을수 없습니다.");
			System.exit(0);
		} catch (IOException e) {
			System.out.println("서버와 연결할수 없습니다.");
			System.exit(0);
		}
//------------------------------------------------------
		try {
			// 소켓 으로부터 스트림 생성
			bw = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(sock.getInputStream()));

			keyboard = new BufferedReader(new InputStreamReader(System.in));

			while (true) {

				System.out.println("ex)100 : 아이디(입장) 200: 아이디(퇴장) "
						+ "300 : 아이디:메시지(대화) 400 : 아이디1:아이디2:메시지(귓말)");
				System.out.print("메시지를 입력 하세요 : ");

				String msg = keyboard.readLine();
				bw.write(msg + "\n");
				bw.flush();
			}

		} catch (IOException e) {
			System.out.println("서버와의 연결이 끊어짐....");
			System.exit(0);
		}

	}

	public static void main(String[] args) throws IOException {
		new Protocolclient();
	}

}
