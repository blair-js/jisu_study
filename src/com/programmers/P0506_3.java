package com.programmers;

public class P0506_3 {
	//문자열을 정수로 바꾸기
	
	public static void main(String[] args) {
		
		String str = "-1234";
		//System.out.println(Integer.parseInt(str));
		//API를 사용하여 풀면 위처럼 단순하지만, 코드로 구현해보기!

		//참고 풀이
		boolean Sign = true; //맨 앞의 부호(+,-)를 판단하기 위한 변수
        int result = 0; //최종 숫자가 될 결과값

        //문자열의 길이만큼 반복
        for (int i = 0; i < str.length(); i++) {
        	
            char ch = str.charAt(i); //앞에서부터 순서대로 문자 추출
            
            if (ch == '-') { //해당 i번째 요소 ch가 음의 부호(-)이면 
                Sign = false; //Sign 값을 false로 변경 : 마지막에 추출된 숫자 result에 1을 곱할지 -1을 곱할지 결정하는 변수이다.
            }else if(ch != '+') //해당 i번째 요소 ch가 양의 부호(+)가 아니면 => 즉, '-'도 아니고 '+'도 아닌 것 => 숫자 형태의 문자라는 의미(ex. '2'인 상태) 

            	result = result * 10 + (ch - '0');
	            //result에 값을 누적시킨다 : result에 10을 곱한 값에 각 자리숫자에 char 타입의 '0'을 빼준다. **char형의 연산 결과는 int형이다.**
            	//result의 연산 과정 
            	//ex) str = "-1234"인 경우
            	//result = 0 * 10 + ('1' - '0') = 0 + 1 = 1
            	//result = 1 * 10 + ('2' - '0') = 10 + 2 = 12
            	//result = 12 * 10 + ('3' - '0') = 120 + 3 = 123
            	//result = 123 * 10 + ('4' - '0') = 1230 + 4 = 1234
        }
        
        //위에서 얻은 result는 무조건 양의 정수이다. (먼저 부호를 떼어놓고 생각했기 때문)
        //Sign 변수에 기존의 부호(+, -) 여부를 저장해두었으니 얻은 결과 result에 -1 or 1만 곱해주면 된다.  
        System.out.println((Sign? 1 : -1) * result);
		
	}

}
