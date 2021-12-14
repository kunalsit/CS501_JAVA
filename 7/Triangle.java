public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;

	Triangle() {
		side1 = side2 = side3 = 1.0;
	}

	Triangle(double side1, double side2, double side3) { 
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

    public static boolean checkValidTriangle(double s1, double s2, double s3){
        if (((s1 + s2) > s3) && ((s1 + s3) > s2) && ((s2 + s3) > s1))
            return false;
        else
            return true;
    }
	
	public double getArea() {
	    
		double s = (side1 + side2 + side3) / 2;
		double p = (s * (s - side1) * (s - side2) * (s - side3));
		if(p < 0){
		    return Math.sqrt(p*(-1));
		}else{
		    return Math.sqrt(p);
		}
	}

	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
			" side3 = " + side3;
	}
}