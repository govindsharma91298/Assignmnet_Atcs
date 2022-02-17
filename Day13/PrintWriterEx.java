package Day13;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx {

	public static void main(String[] args)throws IOException {

		FileWriter fw = new FileWriter("govind.text");
		PrintWriter pw = new PrintWriter(fw);
		 
		pw.println("robert");
		pw.println("Einstein");
		pw.println(23);
		pw.println(89);
		pw.println('g');
		pw.close();
		
		System.out.println("PrintWriter");
		 System.out.println("Values is inserted");
         }
     


	}


