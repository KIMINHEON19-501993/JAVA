package step_04_udp;

import java.io.IOException;
import java.io.PrintStream;
import java.net.DatagramPacket;

/*
 * PDU : protocol data unit
 * tcp의 pdu : 세그먼트
 * udp의 pdu : 데이터 그램
 */
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {

	public static void main(String[] args) {
		final int PORT = 7500;
		final int BUFFER = 50;
		String messge = "";
		
		PrintStream ps = new PrintStream(System.out);

		try {
			DatagramSocket ds = new DatagramSocket(PORT); // 데이터 그램 소켓 생성
			ps.print("접속 대기중....");

			byte[] buf = new byte[BUFFER];
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
			ds.receive(dp);

			messge = new String(dp.getData());
			
			ps.print("\n수신 메시지 : " + messge);
			ps.flush();
			messge = "";
		} catch (SocketException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}finally {
			ps.close();
			
		}
	}

}
