import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3과목의 점수를 입력하세요 : ");
		int java = sc.nextInt();
		int jsp = sc.nextInt();
		int spring = sc.nextInt();
		
		int total = java + jsp + spring ;
		double average = (double) total / 3 ;
		
// 	key 값은 정수를 기억하는 변수 또는 연산결과가 정수인 수식, 자바 1.7 부터 문자열도 가능하다.
//	 	switch (key) {
//			case value: 		//":" 임을 주의한다.
// 			key와 value가 일치할경우 실행할 문장;
// 			...;
//				[break;]   		// if문을 제외한 나머지 제어문의 {} 블록을 탈출한다.
//			...;
//			[default:
//				key와 일치하는 value 가없을 경우 실행할 문장;
//				...;
//				break;]
		
		switch ((int)average / 10) {
			case 10: //평균 점수가 100점인 case 냐? c++이나 Java는 case에 >= 같은거못씀
				System.out.println("참잘했어요.");
//				System.out.println("수"); 	break;
			case 9:
				System.out.println("수");	break;
			case 8:
				System.out.println("우");	break;
			case 7:
				System.out.println("미");	break;
			case 6:
				System.out.println("양");	break;
//			case 5: case 4: case 3:  case 2: case 1: case  0:
			default:
				System.out.println("가");	break; //c#의 경우 break; 마지막껀 적어야한다.
		}
		
	}
	
}
