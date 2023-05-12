package step4_01.string;


public class StringEx05_문제 {

	public static void main(String[] args) {

		String jumin = "890101-2012932"; //주민 이는 89년 01월 01일 여자.
		// 문제 1) 나이 출력
		// 정답 1) 35세
		
		String str1 = jumin.substring(0, 2);
		int myage = 2023 - 1989;
		System.out.println(myage + "세");
		
		
		// 문제 2) 성별 출력
		// 정답 2) 여성
		
		char key = jumin.charAt(7);
		if (key == '1' || key == '3' ) {System.out.println("남성");
		} else if (key == '2' || key == '4') {
		System.out.println("여성");}
		
		

	}

}
