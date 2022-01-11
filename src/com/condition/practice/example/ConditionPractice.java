package com.condition.practice.example;

import java.util.Scanner;

public class ConditionPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		//아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
		//종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요
	
		System.out.println("1.입력");
		System.out.println("2.수정");
		System.out.println("3.조회");
		System.out.println("4.삭제");
		System.out.println("9.종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		
		String str = "";
		
		switch(menu) {
		case 1:
			str = "입력 ";
			break;
		case 2:
			str = "수정 ";
			break;
		case 3:
			str = "조회 ";
			break;
		case 4:
			str = "삭제 ";
			break;
		case 9:
			System.out.println("종료 합니다.");
			return;
		default :
			System.out.println("번호를 다시 입력하세요.");
			return;
		}
		
		System.out.println(str + "메뉴 입니다.");
		
	}
	
	public void practice2() {
		
		//키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
		//짝수가 아니면 “홀수다“를 출력하세요.
		//양수가 아니면 “양수만 입력해주세요.”를 출력하세요
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num%2 == 0) {
				System.out.println("짝수다");
			}else {
				System.out.println("홀수다");
			}
		}else {
			System.out.println("양수만 입력해주세요.");
		}
	}

	public void practice3() {
		
		//국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		//합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		//(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		//합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		//불합격인 경우에는 “불합격입니다.”를 출력하세요
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		double cnt = 3.0;
		int sum = kor + math + eng;
		double avg = sum / cnt;
		
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
				System.out.printf("국어 : %d\n수학 : %d\n영어 : %d\n", kor, math, eng);
				System.out.printf("합계 : %d\n평균 : %.1f\n", sum, avg);
				System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격 입니다.");
		}
		
	}

	public void practice4() {
		
		//수업 자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.
		/*
		 * if(month == 1 || month == 2 || month == 12) {
			season = "겨울";
			} else if(month >= 3 && month <= 5) {
			season = "봄";
			} else if(month >= 6 && month <= 8) {
			season = "여름";
			} else if(month >= 9 && month <= 11) {
			season = "가을";
			} else {
			season = "해당하는 계절이 없습니다.";
			}
		 */
		
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		
		String season = "";
		switch(month) {
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		case 12: case 1: case 2:
			season = "겨울";
			break;
		default :
			System.out.println("해당하는 계절이 없습니다.");
			return;
		}
		
		System.out.println(month + "월은 " + season + " 입니다.");
	}

	public void practice5() {
		
		//아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
		//로그인 성공 시 “로그인 성공”,
		//아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
		//비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요
		
		String id = "user1";
		String pw = "1234";
		
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
		System.out.print("비밀번호 : ");
		String userPw = sc.nextLine();
		
		if(userId.equals(id) && userPw.equals(pw)) {
			System.out.println("로그인 성공");
		}else { //로그인 실패 경우의 수 3개 
			if(userId.equals(id)) {
				System.out.println("패스워드가 틀렸습니다.");
			}else if(userPw.equals(pw)){
				System.out.println("아이디가 틀렸습니다.");
			}else {
				System.out.println("아이디와 비밀번호 모두 틀렸습니다.");
			}
		}
		
		
	}
	
	public void practice6() {
	
		//사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
		//단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		//회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		//비회원은 게시글 조회만 가능합니다.
		//(단, 잘못 입력하였을 경우 “잘못 입력했습니다.” 라는 출력문이 출력되도록)
		
		String admin = "회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성";
		String user = "게시글 작성, 게시글 조회, 댓글 작성";
		String noUser = "게시글 조회";
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String grade = sc.nextLine();
		
		String aut = "";
		switch(grade) {
		case "관리자":
			aut = admin;
			break;
		case "회원":
			aut = user;
			break;
		case "비회원":
			aut = noUser;
			break;
		default :
			System.out.println("잘못 입력했습니다.");
			return;
		}
		
		System.out.println(aut);
		
	}

	public void practice7() {
		
		//키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
		//저체중 / 정상체중 / 과체중 / 비만을 출력하세요.
		//BMI = 몸무게 / (키(m) * 키(m))
		//BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
		//BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
		//BMI가 30이상일 경우 고도 비만
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / Math.pow(height, 2);

		String result = "";
		
		if(bmi < 18.5) {
			result = "저체중";
		}else if(bmi < 23) {
			result = "정상체중";
		}else if(bmi < 25) {
			result = "과체중";
		}else if(bmi < 30) {
			result = "비만";
		}else {
			result = "고도비만";
		}
		
		System.out.println("BMI 지수 : " + bmi + "\n" + result);
		
	}
	
	public void practice8() {
		
		//키보드로 두 개의 양수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
		//(단, 양수가 아닌 값을 입력하거나 제시되어 있지 않은 연산 기호를 입력 했을 시
		//“잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)
		//(printf()문을 이용하여 마지막 출력문을 작성해보시오.)
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String op = sc.nextLine();
		
		int result = 0;
		if(num1 > 0 && num2 > 0) {
			switch(op) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			case "%":
				result = num1 % num2;
				break;
			default : 
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				return; 
			}
		}else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
		
		System.out.printf("%d %s %d = %d", num1, op, num2, result);
	}

	public void practice9() {
		
		//중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
		//총 점 100점 중 배점으로는 다음과 같다.
		//중간고사 (20%), 기말고사 (30%), 과제 (30%), 출석 (20%)
		//이 때, 출석 회수는 총 강의 회수 20회 중에서 출석한 날만 입력
		//총 점이 70점 이상이면서 전체 강의의 70%이상 출석을 했을 경우 Pass,
		//아니면 Fail을 출력하세요.
	
		System.out.print("중간 고사 점수 : ");
		double midScore = sc.nextDouble() * 0.2;
		System.out.print("기말 고사 점수 : ");
		double finScore = sc.nextDouble() * 0.3;
		System.out.print("과제 점수 : ");
		double work = sc.nextDouble() * 0.3;
		System.out.print("출석 횟수 : ");
		double attn = sc.nextDouble();
		
		double totalScore = midScore + finScore + work + attn; 
		
		int stdScore = 70; //점수 커트라인

		int perAttn = 20; //출석률 100%
		int stdAttn = (int)(perAttn * 0.7); //출석 커트라인
		
		System.out.println("========= 결과 =========");
		if(totalScore >= stdScore && attn >= stdAttn) { //합격
			System.out.printf("중간 고사 점수(20) : %.1f\n", midScore);
			System.out.printf("기말 고사 점수(30) : %.1f\n", finScore);
			System.out.printf("과제 점수    (30) : %.1f\n", work);
			System.out.printf("출석 점수    (20) : %.1f\n", attn);
			System.out.printf("총점 : %.1f\n", totalScore);
			System.out.println("PASS");
		}else { //불합격 
			if(totalScore >= stdScore) {
				System.out.printf("FAIL [출석 횟수 부족] (%.0f/%d)\n", attn, perAttn);
			}else if(attn >= stdAttn){
				System.out.printf("FAIL [점수미달] (총점 %.1f)\n", totalScore);
			}else {
				System.out.printf("FAIL [출석 횟수 부족] (%.0f/%d)\n", attn, perAttn);
				System.out.printf("FAIL [점수미달] (총점 %.1f)\n", totalScore);
			}
		}
		
	}

	public void practice10() {
		
		//앞에 구현한 실습문제를 선택하여 실행할 수 있는 메뉴화면을 구현하세요.
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1.메뉴 출력");
		System.out.println("2.짝수/홀수");
		System.out.println("3.합격/불합격");
		System.out.println("4.계절");
		System.out.println("5.로그인");
		System.out.println("6.권한 확인");
		System.out.println("7.BMI");
		System.out.println("8.계산기");
		System.out.println("9.Pass/Fail");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1: 
			practice1();
			break;
		case 2: 
			practice2();
			break;
		case 3: 
			practice3();
			break;
		case 4: 
			practice4();
			break;
		case 5: 
			practice5();
			break;
		case 6: 
			practice6();
			break;
		case 7: 
			practice7();
			break;
		case 8: 
			practice8();
			break;
		case 9: 
			practice9();
			break;
		default :
			System.out.println("번호를 다시 입력하세요.");
			return;
		}
		
	}
	
}
