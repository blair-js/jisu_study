package com.programmers;

public class P0504_2 {
	//정수 내림차순으로 배치하기

	public static void main(String[] args) {

		int n = 118372;
		int[] arr = new int[(n + "").length()]; //n의 길이를 구하기 위해 문자열로 변환(+"") 후 뽑기
		
		arr[0] = n/(int)Math.pow(10, (arr.length-1)); //맨 앞자리 숫자만 0번째에 먼저 담아두기
		
		for(int i=1; i<arr.length; i++) { //0번째를 제외한 1번째 부터 반복
			
			arr[i] = n%10; //n을 10으로 나눈 나머지를 배열 i번째에 일단 저장 => 비교주체
			
			for(int j=0; j<i; j++) { //비교대상들
				if(arr[j] < arr[i]) { //j번째가 i번째보다 작으면 체인지(내림차순이므로)
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
			
			n/=10; //n을 10으로 나눈다. ex) n의 변화 118372 -> 11837 -> 1183....
			
		}//for
		
		String str = ""; //최종적으로 내림차순으로 담긴 배열을 문자열로 연결하기 위한 변수
		for(int i : arr) {
			str += String.valueOf(i);
		}
		
		System.out.println(str); //873211
		
		
	}

}
