package com.array.practice.example;

import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		
		//길이가 10인 정수형 배열을 만들고 반복문을 이용하여
		//순서대로 배열 인덱스에 넣은 후 그 값을 다음과 같이 출력하세요
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) { //값 넣기
			arr[i] = i+1;
		}
		
		for(int i=0; i<arr.length; i++) { //값 출력
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice2() {
		
		//길이가 10인 정수형 배열을 만들고 반복문을 이용하여
		//역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요

		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) { //값 넣기
			arr[i] = i+1;
		}
		
		for(int i=arr.length-1; i>=0; i--) { //값 출력
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice3() {
		
		//사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		//1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		
		System.out.print("양의 정수 : ");
		int[] arr = new int[sc.nextInt()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}

	}

	public void practice4() {
		
		//길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
		//배열 인덱스를 활용해서 귤을 출력하세요
		
		String[] arr = new String[5]; 
		arr[0] = "사과";
		arr[1] = "귤";
		arr[2] = "포도";
		arr[3] = "복숭아";
		arr[4] = "참외";
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("귤")) {
				System.out.println(arr[i]);
			}
		}
		
	}

	public void practice5() {
		
		//문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		//개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("검색할 문자 :");
		char search = sc.nextLine().charAt(0);
		
		char[] strArr = new char[str.length()];
		int cnt=0; 
		
		for(int i=0; i<strArr.length; i++) { //문자 하나하나 넣기
			strArr[i] = str.charAt(i);
		}
		
		System.out.printf("%s 에 %c가 존재하는 위치(인덱스) : ", str, search);
		for(int i=0; i<strArr.length; i++) { //찾기
			if(strArr[i] == search) {
				System.out.print(i + " ");
				cnt++; 
			}
		}//for
		System.out.printf("\n%c 개수 : %d\n", search, cnt);
		
	}

	public void practice6() {
		
		//“월“ ~ “일” (요일)까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
		//입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		//범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
		
		String[] day = new String[7]; 
		day[0] = "월";
		day[1] = "화";
		day[2] = "수";
		day[3] = "목";
		day[4] = "금";
		day[5] = "토";
		day[6] = "일";
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num < 0 || num > 6) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			System.out.println(day[num] + "요일");
		}
		
		
	}

	public void practice7() {
		
		//사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		//배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		//그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) { //값 넣기
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		

		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println("\n총 합 : " + sum);
		
	}

	public void practice8() {
		
		//3이상인 홀수 정수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		//중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		//단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		//다시 정수를 받도록 하세요.
		
		
		while(true) {
			
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num < 3 || num%2 == 0) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			
			int[] arr = new int[num];
			int midIdx = arr.length/2 +1; //배열의 중간 인덱스 (5이면 3, 7이면 4....)
			
			int midVal = 0; //배열의 값 담는 변수 
			for(int i=0; i<arr.length; i++) { //값 넣기 
				if(i < midIdx) {
					arr[i] = i+1; 
				}else {
					arr[i] = midVal-1; //마지막에 담긴 값 기준에서 -1씩 빼는 과정 
				}
				midVal = arr[i];
				System.out.print(arr[i] + " "); //값 출력
			}//for
			break; //끝내기
		}//while
		
	}
	
	public void practice9() {
		
		//사용자가 입력한 값이 배열에 있는지 검색하여
		//있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
		//단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.

		String[] chicArr = {"뿌링클", "양념", "후라이드", "간장", "순살"}; 
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String chicken = sc.nextLine();
		
		boolean bool = false; //치킨을 찾으면 반복을 바로 멈추기 위한 불린타입 변수 설정
		
		for(int i=0; i<chicArr.length; i++) { //치킨 찾기 
			if(chicArr[i].equals(chicken)) {
				System.out.println(chicken + "치킨 배달 가능");
				bool = true; 
				break; //반복 끝내기 -> 안해주면 원하는 치킨을 찾았음에도 배열 끝까지 계속 찾을것 
			}//if
		}//for
		
		//반복을 다 끝내고 나왔는데도 bool이 false 라면
		if(bool == false) {
			System.out.println(chicken + "치킨은 없는 메뉴입니다.");
		}//if
	
	}
 
	public void practice10() {
		
		//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		//1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) { //값 넣기
			arr[i] = (int)(Math.random() *10 +1);
			System.out.print(arr[i] + " "); //바로 값 출력
		}
		
		
	}

	public void practice11() {
		
		//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		//1~10 사이의 난수를 발생시켜 배열에 초기화 후
		//배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		
		//정렬?....?????????????...음 일단
		//이차원 배열 사용하지 않고 해보기
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) { //값 넣기 
			arr[i] = (int)(Math.random() *10 +1);
			System.out.print(arr[i] + " "); 
		}
		
		int min = arr[0]; //일단 최소값을 첫번째 배열의 값으로 지정
		int max = arr[0]; //일단 최대값을 첫번째 배열의 값으로 지정
		
		for(int i=1; i<arr.length; i++) { //최소값 확인 
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		for(int i=1; i<arr.length; i++) { //최대값 확인 
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);
	
	}

	public void practice12() { 
		
		//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		//1~10 사이의 난수를 발생시켜 "중복된 값이 없게" 배열에 초기화한 후 출력하세요.
		
		int[] arr = new int[10];
		
		
		for(int i=0; i<arr.length; i++) { //현재 대상 
			int random = (int)(Math.random()*10 +1);
			arr[i] = random;
			for(int j=0; j<i; j++) { //비교 대상(0부터 현재 대상(i)전까지 검사 
				if(arr[i] == arr[j]) { //같으면 
					i--; //i 줄여주기 => 왜냐? 다시 랜덤값을 받아서 해당 i에 값을 초기화 해주어야 하니까 -> 284행에서 계속 초기화 될 것임
					break; //가장 가까운 반복문 탈출(안쪽 for 탈출) => 어짜피 중복을 발견했으면 안쪽 반복을 계속할 필요는 없음
				}
			}//안쪽for
		}//바깥쪽 for
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice13() {
		
		//주민등록번호를 String 문자열로 입력 받고 입력 받은 그 문자열을 각 인덱스 별 문자를
		//char[]에 옮겨 담기 (단, 성별 자리 이후부터는 *로 담기)
		
		System.out.print("주민등록번호(-포함) : ");
		String regNo = sc.nextLine();
		
		char[] arr = new char[regNo.length()];
		
		for(int i=0; i<arr.length; i++) {
			if(i < 8) {
				arr[i] = regNo.charAt(i);
			}else {
				arr[i] = '*';
			}
			System.out.print(arr[i]);
		}//for
		
		
	}

	public void practice14() {
		
		//로또 번호 자동 생성기 프로그램을 작성하는데 "중복 값 없이" 오름차순으로 정렬하여 출력하세요.
		
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			int ran = (int)(Math.random() *45 + 1);
			lotto[i] = ran;
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}//안쪽 for
		}//바깥쪽 for
		
		//오름차순 정렬 
		for(int i=1; i<lotto.length; i++) { //현재 대상 인덱스 (1부터 시작)
			for(int j=0; j<i; j++) { //비교 대상들 인덱스 (0부터 시작) 1 vs 0 => 2 vs 0, 2 vs 1 ...
				if(lotto[i] < lotto[j]) {
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}//안쪽 for
		}//바깥 for
		
		for(int i=0; i<lotto.length; i++) { //출력
			System.out.print(lotto[i] + " ");
		}
		
	}

}


