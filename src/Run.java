import java.util.Scanner;

public class Run {

	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//a부터 b까지의 합
		/*System.out.print("정수 a : ");
		int a = sc.nextInt();
		
		System.out.print("정수 b : ");
		int b = sc.nextInt(); 
		
		int result = sum(a,b); //합계 메소드 호출 
		System.out.println(a + " 부터" + b + " 까지의 합은 : " + result);
		*/
		
		//가우스 덧셈 1부터 n까지
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		int res = gaus(n);
		System.out.println("1부터 " + n + " 까지의 합은 : " + res);
		
	}
	
	public static int sum(int a, int b) {
		
		
		int max = b;
		int min = a; 
		
		if(a > b) {
			max = a; 
			min = b;
		}
		
		int sum = 0; 
		for(int i=min; i<=max; i++) {
			sum += i;
		}

		return sum;
		
	}

	public static int gaus(int n) {
		
		int result; 
		
		result = (1+n)*(n/2) + ((n%2 == 1) ? (n+1)/2 : 0); 
		
		return result;
		
	}

}
