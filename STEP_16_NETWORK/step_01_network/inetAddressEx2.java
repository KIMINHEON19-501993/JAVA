package step_01_network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class inetAddressEx2 {

	public static void main(String[] args) throws UnknownHostException {
		Scanner sc = new Scanner(System.in);
		
		String host  = null;
		
		System.out.print("홈페이지 주소 : " );host = sc.nextLine();
		
		InetAddress[] addr = InetAddress.getAllByName(host);
		
		System.out.println(host +"는 "+ addr.length +"개의 주소를 가지고 있음");
		
		for (int i = 0; i < addr.length; i++) {
			System.out.println((i+1)+"번 ip주소 : " + addr[i].getHostAddress());
			System.out.println((i+1)+"번 ip주소 : " + addr[i].getHostName());
		}
		
	}

	

}
