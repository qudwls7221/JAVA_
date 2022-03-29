import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age = 0;
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		//문자열을 제외한 데이터를 입력받은 후 nextLine() 메소드가 실행이 되야 한다면 키보드 버퍼의 엔터키를 읽어들이는 문제가 발생된다.
		//문자열을 제외한 데이터를 입력받은 후 키보트 버퍼를 비워주는 동작을 실행하고 nextLine() 메소드를 실행한다
		
		//아래 를한번 입력함으로 써 우래의 주석문에서 생긴문제를 해결할수있다.
		sc.nextLine();
		
		String name ="";
		System.out.print("이름을 입력하세요");
		//아래의 경우 Line 으로입력하면 이름은 입력받지못하고 출력된다. 나이를 입력하고 난뒤 엔터키역시 버퍼에 적용되기 때문에 버퍼에남은 엔터(공란)이 입력된다
		name = sc.nextLine();
		
		System.out.println(name + "님은 " + age + "살입니다.");
		
		sc.close();
		
	}
	
}
