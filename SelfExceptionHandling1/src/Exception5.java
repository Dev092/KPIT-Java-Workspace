import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception5 {
public static void main(String[] args) {
	System.out.println("Start");
		Test rw=new Test();
		try {
			rw.readFile();
		}catch(FileNotFoundException ex) {
		ex.printStackTrace();
		}
		System.out.println("End");
	}
}
class Test{
	void readFile() throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream("d:/abc.txt");
	}
	
}

