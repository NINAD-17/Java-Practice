import java.util.*;

class Box {
	double ln, br, ht;
	void volume()
	{
		System.out.println("Volume is: " + ln * br * ht);
		return;
	}
}
class BoxDemo {
	public static void main(String[] args)
	{
		Box b1;
		b1 = new Box();
		Box b2 = new Box();
		b1.ln=3;
		b1.ht = 4;
		b1.br=3;
		b1.volume();
		
		b2.ln=5.5;
		b2.ht = 4.0;
		b2.br=2.2;
		b2.volume();
		Box b3 = new Box();
		b3=b2;
		b3.volume();
	}
}
