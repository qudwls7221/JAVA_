import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		
// 자바에서는 2가지방식으로 렌덤을 생성시킨다
//		Math : 수학과관련된것들 
		
		// 아래 for문은 1~10 까지 1씩증가시키면서 내부 print 를 반복한다는뜻
		for(int i=1 ; i<=10 ; i++ ) {
			// 주의 ~!!!     int 로 감쌀때 Math 에한번더 괄호로감싼다  *45 를하면 0~44 까지 출력된다 + 1 을 추가해줘야 1~ 45 까지줄력된다
		System.out.println((int) (Math.random() * 45) + 1);
		}
		
		System.out.println("===================");
		
//		최신버정의 Java 기준 아래의 기능을 이용하여 Random 을출력한다
		Random random = new Random();
		for (int  i = 1 ; i <= 10 ; i ++) {
		System.out.println(random.nextInt( 6 ) +1 );
		}
		
	}
	
}
