import java.util.*;

class Complex {
	int real, img, ansr, ansi;
	void Add (Complex c2)
	{
		real = real + c2.real;
		img = img + c2.img;
		System.out.println("Addition is: " + real + " + i" + img);
	}
	void mult (Complex c2)
	{
		ansr = (real*c2.real - img *c2.img);
		ansi = (real*c2.img+img*c2.real);
		//System.out.println("Multiplication is: " + (real*c2.real - img *c2.img) + " + " + (real*c2.img+img*c2.real) + "i");
		System.out.println("Multiplication is: " + ansr + " + " + ansi + "i");
	}
}	
class ComplexDemo {
	public static void main(String[] args)
	{
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		c1.real = 4;
		c1.img = 3;
		c2.real = 7;
		c2.img = 3;
		c1.Add(c2);
		c1.mult(c2);
	}
}