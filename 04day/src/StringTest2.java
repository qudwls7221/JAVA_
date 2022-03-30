import java.util.Scanner;

public class StringTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		
		// .length() : 변수에 저장된 문자열을 구성하는 문자의 개수를 얻어온다. 빈칸역시 데이터이기 때문에 빈칸도 같이 계산
		System.out.println("입력한 문자열의 크기 : " + str.length());
		
		// .trim() : 불필요한 빈칸을 제거하고 계산한다. (사이에 띄어쓰기는 적용되고 앞뒤 공란만 뺀다)
		System.out.println("입력한 문자열에서 불필요한 공백을 제거한 문자열의 크기 : " + str.trim().length());
		
		// .toUpperCase() : 입력한 영문자중 소문자들을모두 대문자로 바꿔준다.
		System.out.println("무조건 대문자로 출력 : " + str.toUpperCase());
		
		// .toLowerCase() : 입력한 영문자중 대문자들을모두 소문자로 바꿔준다.
		System.out.println("무조건 소문자로 출력 : " + str.toLowerCase());
		
		// 특정위치의 문자만필요할경우
		// .charAt() : 문자열에서 index 번째 문자를 1문자 얻어온다 위치를 계산할때 0부터 시작한다는 것을 잊지말자. (index 숫자는 0부터시작한다.)
		System.out.println("3번째 문자 : " + str.charAt(2));
		
		sc.close();
		
	}
	
}
