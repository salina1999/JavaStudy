package javatutorials.constant;

public class ConstantDemo {

	public static void main(String[] args) {
		// 상수: 변하지 않는 값 	(int a = 1에서 1)
		// 변수: 변하는 값 		(int a = 1에서 a)
		
		// 상수형 데이터 타입
		int a = 2147483647;	
		long b = 2147483648L;	
		float c = 2;			// float  : 4byte
		float d = 2.2F;			// 명시적으로 float형으로 지정
		double e = 2.2; 		// double : 8byte
		
		System.out.println(b + d);
		
		// 암시적 형변환
		// byte -> short -> int -> long -> float -> double => 반대순서X 
		// ex) double c = int a + float b 가능
		// int c = float b + double c 불가능 
		
		// 명시적 형변환(수동 형변환)
		// float a = 100.0; -> float a = (float)100.0;
		// int b = (int)100.0F;

	}

}
