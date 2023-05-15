package step4_01.string;

import java.util.Random;
import java.util.Scanner;

/*
 * # 타자연습 게임[1단계]
 * 
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 예)
 * 문제 : mysql
 * 입력 : mydb
 * 문제 : mysql
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : jsp
 */

public class StringEx09_필기 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		String[] wolds = {"java" , "masql" , "jsp" , "mydb" , "spring"};
		
		for (int i = 0; i < 500; i++) {
			int r = ran.nextInt(wolds.length);
			
			String temp = wolds[0];
			wolds[0] = wolds[r];
			wolds[r] = temp;
			
		}
		int dix = 0;
		while (dix < wolds.length) {
			System.out.println("[" + (dix +1) + "] 문제 "+ wolds[dix]);
			
			System.out.print("입력 : ");
			String mywolds = scan.next();
			
			if(wolds[dix].equals(mywolds)) {
				dix++;
			}
			
		}
		
		
		
	}

}
