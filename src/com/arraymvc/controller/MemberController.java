package com.arraymvc.controller;

import com.arraymvc.model.vo.Member;

public class MemberController {

	public static final int SIZE = 10;
	private int memberCount;
	private Member[] mem = new Member[SIZE]; 

	// �ʱ�ȭ ���� �̿��Ͽ� �⺻���� ȸ�� 5���� ���� �ʱ�ȭ, memberCount �� 5 �ʱ�ȭ
	{
	mem[0] = new Member("user01", "pass01", "������", 20, 'M', "kim12@naver.com");
	mem[1] = new Member("user02", "pass02", "�̼���", 60, 'M', "lee2@naver.com");
	mem[2] = new Member("user03", "pass03", "������", 17, 'F', "yo5@hanmail.net");
	mem[3] = new Member("user04", "pass04", "�����ҹ�", 57, 'M', "yeon@gmail.com");
	mem[4] = new Member("user05", "pass05", "�Ż��Ӵ�", 45, 'F', "shin@naver.com");
	memberCount = 5;
	}
	
	public int getMemberCount() {
		// memberCount ����
		return memberCount;
	}

	public Member[] getMem() {
		// mem �ּ� �� ����
		return mem;
	}

	public Member checkId(String userId) {
		
		Member m = null; // ���̵�� �˻��� ����� ���� ���� �ʱ�ȭ
		
		// mem ���� �Ű������� ���޹��� userId�� ������ ���̵� ������ �ִ� ȸ���� m�� ����
		for(int i=0; i<memberCount; i++) {
			if(mem[i].getUserId().equals(userId)) {
				m = mem[i];
			}
		}
		
		// m ����
		return m;

	}

	public void insertMember(Member m) {
	
		// �Ű������� ���޹��� ȸ����ü�� mem �迭�� �߰�
		mem[memberCount] = m;
		// memberCount 1 ����
		memberCount++;
		
	}

	public Member searchMember(int menu, String search) {
		
		Member searchMember = null; // �˻��� ȸ�� ������ ���� ���� �ʱ�ȭ
		// �Ű������� ���޹��� search ���ڿ��� menu ��ȣ�� ����
		if(menu == 1) {
			// 1 �� ��� ���̵�� �˻� �� ����� searchMember�� �����ϰ�
			searchMember = checkId(search);
		}else if(menu == 2) {
			// 2 �� ��� �̸����� �˻� �� ����� searchMember�� �����ϰ�
			for(int i=0; i<memberCount; i++) {
				if(mem[i].getName().equals(search)) {
					searchMember = mem[i];
					break;
				}
			}//for
		}else {
			// 3 �� ��� �̸��Ϸ� �˻� �� ����� searchMember�� �����ϰ�
			for(int i=0; i<memberCount; i++) {
				if(mem[i].getEmail().equals(search)) {
					searchMember = mem[i];
					break;
				}
			}//for
		}
		
		// searchMember �ּ� �� ����
		return searchMember;
		
	}
	

	public void updateMember(Member m, int menu, String update) {
		
		// �Ű������� ���޹��� m ȸ���� ���� ������ update ���ڿ��� menu�� ����
		switch(menu) {
		case 1 :
			// 1 �� ��� setter �޼ҵ带 �̿��Ͽ� m�� ��й�ȣ�� update ���ڿ��� ����
			m.setUserPwd(update);
			break;
		case 2 :
			// 2 �� ��� setter �޼ҵ带 �̿��Ͽ� m�� �̸��� update ���ڿ��� ����
			m.setName(update);
			break;
		case 3 :
			// 3 �� ��� setter �޼ҵ带 �̿��Ͽ� m�� �̸����� update ���ڿ��� ����
			m.setEmail(update);
			break;
		}
		
	}

	public void deleteMember(String userId) {
		
		int index = 0; //�������� �迭�� �ε��� ���� ����

		// �Ű������� ���޹��� userId�� mem�� �����ϴ� ��� �ش� ȸ�� ���� ��
		for(int i=0; i<memberCount; i++) {
			if(mem[i].getUserId().equals(userId)) {
				mem[i] = null;
				index = i; //index�� ���� �ε��� ����
				break;
			}
		}//for
		
		// ���� �ε��� ��ü���� ������ �� ĭ�� ������ �̵� ��Ŵ
		// ���� �� NullPointerException �߻��� �� ���� -> �� �׷��� �����غ��� �ذ��Ͻÿ�
		if(index != 0) { 
			for(int i=index; i<memberCount; i++) {
				mem[i] = mem[i+1]; 
			}
			memberCount--; // memberCount 1 ����
		}
		
	}

	public Member[] sortIdAsc() {
		
		// ������ ȸ�� ��ü �迭(mem)�� �������� �ʰ� ���� ���ĵ� ������� �����ֱ� ����
		// ������ �迭 �����ؼ� ��� (clone(), System.arraycopy() �� �� �ϳ� ����ؼ� ����) 
		Member[] copy = mem.clone();
		// copy �迭�� ���̵� �� �������� ���� ���� 
		// --> HINT : String Ŭ������ compareTo() �޼ҵ� Ȱ��
		for(int i=0; i<memberCount; i++) {
			for(int j=0; j<i; j++) {
				if(copy[i].getUserId().compareTo(copy[j].getUserId()) < 0) { 
					Member tmp = copy[i];
					copy[i] = copy[j];
					copy[j] = tmp;
				}
			}//for
		}//for
		
		// copy �ּ� �� ����
		return copy;
		
	}

	public Member[] sortIdDesc() {
		
		// ���� ������ ��������� ������������ ���� �� �ּ� �� ����
		Member[] copy = mem.clone();
		for(int i=0; i<memberCount; i++) {
			for(int j=0; j<i; j++) {
				if(copy[i].getUserId().compareTo(copy[j].getUserId()) > 0) { 
					Member tmp = copy[i];
					copy[i] = copy[j];
					copy[j] = tmp;
				}
			}//for
		}//for
		
		// copy �ּ� �� ����
		return copy;
	}

	public Member[] sortAgeAsc() {
		
		// ���� ������ ��������� ���̺� �������� ���� �� �ּ� �� ����
		// (���� ���̱� ������ compareTo ���X)
		Member[] copy = mem.clone();
		for(int i=0; i<memberCount; i++) {
			for(int j=0; j<i; j++) {
				if(copy[i].getAge() - copy[j].getAge() < 0) { 
					Member tmp = copy[i];
					copy[i] = copy[j];
					copy[j] = tmp;
				}
			}//for
		}//for
		
		// copy �ּ� �� ����
		return copy;
		
	}

	public Member[] sortAgeDesc() {
		
		// ���� ������ ��������� ���̺� �������� ���� �� �ּ� �� ����
		// (���� ���̱� ������ compareTo ���X)
		Member[] copy = mem.clone();
		for(int i=0; i<memberCount; i++) {
			for(int j=0; j<i; j++) {
				if(copy[i].getAge() - copy[j].getAge() > 0) { 
					Member tmp = copy[i];
					copy[i] = copy[j];
					copy[j] = tmp;
				}
			}//for
		}//for
		
		// copy �ּ� �� ����
		return copy;
	}

	public Member[] sortGenderDesc() {
		
		// ���� ������ ��������� ���� �� ������������ ���� �� �ּ� �� ����
		// (���� ������ ����)
		//�� = M = 77
		//�� = F = 70
		Member[] copy = mem.clone();
		for(int i=0; i<memberCount; i++) {
			for(int j=0; j<i; j++) {
				if(copy[i].getGender() > copy[j].getGender()) { 
					Member tmp = copy[i];
					copy[i] = copy[j];
					copy[j] = tmp;
				}
			}//for
		}//for
		
		//copy �ּ� �� ����
		return copy;
	}
	
}
