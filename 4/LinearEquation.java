/* /**
 * Class: CS 501-WS Introduction to JAVA Programming <br />
 * Instructor: M. Jurkat <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
 *  <br />
 *  Assignment: 4
 *  Signed: Kunal Goyal <br />
 */


//package HW4;
public class LinearEquation {

	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	/** Constructor with arguments for a, b, c, d, e, and f */
	LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	
	/** getter method for a */
	public double getA() {
		return a;
	}

	/** getter method for b */
	public double getB() {
		return b;
	}

	/** getter method for c */
	public double getC() {
		return c;
	}

	/** getter method for d */
	public double getD() {
		return d;
	}

	/** getter method for e */
	public double getE() {
		return e;
	}

	/** getter method for f */
	public double getf() {
		return f;
	}

	/** Returns true if ad - bc is not 0 */
	public boolean isSolvable() {
	    
		return (a * d) - (b * c) != 0;
	}

	/** getter method for x */
	public double getX() {
		return (e * d - b * f) / (a * d - b * c);
	}

	/** getter method for y */
	public double getY() {
		return (a * f - e * c) / (a * d - b * c);
	}
}