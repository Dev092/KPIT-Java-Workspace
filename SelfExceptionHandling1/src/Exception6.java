class UnderAgeException extends Exception{
	UnderAgeException(){
		super("You are not Eligible");
	}
	UnderAgeException(String message){
		super(message);
	}
}
public class Exception6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=4;
		try {
		if(age<18) {
			throw new UnderAgeException("Self decleared");
		}
		}catch(UnderAgeException e) {
			e.printStackTrace();
		}

	}

}
//public class Exception6 {
//
//	public static void main(String[] args)throws UnderAgeException {
//		// TODO Auto-generated method stub
//		int age=16;
//		if(age<18) {
//			throw new UnderAgeException();
//		}
//
//	}
//
//}
