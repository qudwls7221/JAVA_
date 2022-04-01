import java.util.Scanner;

public class IfTest1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("3과목 점수를 입력하세요 : ");
		int java = sc.nextInt();
		int jsp = sc.nextInt();
		int spring = sc.nextInt();
		
		int total = java + jsp + spring;
		double average = (double) total / 3;
//		double average = total / 3.; 같은 결과로 출력된다
		
//		System.out.println("평균 점수 : "+ average);
		System.out.printf("평균 점수 : %6.2f\n",  average);
		
//    else 가 없을때 아래 함수의 경우 이미 결과가 도출된상태에서 불필요한 연산을 하기때문에 비효율적이다
//    else 를 추가하면서 앞에 &&역시 필요없음
		
		
//    불링형 으로 계산하기 떄문에 참, 거짓만 출력된다.
		if(average >= 90) {
			System.out.println("수");
		} else	if(average >= 80) { //		AND 함수를 이용했다 즉 90보다 작고 80보다 클경우 참을 출력시킨다 (else 가없을떄 사용했다)
			System.out.println("우");
		} else	if(average >= 70) {
			System.out.println("미");
		} else	if(average >= 60) {
			System.out.println("양");
		} else  {
			System.out.println("가");
		}
		
	}
	
}
