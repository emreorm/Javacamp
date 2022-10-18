
public class Circle {  // Save as "Circle.java"
   // private instance variable, not accessible from outside this class
   public double radius;
   public String color;
   
   // Constructors (overloaded)
   /** Constructs a Circle instance with default value for radius and color */
   public Circle() {  // 1st (default) constructor
      radius = 1.0;
      color = "red";
   }
   
   /** Constructs a Circle instance with the given radius and default color */
   public Circle(double r) {  // 2nd constructor
      radius = r;
      color = "red";
   }
   
   /** Returns the radius */
   public double getRadius() {
     return radius; 
     
     
   }
   public String getColor() {
	   return color;
   }
   
   /** Returns the area of this Circle instance */
   public double getArea() {
	  
	   
      return  radius*radius*Math.PI;
      
   }
}
