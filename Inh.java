import java.io.*;
import java.lang.*;
import java.net.*;

class Animal
{
	void eat()
	{
		System.out.println("eating..");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("barking..");
	}
}

public class Inh
{
	public static void main(String args[])
	throws IOException
	{
		Dog dog = new Dog();
		dog.bark();
		dog.eat();
	}
} 
