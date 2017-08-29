import java.util.*; 
//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
//using it's name. It aLLows you to specify classes from other packages that can be referenced without qualify them with their package.
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utility classes
//The wild character(*) is used to specify that all classes with that package are available to our program
public class HelloWorld {
//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
//class defines instance and class fields,methods and inner classes as well as specifying the interfaces the class implements and the immediate superclass of the class
//HelloWorld is class name. Java is case in-sensitive which means identifier Hello and hello would different meaning in Java	
	public static void main(String[] args) {
//Java Program processing starts from the main() method which is a mandatory part of every program 		
//static used to prepare a field,method or inner classes as a class field.
//String[] args is actually an array of java.lang.String type and it's name is args here
		
		System.out.println("Hello World");
//System is a final class in java.lang package
//out is a static member field of system class and it's type PrintStream
//println is a method of PrintStream class
//Inside the brackets is value which to be printed		
	}

}
