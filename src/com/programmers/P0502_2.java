package com.programmers;

import java.util.Arrays;
import java.util.Scanner;

public class P0502_2 {
	//x��ŭ ������ �ִ� n���� ����
	public static long[] solution(int x, int n) {
	        
    	long[] answer = new long[n];
    	
    	//ex) x=2, n=5 �� ��, answer = {2, 4, 6, 8, 10}
    	//��Ģ�� ���캸�� 2*1, 2*2, ...
    	//x*(i+1) �� �����ص� �ǰ�, (x*i)+x �� �����ص� �ȴ�
        for(int i=0; i<n; i++){
        	//answer[i] = (x*i)+x;
        	answer[i] = (long)x*(i+1);
        	//long Ÿ������ ����ȯ�� ���ִ� ����
        	//�Ű������� ������ x�� int Ÿ���̹Ƿ� ����ȯ�� ���־�� �Ѵ�. 
        	//���� ����ȯ�� ������ �ʴ´ٸ� x�� long Ÿ���� �׽�Ʈ���̽����� ���з� ó�� ��
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
