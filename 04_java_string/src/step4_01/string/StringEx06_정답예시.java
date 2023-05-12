package step4_01.string;

//# 문자열 1차원

public class StringEx06_정답예시 {

	public static void main(String[] args) {
		
		String str = "11/100/89";
		
		// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
		// 정답 1) 200
		
		int[] arr = new int[3]; //3개 문장이 있다는 것.
		
		String[] temp = str.split("/"); //

		int tot = 0; //총 합계 얼마인지 초기설정.
		for (int i = 0; i < temp.length; i++) { // for문.
			arr[i] = Integer.parseInt(temp[i]); // 
			tot += arr[i];
		}
		System.out.println("tot = " + tot);
		
		
		
		// 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		// 정답 2) 11/100/89
		
		int[] scores = {11, 100, 89};
		String text = ""; //현재는 이거다
		
		for (int i = 0; i < scores.length; i++) {
			text += scores[i] + "";
			if (i != scores.length-1) {
				text += "/"; //for문으로 이용해  / 이걸 넣을꺼다
			}
		}
		System.out.println(text);



	}

}
