//package HW4;

public class Rectangle {
	double width;	// Width of rectangle
	double height;	// Height of rectangle

	/** A no-arg constructor that creates a default rectangle */
	Rectangle() {
		setWidth(1);
		setHeight(1);
	} 

	/** A constructor that creates a rectangle with the specified width and height    */
	Rectangle(double width, double height) {
		if (width < 0 || height < 0) {
            // Catch exception if value is negative
            throw new IllegalArgumentException("Only Positive Numbers allowed!"); 
		}
		
		setWidth(width);
		setHeight(height);
	}

	/** Return the area of this rectangle */
	double getArea() {
		if (width < 0 || height < 0) {
            // Catch exception if value is negative
            throw new IllegalArgumentException("Only Positive Numbers allowed!"); 
		}
		
	    return (width * height); 
	}

	/** Return the perimeter of this rectangle */
	double getPerimeter() {
		if (width < 0 || height < 0) {
            // Catch exception if value is negative
            throw new IllegalArgumentException("Only Positive Numbers allowed!"); 
		}
		
	    return (2 * (width + height));
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}

}
