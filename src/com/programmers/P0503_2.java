package com.programmers;

import java.util.Arrays;

public class P0503_2 {
	//제일 작은 수 제거하기
	
	public static void main(String[] args) {
		
		int[] arr = {4, 3, 2, 1};
		
		//1.내 풀이 방법
		
		//먼저 배열을 오름차순으로 만드는 반복문 실행
		/*for(int i=1; i<arr.length; i++) { //비교주체
			for(int j=0; j<i; j++) { //비교대상들(비교주체인 i전까지만 확인)
				if(arr[j] > arr[i]) { //앞에있는 j번쨰가 뒤의 i번째보다 크다면 
					temp(j, i, arr); //자리를 바꿔주는 메소드 호출
				}
			}
		}//for
		
		int[] newArr;
		
		if(arr.length > 1) {
			//가장 작은 맨 앞의 수를 제외한, 인덱스 1번부터 arr 배열 끝까지 새로운 배열 newArr에 담기
			newArr = Arrays.copyOfRange(arr, 1, arr.length);
		}else {
			newArr = new int[]{-1};
		}
		
		System.out.println(Arrays.toString(newArr));*/
	
		
		//2.다른 풀이방법 => 오름차순을 하지 않아도 된다. 오름차순을 하면 테스트 케이스에서 탈락됨.
		
		int[] newArr;
		
		//먼저 길이가 1인 경우에 요소를 -1로 초기화
		if(arr.length == 1) {
			newArr = new int[]{-1};
		}else {
			int minidx = 0; //가장 작은 값을 갖고있는 요소의 인덱스
			
			for(int i=0; i<arr.length; i++) {
				if(arr[minidx] > arr[i]) { //i번째가 minidx번째보다 작으면
					minidx = i; //가장 작은값의 인덱스를 i로 초기화
				}
			}//for
			
			//원래 배열보다 길이가 1작은 배열로 생성
			newArr = new int[arr.length-1];
			
			int cnt = 0; //새 배열의 인덱스를 표시할 변수
			
			for(int i=0; i<arr.length; i++) {
				if(i == minidx) continue; //최소값의 인덱스면 건너뛰고
				newArr[cnt++] = arr[i];
			}
		}
		
		System.out.println(Arrays.toString(newArr));
		
	}

	
	
	/*public static void temp(int idx1, int idx2, int[] arr) {
		
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		
	}*/

}
