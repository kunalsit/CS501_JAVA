class MyRectangle2D extends GeometricObject{

	MyRectangle2D() {
		this(0, 0, 1, 1);
	}
	
	
	MyRectangle2D(double x, double y, double width, double height) {
		setX(x);
		setY(y);
		setWidth(width);
		setHeight(height);
	}
	
	public double getArea() {
		return getWidth() * getHeight();
	}

	public double getPerimeter() {
		return 2 * (getWidth() + getHeight());
	}

	public boolean contains(double x, double y) {
		return getDistance(getY(), y) <= getHeight() / 2 && 
				 getDistance(getX(), x) <= getWidth() / 2; 
	}

	public void overlaps(MyRectangle2D r) {
		int count = 0;
		int insideCount = 0;
		int overlapCount = 0;
		
		System.out.println("\nTriangle Test Results:");
		
        boolean overlaps1=Math.abs(getX() - r.getX()) > Math.abs((getWidth() - r.getWidth()) / 2) && Math.abs(getX() - r.getY()) > Math.abs((getHeight() - r.getHeight()) / 2);
        boolean overlaps2=Math.abs(getX() - r.getX()) < Math.abs((getWidth() + r.getWidth()) / 2) && Math.abs(getY() - r.getY()) < Math.abs((getHeight() + r.getHeight()) / 2);
        
		if(getDistance(getY(), r.getY()) + r.getHeight() / 2 <= getHeight() / 2 && getDistance(getX(), r.getX()) + r.getWidth() / 2 <= getWidth() / 2 && getHeight() / 2 + r.getHeight() / 2 <= getHeight() && getWidth() / 2 + r.getWidth() / 2 <= getWidth()){
		 	count += 1;
		 	insideCount += 1;
		 	System.out.println("This rectangle is inside the base rectangle");
		}else{
			System.out.println("This rectangle is not inside to the base rectangle");
		}
		
		if(overlaps1 && overlaps2){
		    count += 1;
		    overlapCount += 1;
			System.out.println("This rectangle is overlapping the base rectangle");	
			
		}else{
			System.out.println("This rectangle is not overlapping to the base rectangle");
		}
		
		if(insideCount == 1 || (getDistance(r.getY(), getY()) + getHeight() / 2 <= r.getHeight() / 2 && getDistance(r.getX(), getX()) + getWidth() / 2 <= r.getWidth() / 2 && r.getHeight() / 2 + getHeight() / 2 <= r.getHeight() && r.getWidth() / 2 + getWidth() / 2 <= r.getWidth())) { 
			count += 1; 
			System.out.println("This rectangle is abutment to the base rectangle");
		}else if( overlapCount == 0 && (((getX() + getWidth()) >= r.getX()) && (getX() <= (r.getX() + r.getWidth())) && ((getY() + getHeight()) >= r.getY()) && (getY() <= (r.getY() + r.getHeight())))) {
			count += 1; 
			System.out.println("This rectangle is abutment to the base rectangle");
		}else {
			System.out.println("This rectangle is not abutment to the base rectangle"); 
		}
		
		if(count == 0) {
            System.out.println("This rectangle is distinct to the base rectangle");
		}else{
			System.out.println("This rectangle is not distinct to the base rectangle");
		}
		
		System.out.println("----------------------------------End of Test----------------------------------");
	}

	private double getDistance(double p1, double p2) {
		return Math.sqrt(Math.pow(p2 - p1, 2));
	}
}

