import java.util.Scanner;

class Fraction {
	private int a,b;
	public int gcd(int x, int y)
	{
	    if(y == 0)
	        return x;
	    return gcd(y, x % y);
	}
	public Fraction(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	public double toDouble()
	{
		return a*1.0/b;
	}
	public Fraction plus(Fraction r)
	{
		int a1=this.a*r.b+this.b*r.a;
		int b1=this.b*r.b;
		int k=gcd(a1,b1);
		a1/=k;
		b1/=k;
		Fraction ans = new Fraction(a1,b1);
		return ans;
	}
	public Fraction multiply(Fraction r)
	{
		int a1=this.a*r.a;
		int b1=this.b*r.b;
		int k=gcd(a1,b1);
		a1/=k;
		b1/=k;
		Fraction ans = new Fraction(a1,b1);
		return ans;
	}
	public void print()
	{
		int k=gcd(this.a,this.b);
		this.a/=k;
		this.b/=k;
		if (this.b!=1)
			System.out.println(this.a+"/"+this.b);
		else
			System.out.println(this.a);
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}

}