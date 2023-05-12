package step4_01.string;

//# 문자열 1차원

public class StringEx06_필기 {

	public static void main(String[] args) {
		
		String str = "11/100/89";
		// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
		// 정답 1) 200
		
		int[] arr = new int[3];
		String[] temp = str.split("/");
		int tot = 0;
		for (int i = 0; i < temp.length; i++) {
			arr[i] = Integer.parseInt(temp[i]);
		tot += arr[i];
		System.out.println(" tot : " + tot);

		}



	}

}
