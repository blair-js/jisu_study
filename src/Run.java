import java.util.Scanner;

public class Run {

	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//a���� b������ ��
		/*System.out.print("���� a : ");
		int a = sc.nextInt();
		
		System.out.print("���� b : ");
		int b = sc.nextInt(); 
		
		int result = sum(a,b); //�հ� �޼ҵ� ȣ�� 
		System.out.println(a + " ����" + b + " ������ ���� : " + result);
		*/
		
		//���콺 ���� 1���� n����
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		
		int res = gaus(n);
		System.out.println("1���� " + n + " ������ ���� : " + res);
		
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
