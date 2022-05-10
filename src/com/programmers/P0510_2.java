package com.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P0510_2 {
	//나누어 떨어지는 숫자 배열
	
	public static void main(String[] args) {
		
		int[] arr = {2, 36, 1, 3};
		int n = 1;
		
		//나의 풀이
		//결과를 반환할 list
		/*ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i : arr) { //배열 arr의 모든 요소를 검사
			if(i%n == 0) { //n으로 나누어 떨어지면
				list.add(i); //list에 추가하기
			}
		}//for
		
		if(list.isEmpty()) {
			list.add(-1);
		}else {
			Collections.sort(list); //list 오름차순 정렬
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		
		//다른 풀이
		//람다식 사용
		//1. 스트림 생성 : Arrays.stream(arr) => IntStream 생성
		//2. 생성된 스트림을 오름차순으로 정렬 : sorted()
		//3. 스트림의 요소(i)를 확인하여 n으로 나누어 떨어지는지 검사 : filter(i -> i%n == 0)
		//4. 스트림을 다시 배열로 변경 : toArray()
		int[] newArr = Arrays.stream(arr).sorted().filter(i -> i%n == 0).toArray();
		if(newArr.length == 0) {
			newArr = new int[]{-1};
		}
		//Arrays.sort(newArr); //위 42행에서 sorted()를 사용하는 방식으로 변경
		System.out.println(Arrays.toString(newArr));
	}

}
