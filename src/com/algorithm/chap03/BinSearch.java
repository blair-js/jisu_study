package com.algorithm.chap03;

import java.util.Scanner;

public class BinSearch {

	//요소가 n개인 배열 a에서 key를 찾기 
	static int binSearch(int[] a, int n, int key) {
		
		int pl = 0; //요소의 첫번째 인덱스
		int pr = n-1; //요소의 마지막 인덱스 
		
		do {
			int pc = (pl + pr) / 2; //요소의 중간 값 = 첫번째 인덱스 + 마지막 인덱스 / 2
			if(a[pc] == key) { //중간 값이 찾고자 하는 key와 같다면
				return pc;  //해당 인덱스 반환
			}else if(a[pc] < key) { //중간 값이 찾고자 하는 key값보다 작다면 => 검색 범위를 뒤쪽 절반으로 좁힌다.
				pl = pc + 1; //요소의 첫번째 인덱스를 중간 값의 다음으로 초기화
			}else { //중간 값이 찾고자 하는 key값보다 크다면 => 검색 범위를 앞쪽 절반으로 좁힌다. 
				pr = pc - 1; //요소의 마지막 인덱스를 중간 값의 이전으로 초기화
			}
		}while(pl <= pr); 
		 //검색 범위의 시작과 끝이 같거나, 시작이 끝보다 작을때만 반복! => 시작이 끝보다 커지는 순간은 찾고자하는 key가 배열에 없다는 의미
		
		return -1; //검색 실패
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소수 : ");
		int num = sc.nextInt(); 
		
		int[] x = new int[num];
		
		
		System.out.println("오름차순으로 입력하세요."); //정렬된 데이터를 기준으로 검색해야 하므로!
		System.out.print("x[0] : ");
		x[0] = sc.nextInt(); 
		
		for(int i=1; i<num; i++) { //0번째는 위에서 담았으니, 1번째부터 값 입력받기
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = sc.nextInt(); 
			}while(x[i] < x[i-1]); //현재 입력한 값이, 현재 인덱스 바로 앞의 값보다 작으면 다시 입력받도록 하기
		}//for
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		int idx = binSearch(x, num, key);
		
		if(idx == -1) {
			System.out.println("해당하는 값이 없습니다.");
		}else {
			System.out.println(key + "는 배열의 " + idx + "번째에 있습니다.");
		}//if-else
		
	}

}
