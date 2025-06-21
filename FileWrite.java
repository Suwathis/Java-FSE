package FileWrite;

import java.io.File;
import java.io.FileWriter;

class FileWrite {
	public static void main(String[] args) {
		try {
			File f=new File("Example");
			FileWriter fw=new FileWriter(f);
			fw.write("hello");
			fw.close();
			
		}
		catch(Exception E){
			System.out.println(E);
			
		}
		
	}

}
