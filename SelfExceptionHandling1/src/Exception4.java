
public class Exception4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=6;
		if(age<18) {
			throw new YoungerAgeException("Not eligible");
		}
		else {
			System.out.println("You are eligible");
		}
		

	}

}
class YoungerAgeException extends RuntimeException{
	YoungerAgeException(String msg){
		super(msg);
	}
}

