package javatutorials.operator;

public class PrePostDemo {

	public static void main(String[] args) {

		// 단항 연산자
		
		int i = 3;
		i++;					 // 선 i값 하고 증감
		System.out.println(i);	 // 4출력
		++i;					 // 선 증감 후 i값
		System.out.println(i);	 // 5출력
		System.out.println(++i); // 6출력
		System.out.println(i++); // 6출력
		System.out.println(i); 	 // 7출력	
		

	}

}
