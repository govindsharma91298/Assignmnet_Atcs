package Day13;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args)throws IOException {
	      FileWriter fw = new FileWriter("govind.txt");
	 	 
	        fw.write("robert");
	        fw.write("Einstein");
	        fw.write(23);
	        fw.write(89);
	        fw.write('s');
	        fw.close();
	   System.out.println("Values is inserted");
	   }
   


	}


