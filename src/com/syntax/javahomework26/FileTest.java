package com.syntax.javahomework26;

/*
 * Create a class File that will have the following behaviors: open, edit, close. 
 * Edit and close are implemented method while open is an abstract. 
 * Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific 
 * implementation of open behaviour: Example: to open .java file we need notepad++ or sublime text,
 *  to open .doc file we need Microsoft word to be installed
 */
public class FileTest {  

	public static void main(String[] args) {
	
	File obj = new JavaFile();  // create each one object
	
	    obj.open();
		obj.edit();
		obj.close();
		
	File obj1 = new WordFile();
	    
	    obj1.open();
	    obj1.edit();
		obj1.close();
		
		File obj2 = new PdfFile();
		
		obj2.open();
		obj2.edit();
		obj2.close();
		
  	File[] obj3 = {new JavaFile(), new WordFile(), new PdfFile()};  // create array of File type and use for loop
  	 for (int i = 0; i <obj3.length; i++) {
  		 obj3[i].open();
  		obj3[i].edit();
  		obj3[i].close();
  	 }
  	
  	File[] obj4 = {new JavaFile(), new WordFile(), new PdfFile()};   // create array File type and use enhanced loop
  	
  	for(File f : obj4) {
  		f.open();
  		f.edit();
  		f.close();
  	}
	}
}

abstract class File {
	public abstract void open();

	public void close() {
		System.out.println("Close the file");
	}

	public void edit() {
		System.out.println("Edit the file");
	}
}

class JavaFile extends File {

	public void open() {
		System.out.println("To open .java file we need notepad++ or sublime text");
	}
}

class WordFile extends File {

	public void open() {
		System.out.println("To open open .doc file we need Microsoft word to be installed");
	}
}

class PdfFile extends File {

	public void open() {
		System.out.println("To open open .pdf file we need AdobeReader to be installed");
	}
}