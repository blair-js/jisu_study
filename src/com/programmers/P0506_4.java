package com.programmers;

public class P0506_4 {
	//���ڼ��ڼ��ڼ��ڼ��ڼ�?
	
	public static void main(String[] args) {
		
		//��Ģ�� ���� ã�ƺ��� �Ʒ��� ����.
		//n = 1 �̸�? "��"
		//n = 2 �̸�? "����"
		//n = 3 �̸�? "���ڼ�"
		//n = 4 �̸�? "���ڼ���"
		//��Ģ1 : ���ڿ��� Ȧ����° �ε������� "��"�� ����, ¦����° �ε������� "��"�� �´�.
		
		int n = 4;
		StringBuilder sb = new StringBuilder();
		
		//���1 : for�� ��� => n�� ���̸�ŭ �ݺ��� �ؼ� �ڸ��� ���� ���� �߰�
		for(int i=0; i<n; i++) {
			
			/*if(i%2 == 0) { //¦����°��� 
				sb.append("��"); //"��" �߰�
			}else { //Ȧ����°���
				sb.append("��"); //"��" �߰�
			}*/
			
			//���׿����ڷε� ���� 
			sb.append(i%2 == 0 ? "��" : "��");
			
		}

		System.out.println(sb);
		
		//���2 : while�� ��� => n�� ���̸�ŭ �ݺ��� �ؼ� �ڸ��� ���� ���� �߰�
		int idx = 0;
		while(idx<n) {
			sb.append(idx%2 == 0 ? "��" : "��");
			idx++;
		}
		
	}

}
