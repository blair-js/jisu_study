package com.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B1912 {

	public static void main(String[] args) {

		//n개의 정수로 이루어진 임의의 수열이 주어진다. 우리는 이 중 연속된 몇 개의 수를 선택해서 구할 수 있는 합 중 가장 큰 합을 구하려고 한다. 
		//단, 수는 한 개 이상 선택해야 한다.
		//예를 들어서 10, -4, 3, 1, 5, 6, -35, 12, 21, -1 이라는 수열이 주어졌다고 하자. 
		//여기서 정답은 12+21인 33이 정답이 된다.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //개수 입력받기
		
		//입력받은 개수 만큼 배열 생성
		int[] arr = new int[n];
		
		//메모이제이션에 필요한 배열도 생성
		int[] dp = new int[n]; //해당 인덱스까지의 연속하는 합 중 최대값을 저장할 배열이다. 
		
		//배열 arr의 i번째에 값 대입 
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//최댓값 검사하기
		for(int i=0; i<n; i++) { 
			
			//먼저 최대값을 넣어주는 곳에 
			//해당 arr i번째의 값을 넣는다. 
			dp[i] = arr[i];
			
			//해당 인덱스가 0번째일때는
			if(i == 0) {
				continue; //아래 코드를 실행하지 않고 건너뛰기 => 해당 i번째 앞에는 숫자가 존재하지 않음
			}
			
			//i가 0이 아닌 나머지는 아래의 조건을 검사 
			//현재 dp[i]는 위에서 arr[i]를 담아주었음. 
			//즉, arr의 i번째 인덱스 값 vs arr의 i번째 인덱스 값 + 앞에서 구한 최대값 dp[i-1]을 비교
			if(arr[i] + dp[i-1] > dp[i]) { //만약 arr의 i번째 인덱스 값 + 앞에서 구한 최대값 dp[i-1]이 더 크다면 
				dp[i] = arr[i] + dp[i-1]; //dp[i]를 그 값으로 대체한다.
			}//if
			
		}

		//오름차순 정렬 후 
		Arrays.sort(dp);
		//마지막 인덱스의 값을 뽑으면 된다.
		System.out.println(dp[n-1]);
		
	}

}
