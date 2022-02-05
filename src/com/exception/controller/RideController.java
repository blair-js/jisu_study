package com.exception.controller;

import com.exception.model.vo.Guests;
import com.exception.model.vo.RollerCoaster;

public class RideController {

	// �Ű����� �����ڸ� �̿��Ͽ� 4���� ��ü �ʱ�ȭ
	Guests[] gs = {
					new Guests("ȫ�浿", 17, 'M', 120.2),
					new Guests("������", 20, 'F', 102.3),
					new Guests("������", 23, 'M', 110.4),
					new Guests("�����", 21, 'M', 112.5)
	};
	
	// ���̱ⱸ ��� �ο��� ũ���� ��ü �迭 ����
	Guests[] onboard = new Guests[RollerCoaster.PERMITNUMBER];
	
	public RideController() {	}
	
	public void cutGuests() {
	
		// 4���� ž�� ����ڸ� �����ڸ� ���� Guest��ü �迭 �ʱ�ȭ (Guests[] gs) => ������ �� 
		// RollerCoaster Ŭ������ ����ο� ����� ũ���� �� �ٸ� ��ü �迭 ���� => ������ �� 
		
		
		
		int onIdx = 0; //onBoard �迭�� �ε����� ����� ������
		
		try {
			for(int i=0; i<gs.length; i++) {
				// for���� if���� ���� RollerCoaster Ŭ������ ���Ű ����� ũ��
				// �̻��� ����� Guests��ü �迭 onBoard�� ��´�.
				if(gs[i].getHeight() >= RollerCoaster.CUTHEIGHT) {
					onboard[onIdx++] = gs[i]; 
				}//if
			}//for
		}catch(ArrayIndexOutOfBoundsException e) {
			// �迭 ũ�⸦ �Ѿ�� �߻��Ǵ� ����Ŭ���� ������ ���� e
			//onboard �迭�� ũ��� 2 �ε� �θ� �̻� �������� �ϸ� ������ �߻���
			
			// ������ �߻��� �ش� �迭�� �ε��� ��ȣ�� ������� �߻��ϴ���
			// ThrowableŬ������ getMessage()�޼ҵ带 ���� ���
			String msg = e.getMessage(); //���� �޽����� ���� 
			//System.out.println(msg); //���� Index 2 out of bounds for length 2 ��� ����(�����Ǵ� �ε����� �޽����� �������� ����)
			char last = msg.charAt(msg.length()-1); //���� ������ ������ ��°�� �̰���
			System.out.println("������ �߻��� �ش� �迭�� �ε��� ��ȣ : " + last);
			
		}finally {
			// "�ο��� ���� á���ϴ�. ���� ���ʸ� ��ٸ�����"
			// "�̹� ���� ž�� ���"
			// ž���� ������ �̸�, Ű�� ����ϰ� �� ž������ ����հ踦 ��� �Ͻÿ�
			System.out.println("�ο��� ���� á���ϴ�. ���� ���ʸ� ��ٸ�����"); 
			System.out.println("�̹� ���� ž�� ���");
			for(Guests g : onboard) {
					System.out.println(g.toString());
			}
			System.out.println("ž���� ��� : " + RollerCoaster.PRICE * onboard.length);
		}
		
	}
	
}
