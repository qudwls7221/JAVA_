import java.util.Scanner;

public class ScannerTest1 {

	public static void main(String[] args) {
		
		// 키보드를 통해서 데이터를 입력받는 스캐너 (input 과 비슷한?)
		Scanner sc = new Scanner(System.in);
		
		// String 방식으로 입력을받는다 변수명은 addr 이다 (변수선언)
		String addr = "";
		
		// 입력을 받기전 물어보는것
		System.out.print("주소를 입력하세요 : ");
		
		//입력받은것은 addr에 입력된다는 뜻이다
		addr = sc.next();
		
		
		String name ="";
		System.out.println("이름을 입력하세요 : ");
		//next() 은 문자열을 입력받는다. (띄어쓰기 전까지)
		//nextLine() 은 한줄전체를 입력받는다.
		//nextLine() 은 메소드는 키보드 버퍼가 비어있을경우 입력을 요구하며 대기하고 키보드 버퍼가 비어있지 않으면 키보트 버퍼 전체의 내용을 읽어들인다
		name = sc.nextLine();
		
		System.out.println(name + "님은" + addr + "에 삽니다");
		
		sc.close();
		
	}
	
}
