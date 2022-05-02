package com.programmers;

import java.util.Arrays;
import java.util.Scanner;

public class P0502_2 {
	//x만큼 간격이 있는 n개의 숫자
	public static long[] solution(int x, int n) {
	        
    	long[] answer = new long[n];
    	
    	//ex) x=2, n=5 일 때, answer = {2, 4, 6, 8, 10}
    	//규칙을 살펴보면 2*1, 2*2, ...
    	//x*(i+1) 로 접근해도 되고, (x*i)+x 로 접근해도 된다
        for(int i=0; i<n; i++){
        	//answer[i] = (x*i)+x;
        	answer[i] = (long)x*(i+1);
        	//long 타입으로 형변환을 해주는 이유
        	//매개변수로 들어오는 x가 int 타입이므로 형변환을 해주어야 한다. 
        	//만약 형변환을 해주지 않는다면 x가 long 타입인 테스트케이스에서 실패로 처리 됨
        }
        
        return answer;
    }
  
	
	public static void main(String[] args) {
		  
	    Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    int n = sc.nextInt();
	    
	    System.out.println(Arrays.toString(solution(x, n)));
	}

	
}
