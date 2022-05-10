package com.programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class P0510_3 {
	//같은 숫자는 싫어
	
	public static void main(String[] args) {
	
		//내 풀이 : 반환형을 ArrayList<Integer>로 함
		int[] arr = {1, 1, 3, 3, 0, 1, 1}; 
		/*ArrayList<Integer> list = new ArrayList<Integer>(); //반환할 결과 
		
		list.add(arr[0]); //0번째는 무조건 추가
		
		for(int i=1; i<arr.length; i++) { //1번째부터 검사
			if(arr[i] == arr[i-1]) continue; //i번째랑 i의 바로 앞번째랑 일치할 경우 pass
			list.add(arr[i]); //위의 if문에 걸리지 않으면(바로 앞번째랑 일치하지 않은 경우) list에 추가
		}//for
		
		//확인
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		
		
		//다른 풀이 : 반환형을 int[]로 함
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		
		//비교하고자 하는 기준 숫자를 preNum에 대입
		//배열 arr의 0번째 값을 대입
		int preNum = arr[0]; 
		list.add(arr[0]); //0번째는 무조건 추가해야 하므로 list에 바로 추가
		for(int num : arr) {
			if(preNum != num) { //같지 않을 때만 
				list.add(num); //list에 추가하기
			}
			preNum = num; //비교 기준 숫자 preNum을 반복을 통해 계속 update 하는 방식
		}
		
		//list에 담겨있는 크기 만큼 배열 크기 지정
		int[] answer = new int[list.size()];
		
		for(int i=0; i<answer.length; i++) {
			//intValue() : 값을 int형으로 바꿔주는 역할이다. 
			//현재 list에 담겨있는 요소들은 Integer이기 때문에 정확하게는 int로 바꿔주어야 함.
			answer[i] = list.get(i).intValue();
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
