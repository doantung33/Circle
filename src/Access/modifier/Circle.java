package Access.modifier;

public class Circle {
    private double radius= 1;
    private String color= "red";
    public double area;
    public Circle (){

    }
    public  Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public void setArea(double area) {
        this.area = area;
    }
    @Override
    public String toString(){
        return "Radius = " +getRadius()+ " and Area = " +getArea();
    }
}
