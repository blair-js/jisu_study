package com.programmers;

import java.util.Arrays;

public class P0502_3 {
	//행렬의 덧셈 
	
	public static void main(String[] args) {
		
		int[][] arr1 = {{1,2}, {2,3}};
		int[][] arr2 = {{3,4}, {5,6}};

		//풀이1.내 방법
		/*int[][] answer = new int[arr1.length][arr1[0].length];
		
		for(int i=0; i<answer.length; i++) {
			for(int j=0; j<answer[i].length; j++) {
				answer[i][j] = arr1[i][j]+arr2[i][j];
			}
		}*/
		
		//풀이2.다른 방법
		//위 14행 처럼 매개변수로 들어온 배열을 갖고 answer의 크기를 지정해도 되지만
		//이미 문제에서 크기가 동일한 배열이라고 설명해주었기 때문에 아래처럼 기존 배열 하나를 결과 배열에 대입 후 
		//남은 배열의 값들을 누적시키는 방법도 좋은 방법이다.
		int[][] answer = arr1; 
		for(int i=0; i<answer.length; i++) {
			for(int j=0; j<answer[i].length; j++) {
				answer[i][j] += arr2[i][j];
			}
		}
		
		System.out.println(Arrays.toString(answer[0]));
		System.out.println(Arrays.toString(answer[1]));
		
	}

}
