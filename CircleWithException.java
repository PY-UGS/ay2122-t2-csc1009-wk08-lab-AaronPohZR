package CSC1009.wk08_lab;

public class CircleWithException {
    private double radius;

    public CircleWithException(double radius) throws Exception{
        setRadius(radius);
	}
    public void setRadius(double radius) throws Exception {
        if(radius < 0){
            throw new IllegalArgumentException("Radius cannot be a negative number.");
        }
        this.radius = radius;

        if(getArea() > 1000){
            throw new Exception("Area is too big.");
        }
    }
	public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getDiameter() {
        return 2 * radius;
    }
}
