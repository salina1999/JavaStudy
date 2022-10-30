package javatutorials.compare;

public class EqualDemo {

	public static void main(String[] args) {

		// Boolean : 참(true)과 거짓(false)을 의미하는 데이터 타입
		
		// 비교 연산자 (관계 연산자)
		
		// == : EqualDemo
		System.out.println(1 == 2);			// false
		System.out.println(1 == 1);			// true
		System.out.println("one" == "two");	// false
		System.out.println("one" == "one"); // true
		System.out.println("\n");
	
		// != : NotDemo
		System.out.println(1 != 2); 		// true
		System.out.println(1 != 1); 		// false
		System.out.println("one" != "two");	// true
		System.out.println("one" != "one"); // false
		System.out.println("\n");
	
		// > " GreaterTanDemo
		System.out.println(10 > 20); // false
		System.out.println(10 > 2);  // true
		System.out.println(10 > 10); // false
		System.out.println("\n");
		
		// >= : GreaterThanOrEqualDemo
		System.out.println(10 >= 20); // false
		System.out.println(10 >= 2);  // true
		System.out.println(10 >= 10); // true
		System.out.println("\n");
		
		// .equals : 동등비교 연산자
		String a = "Hello word";
		String b = new String("Hello word");
		System.out.println(a == b);			// false: 데이터 위치가 다름
		System.out.println(a.equals(b));	// true: 데이터 위치는 다르지만 값은 같음
	}

}
