import java.io.*;
import java.lang.*;
import java.net.*;

interface Drawable
{
	void draw();
}

class Rectangle implements Drawable
{
	public void draw(){
		System.out.println("Drawing Rectangle ...");
	}
}

class Circle implements Drawable
{
    public void draw(){
		System.out.println("Drawing Circle ...");
	}
}

public class Int
{
	public static void main(String args[])
	throws IOException
	{
		Drawable r = new Rectangle();
		Drawable c = new Circle();

		r.draw();
		c.draw();
	}
}