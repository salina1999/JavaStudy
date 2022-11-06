package javatutorials.condition;

public class LoginDemo {

	public static void main(String[] args) {

		String id = args[0];
		if(id.equals("egoing")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}

	}

}
/*
 * 실행방법
 * 
 *  1. 입력값을 전달해야댐
 *  2. RUN버튼의 삼각형에서 Run Configurations 클릭
 *  3.new lunch Configuration 으로 새로운거 생성
 *  4. argument에 input값 입력
 * */
