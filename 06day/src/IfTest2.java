import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {
		
//   윤년 평년 계산
		
//		입력을 키보드에서 받는다
		Scanner sc = new Scanner(System.in);
		System.out.print("윤년/평년을 판별할 년도를 입력하세요 : ");
//  	입역은 year 이라는 변수에 띄어쓰기상관없이 전체를 받아들인다.
		int year = sc.nextInt();
		
		
// 	프로그램에서 여러번 사용되는 값은 변수에 저장시켜 사용하면 편리하다.
// 	논리값을 기억하는 변수나 논리값을 리턴하는 메소드의 이름은 "is" 로시작하는 것이 관행이다.
		boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		
		
//		년도가 4로 나줘 떨어지고(&&) 100으로 나눠떨어지지않거나(||) 400을 나눠떨어지면 윤년, 그렇지않으면 평년
		if(isLeapYear) {
			System.out.println(year + "년은 윤년 입니다.");
		} else {
			System.out.println(year + "년은 평년입니다.");
		}
		
//		삼항 연산자(?)
// 	if의 조건을 비교한 결과 조건이 참일때와 거짓일때 실항할 문장이 각각 1문장인 경우 사용하면 편리하다.
//		조건식 ? 조건식이 참일 경우 실행할 내용 : 조건식이 거짓일 경우 실행할 내용
		
		//              아래의 경우 삼항조건식이다 아래 조건들이 참일경우 왼쪽 "윤출력 거짓일경우 "평 출력 ?를 넣어야 사용가능하다
		System.out.println(year + "년을" + (isLeapYear ? "윤" : "평") + "년입니다.");
		
		
		sc.close();
		
	}
	
}
