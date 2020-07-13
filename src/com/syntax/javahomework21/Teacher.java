package com.syntax.javahomework21;
/*
 * Write a Java program called Teacher.  Identify features and behaviour of that Class. 
 * Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher 
 * that would have it their own features and behaviour. Test all 4 classes 
 */
public class Teacher {
    
	String name, lastName, gen, teacher;
	int age;
	
	
	void teach() {
		System.out.println(teacher +" know how to teach.");
	}
	public static void main(String[] args) {
		Teacher a = new Teacher();
	    a.teacher = "All teachers";
	    a.teach();
	    
	    
	    MathTeacher b = new MathTeacher();
	    b.name = "Elena";
	    b.lastName = "Constantin";
	    b.gen = "woman";
	    b.teacher= "Math teacher";
	    b.age = 33;
	    b.uses = "modern methods";
		b.teach();
		b.math();
		b.displayFacts();
		
		ChemistryTeacher c = new ChemistryTeacher("Valentina", "Cojocaru", "woman", "Chemistry teacher", 45);
		c.uses= "experimental methods";
		c.chemistry();
		c.way2();
		
		PianoTeacher d = new PianoTeacher("Eugen", "Doga", "man", "Piano teacher", 35);
		d.uses = "playful methods";
		d.piano();
		d.way3();
	}
}
class MathTeacher extends Teacher{
	 String uses;
	void math() {
		System.out.println("Can teach Math.");
	}
	void way() {
		System.out.println(teacher + " uses "+ uses + " in teaching.");
	}
	void displayFacts() {
		System.out.println(name + " "+ lastName + " is a " + gen + " she is my " + teacher + ". She is " + age + " years old.");
	}
	
}
class ChemistryTeacher extends Teacher{
	
	String uses;
	
	ChemistryTeacher(String name, String lastName, String gen, String teacher, int age){
		this.name = name;
		this.lastName = lastName;
		this.gen = gen;
		this.teacher = teacher;
		this.age = age;
		System.out.println(name + " "+ lastName + " is a " + gen + " she is my " + teacher + ". She is " + age + " years old.");
	}
	
	void chemistry() {
		System.out.println("Can teach Chemistry.");
	}
	void way2() {
		System.out.println(teacher + " uses "+ uses + " in teaching.");
	}
}
class PianoTeacher extends Teacher{
	
	String uses; 
	
	PianoTeacher(String name, String lastName, String gen, String teacher, int age){
		this.name = name;
		this.lastName = lastName;
		this.gen = gen;
		this.teacher = teacher;
		this.age = age;
		System.out.println(name + " "+ lastName + " is a " + gen + " she is my " + teacher + ". She is " + age + " years old.");
	}
	
	void piano() {
		System.out.println("Can teach Piano.");
	}
	void way3() {
		System.out.println(teacher + " uses "+ uses + " in teaching.");
	}
}
