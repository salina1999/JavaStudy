package javatutorials.condition;

public class SwitchDemo {

	public static void main(String[] args) {


		System.out.println("switch(1)");
		switch(1) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		default:
			System.out.println("default");
		}
		
		System.out.println("if");
		int val = 1;
		if(val == 1) {
			System.out.println("1");
		} else if(val == 2) {
			System.out.println("2"); 
		} else if(val == 3) {
			System.out.println("3");
		}
		
		System.out.println("switch(2)"); 
		switch(2) {
		case 1:
			System.out.println(1);
		case 2:
			System.out.println(2);
		case 3:
			System.out.println(3);
		}
		
		System.out.println("switch(4)");
		switch(4) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		default:
			System.out.println("default");
		}
		
	}

}
