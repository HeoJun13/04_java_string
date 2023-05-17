package step4_01.string;

import java.util.Scanner;

/*
 * # 끝말잇기 게임
 * 
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * 제시어 : 미술
 * 입력 : quit
 * 
 * - 종료 -
 * 
 */

public class StringEx10_필기2 {

	public static void main(String[] args) {
		
		//String start = "자전거";
		//System.out.println("제시어 : " + start);
		
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {

			String start = "자전거";
			System.out.println("제시어 :" + start);
			int size = start.length();

			
			System.out.println("입력 : ");
			String mywold = scan.next();
			
			if(mywold.equals("quit")) {
				System.out.println("--- 종료 ---");
				break;
			}
			
			if(start.charAt(size-1) == mywold.charAt(8));
			start = mywold;
		}
	}

}
