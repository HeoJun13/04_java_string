package step4_01.string;


public class StringEx05_필기 {

	public static void main(String[] args) {

		String jumin = "890101-2012932"; //주민 이는 89년 01월 01일 여자.
		// 문제 1) 나이 출력
		// 정답 1) 35세
		
		String starage = jumin.substring(0, 2);
		int age = Integer.parseInt(starage);
		int old = 2023 - (1900 + age) + 1;
		System.out.println(+ old + "세.");
		
		
		
		// 문제 2) 성별 출력
		// 정답 2) 여성
		
		int gender = jumin.charAt(7);
		if (gender == '1' || gender == '3') {
			System.out.println("남성.");
		} else if (gender == '2' || gender == '4') {
			System.out.println("여성.");
		}
		

		int key = jumin.charAt(7);
		if (key == '1' || key == '3') {
			System.out.println("남성.");
		} else if (key == '2' || key == '4') {
			System.out.println("여성.");
		}
	}

}
