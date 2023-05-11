package step4_01.string;

// 문자열 관련 데이터 형변환

public class StringEx04 {

	public static void main(String[] args) {
		
		
		// [1] 문자열 > 숫자 형변환
		
		String birthy = "2023";
		System.out.println(birthy + 1);
		int nBirthy = Integer.parseInt(birthy); //Integer.parseInt("문자열"); 메서드 사용
		System.out.println(nBirthy + 1); // 2024
		
		
		// [2] 숫자 > 문자열 형변환
		
		// 2-1) + "" 사용
		int salary = 3000000;
		String str1 = salary + "";
		System.out.println(str1 + 50000);
		
		// 2-2) Integer.toString(숫자) 사용
		String str2 = Integer.toString(salary);
		System.out.println(str2 + 50000);
		
		// 2-3) String.valueOf(숫자) 사용
		String str3 = String.valueOf(salary);
		System.out.println(str3 + 50000);
	}

}
