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

public class StringEx10_필기 {

	public static void main(String[] args) {
		
		//String start = "자전거";
		//System.out.println("제시어 : " + start);
		Scanner scan = new Scanner(System.in);
		
		String start = "자전거";
		
		while(true) {
			
			int size = start.length();
			System.out.println("제시어 :" + start); //시작.
			
			System.out.print("입력 :");
			String myWorld = scan.next();  //대답.
			
			if (myWorld.equals("quit")) {
				System.out.println(" - 종료 -"); //종료.
				break;
			}
			
			if (start.charAt(size-1) == myWorld.charAt(8)) {
				start = myWorld; // 제시어랑 내가쓴답과 같으면 넘어간다.
			}
		}
	}

}
